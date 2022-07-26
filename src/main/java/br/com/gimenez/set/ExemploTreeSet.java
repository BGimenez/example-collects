package br.com.gimenez.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ExemploTreeSet {
    public static void main(String[] args) {
        TreeSet<String> treeCapitais = new TreeSet<>();

        //Arvore binaria
        //Ao modificar dispara a rotina de ordenacao
        treeCapitais.add("Porto Alegre");
        treeCapitais.add("Florianópolis");
        treeCapitais.add("Curitiba");
        treeCapitais.add("São Paulo");
        treeCapitais.add("Rio de Janeiro");
        treeCapitais.add("Belo Horizonte");

        //Ordena de acordo com algoritmo proprio
        System.out.println(treeCapitais);

        //Retorna a primeira capital no topo da arvore
        System.out.println(treeCapitais.first());

        //Retorna a ultima capital no final da arvore
        System.out.println(treeCapitais.last());

        //Retorna a primeira capital abaixo da árvore da capital informada
        System.out.println(treeCapitais.lower("Florianopolis"));

        //Retorna a primeira capital acima da árvore da capital informada
        System.out.println(treeCapitais.higher("Florianopolis"));

        //Retorna a primeira capital no topo da arvore e remove
        System.out.println(treeCapitais.pollFirst());

        //Retorna a primeira capital no final da arvore e remove
        System.out.println(treeCapitais.pollLast());

        System.out.println(treeCapitais);

        Iterator<String> iterator = treeCapitais.iterator();
        while (iterator.hasNext()) {
            System.out.println("-->" + iterator.next());
        }
        
    }
}
