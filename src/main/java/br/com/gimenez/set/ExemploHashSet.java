package br.com.gimenez.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExemploHashSet {
    public static void main(String[] args) {
        Set<Double> notasAlunos = new HashSet<>();

        notasAlunos.add(5.0);
        notasAlunos.add(6.2);
        notasAlunos.add(7.0);
        notasAlunos.add(10.0);
        notasAlunos.add(3.0);
        notasAlunos.add(8.0);

        //A ordem a ser exibida nao é a mesma da inserida
        System.out.println(notasAlunos);

        //Remove nota
        notasAlunos.remove(7.0);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        Iterator<Double> iterator = notasAlunos.iterator();
        while (iterator.hasNext()) {
            System.out.println("-->" + iterator.next());
        }

    }
}
