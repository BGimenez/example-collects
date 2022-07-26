package br.com.gimenez.queue;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {

        //Garante a ordem de insercao.
        //Primeiro que entra é o primeiro que sai.
        Queue<String> filaBanco = new LinkedList<>();

        filaBanco.add("Patricia");
        filaBanco.add("Roberto");
        filaBanco.add("Flavio");
        filaBanco.add("Pamela");
        filaBanco.add("Anderson");

        System.out.println(filaBanco);

        //Tras o primeiro registro e o retira da lista.
        String clienteSeraAtendido = filaBanco.poll();
        System.out.println(clienteSeraAtendido);
        System.out.println(filaBanco);

        //O mesmo do anterior porém nao remove. Se fila vazia, retorna null.
        String primeiroCliente = filaBanco.peek();
        System.out.println(primeiroCliente);
        System.out.println(filaBanco);

//        filaBanco.clear();
        //O mesmo do anterior porém retorna exception.
        String primeiroOuErro = filaBanco.element();
        System.out.println(primeiroOuErro);
        System.out.println(filaBanco);

        for (String cliente : filaBanco) {
            System.out.println(cliente);
        }

        Iterator<String> clienteIterator = filaBanco.iterator();
        while (clienteIterator.hasNext()){
            System.out.println("---->" + clienteIterator.next());
        }

        System.out.println(filaBanco.size());

    }
}
