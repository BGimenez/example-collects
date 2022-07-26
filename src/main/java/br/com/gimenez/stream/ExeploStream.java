package br.com.gimenez.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExeploStream {
    public static void main(String[] args) {
        //Manipulacao de colecoes com paradigma funcional paralela
        //Imutavel - nao altera a colecao origem, sempre cria nova

        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        //Contagem dos elementos
        System.out.println(estudantes.stream().count());

        //Elemento com maior numero de letras
        System.out.println(estudantes.stream().max(Comparator.comparingInt(String::length)));

        //Elemento com menor numero de letras
        System.out.println(estudantes.stream().min(Comparator.comparingInt(String::length)));

        //Elementos que contem letra R no nome
        System.out.println(estudantes.stream().filter(estudante -> estudante.toLowerCase().contains("r")).collect(Collectors.toList()));

        //Concatena os nomes com quantidade de letras
        System.out.println(estudantes.stream().map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));

        //Retorna 3 primeiros
        System.out.println(estudantes.stream().limit(3).collect(Collectors.toList()));

        //Exibe cada elemento e depois retorna a mesma colecao
        System.out.println("retorna" + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));

        //Exibe cada elemento sem retornar
        estudantes.stream().forEach(System.out::println);

        //Verifica se TODOS os elementos possuem letra W
        System.out.println(estudantes.stream().allMatch(estudante -> estudante.contains("w")));

        //Verifica se nenhum os elementos possuem letra W
        System.out.println(estudantes.stream().anyMatch(estudante -> estudante.contains("a")));

        //Exibe o primeiro elemento
        estudantes.stream().findFirst().ifPresent(System.out::println);

        //Operacao encadeada
        System.out.println(estudantes.stream()
                .peek(System.out::println)
                .map(est -> est.concat(" - ").concat(String.valueOf(est.length())))
                .peek(System.out::println)
                .filter((est) -> est.toLowerCase().contains("r"))
//                .collect(Collectors.toList())
//                .collect(Collectors.joining(","))
//                .collect(Collectors.toSet())
                .collect(Collectors.groupingBy(est -> est.substring(est.indexOf("-") + 1)))
        );

    }
}
