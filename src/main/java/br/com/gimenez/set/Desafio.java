package br.com.gimenez.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Desafio {
    public static void main(String[] args) {
        desafioHashSet();
        desafioLinkedSet();
        desafioTreeSet();
    }

    public static void desafioHashSet() {
        HashSet<Integer> numeros = new HashSet<>();

        //Add numbers
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //Print each number
        numeros.forEach(System.out::println);

        //Remove first number
        numeros.remove(numeros.toArray()[0]);

        numeros.add(23);

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());
    }

    public static void desafioLinkedSet() {
        LinkedHashSet<Integer> numeros = new LinkedHashSet<>();

        //Add numbers
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //Print each number
        numeros.forEach(System.out::println);

        //Remove first number
        numeros.remove(3);

        numeros.add(23);

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());
    }

    public static void desafioTreeSet() {
        TreeSet<Integer> numeros = new TreeSet<>();

        //Add numbers
        numeros.add(3);
        numeros.add(88);
        numeros.add(20);
        numeros.add(44);
        numeros.add(3);

        //Print each number
        numeros.forEach(System.out::println);

        //Remove first number
        numeros.pollFirst();

        numeros.add(23);

        System.out.println(numeros.size());

        System.out.println(numeros.isEmpty());
    }
}
