package br.com.gimenez.list;

import java.util.List;
import java.util.Vector;

public class ExemploVector {
    public static void main(String[] args) {
        List<String> esportes = new Vector<>();

        //Add 4 items
        esportes.add("Futebol");
        esportes.add("Basquetebol");
        esportes.add("Tênis de Mesa");
        esportes.add("Volei");

        //Change value in index 2
        esportes.set(2, "Ping Pong");

        //Remove item in index 2
        esportes.remove(2);

        //Remove item with object
        esportes.remove("Volei");

        //Return first item
        System.out.println(esportes.get(0));

        //Navigate into list
        for (String esporte : esportes) {
            System.out.println("--->" + esporte);
        }
    }
}
