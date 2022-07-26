package br.com.gimenez.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> notasAlunos = new LinkedHashSet<>();

        notasAlunos.add(5);
        notasAlunos.add(6);
        notasAlunos.add(7);
        notasAlunos.add(10);
        notasAlunos.add(3);
        notasAlunos.add(8);

        //Mantem a ordem de insercao
        System.out.println(notasAlunos);

        //Remove nota
        notasAlunos.remove(7);
        System.out.println(notasAlunos);

        System.out.println(notasAlunos.size());

        Iterator<Integer> iterator = notasAlunos.iterator();
        while (iterator.hasNext()) {
            System.out.println("-->" + iterator.next());
        }
        
    }
}
