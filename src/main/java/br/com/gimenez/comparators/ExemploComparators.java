package br.com.gimenez.comparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploComparators {

    public static void main(String[] args) {
        //COmparator - Usado para definir classes com regras de ordenacao fora da classe domain(usado quando tem várias formas de ordenar o msm objeto)
        //COmparable - Usado para definir regra de ordenacao em uma classe domain
        //permite ordenacao de objetos complexa


        List<Estudante> estudantes = new ArrayList<>();
        estudantes.add(new Estudante("Pedro", 19));
        estudantes.add(new Estudante("Carlos", 23));
        estudantes.add(new Estudante("Mariana", 21));
        estudantes.add(new Estudante("Joao", 18));
        estudantes.add(new Estudante("Thiago", 20));
        estudantes.add(new Estudante("George", 22));
        estudantes.add(new Estudante("Larissa", 21));

        //Ordem de insercao
        System.out.println(estudantes);

        //Ordem normal - lambda
        estudantes.sort((first, second) -> first.getIdade() - second.getIdade());
        System.out.println(estudantes);

        //Ordem reversa - lambda
        estudantes.sort((first, second) -> second.getIdade() - first.getIdade());
        System.out.println(estudantes);


        //Ordem normal
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade));
        System.out.println(estudantes);

        //Ordem reversa
        estudantes.sort(Comparator.comparingInt(Estudante::getIdade).reversed());
        System.out.println(estudantes);

        //Classe utilitaria do java - Ordem natural
        Collections.sort(estudantes); //obriga objeto implementar comparator
        System.out.println(estudantes);

        //Classe utilitaria do java - Ordem reversa
        Collections.sort(estudantes, new EstudanteOrdemIdadeReversaComparator()); //nao obriga o objeto implementar comparator
    }
}
