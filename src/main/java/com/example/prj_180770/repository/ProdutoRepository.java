package com.example.prj_180770.repository;

import java.util.HashMap;

import com.example.prj_180770.model.Produto;

import org.springframework.stereotype.Repository;

/**
 * ProdutoRepository
 */
@Repository
public class ProdutoRepository{

    public HashMap<Integer, Produto> hm = new HashMap<Integer, Produto>();

    public ProdutoRepository(){
        hm.put(1, new Produto(1, "The Awesome Adventures of Captain Spirit #2", 15.99, 0));
        hm.put(2, new Produto(2, "Call of Duty: Modern Warfarer", 150.99, 102));
        hm.put(3, new Produto(3, "Terraria", 20.99, 99));
        hm.put(4, new Produto(4, "DC Universe Online", 89.99, 65));
        hm.put(5, new Produto(5, "PlanetSide Arena", 14.99, 47));
        hm.put(6, new Produto(6, "Dota 2", 99.89, 98));
        hm.put(7, new Produto(7, "Tomb Raider", 87.55, 14));
        hm.put(8, new Produto(8, "Darksiders", 90.99, 37));
        hm.put(9, new Produto(9, "Star Wars - Jedi Fallen Order", 155.935, 987));
        hm.put(10, new Produto(10, "7 Days to Die", 15.99, 87));
    }

    public Produto getProdutoById(int cod){
        return hm.get(cod);
    }

    public HashMap<Integer, Produto> getProdutos(){
        return hm;
    }
}