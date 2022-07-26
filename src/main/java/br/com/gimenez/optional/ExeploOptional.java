package br.com.gimenez.optional;

import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExeploOptional {
    public static void main(String[] args) {
        //2 estados - Presente ou Vazio
        //Utilizado para tratamento de valores que podem ser nulos

        Optional<String> optString = Optional.of("Valor presente");

        //exibe o valor esta presente
        optString.ifPresentOrElse(System.out::println, () -> System.out.println("Nao esta presente"));

        //exibe o valor nao esta presente
        Optional<String> optNull = Optional.ofNullable(null);
        optString.ifPresentOrElse(System.out::println, () -> System.out.println("null = Nao esta presente"));

        //exibe o valor nao esta presente
        Optional<String> optEmpty = Optional.empty();
        optString.ifPresentOrElse(System.out::println, () -> System.out.println("empty = Nao esta presente"));

        //exibe o valor nao esta presente
        Optional<String> optNullErro = Optional.of(null);
        optString.ifPresentOrElse(System.out::println, () -> System.out.println("erro = Nao esta presente"));

        //Primitivos
        OptionalInt.of(12).ifPresent(System.out::println);

        OptionalDouble.of(55.2).ifPresent(System.out::println);

        OptionalLong.of(23L).ifPresent(System.out::println);

        //Exemplos
        Optional<String> stringOpt = Optional.of("Valor opcional");
        System.out.println(stringOpt.isPresent());
        System.out.println(stringOpt.isEmpty());

        stringOpt.ifPresent(System.out::println);
        stringOpt.ifPresentOrElse(System.out::println,
                () -> System.out.println("Valor nao esta presente"));

        if ( stringOpt.isPresent()){
            String valor = stringOpt.get();
            System.out.println(valor);
        }

        stringOpt.map((valor) -> valor.contains("****")).ifPresent(System.out::println);

        stringOpt.orElseThrow(IllegalArgumentException::new);

    }
}
