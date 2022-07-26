package br.com.gimenez.list;

import java.util.*;

public class ExemploList {

    public static void main(String[] args) {
        //Garante ordem de inserção
        //Permite adição, atualização, leitura e remoção
        //Permite ordenação
        List<String> nomes = new ArrayList<>();

        nomes.add("Carlos");
        nomes.add("Pedro");
        nomes.add("Juliana");
        nomes.add("Anderson");
        nomes.add("Maria");
        nomes.add("João");

        System.out.println(nomes);

        //Simple order
        Collections.sort(nomes);
        System.out.println(nomes);

        //Set value in index position
        nomes.set(2, "Larissa");
        System.out.println(nomes);

        //Remove with index
        nomes.remove(4);
        System.out.println(nomes);

        //Remove with object
        nomes.remove("João");
        System.out.println(nomes);

        //Get element with index
        String nome = nomes.get(1);
        System.out.println(nome);
        //System.out.println(nomes.get(10)); //index out a bound

        //Verify position element (-1 not exists element in list)
        int posicao = nomes.indexOf("Maria");
        System.out.println(posicao);

        //Size list
        System.out.println(nomes.size());

        //Verify exist element in list
        System.out.println(nomes.contains("Carlos"));
        System.out.println(nomes.contains("Fernando"));

        //Navigate into elements
        for (String nomeItem : nomes) {
            System.out.println("---> " + nomeItem);
        }

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) { //if more 1 element
            System.out.println("----> "+ iterator.next()); //return element
        }



        //Verify empty
        System.out.println(nomes.isEmpty());

        //Clear list
        nomes.clear();
        System.out.println(nomes.isEmpty());

    }
}
