package com.example.prj_180770.service;

import java.util.HashMap;

import com.example.prj_180770.model.Produto;
import com.example.prj_180770.repository.ProdutoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ProdutoService
 */
@Service
public class ProdutoService{

    @Autowired
    private ProdutoRepository pr;

    public Produto getProduto(int id){
        Produto p = pr.getProdutoById(id);

        if(p == null){
            return null;
        }
        return p;
    }
    public HashMap<Integer, Produto> getProdutosEmEstoque(){
        HashMap<Integer, Produto> h = pr.getProdutos();

        for(Integer i : h.keySet()){
            if(h.get(i).getEstoque() <= 0)
                h.remove(i);
        }
        return h;
    }

    public HashMap<Integer, Produto> getProdutosByValorAcima(double valor){
        HashMap<Integer, Produto> h = pr.getProdutos();

        for(Integer i : h.keySet()){
            if(h.get(i).getValor() < valor)
                h.remove(i);
        }
        return h;
    }

    public HashMap<Integer, Produto> getProdutosByValorAbaixo(double valor){
        HashMap<Integer, Produto> h = pr.getProdutos();

        for(Integer i : h.keySet()){
            if(h.get(i).getValor() > valor)
                h.remove(i);
        }
        return h;
    }
}