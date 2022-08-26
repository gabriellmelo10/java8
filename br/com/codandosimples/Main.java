package br.com.codandosimples;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("José", 32, 4500, Arrays.asList("música", "futebol")),
                new Funcionario("Luana", 23, 2800, Arrays.asList("teatro", "academia")),
                new Funcionario("Paulo", 19, 1700, Arrays.asList("vídeo game", "literatura")),
                new Funcionario("Guilherme", 28, 5300, Arrays.asList("música", "pescar")),
                new Funcionario("Karina", 32, 4800, Arrays.asList("surfar", "futebol")),
                new Funcionario("Ana", 19, 1300, Arrays.asList("literatura", "arte")));

        /**
         * Soma de todos os salários (reduce)
         */
        double valorInicial = 0.0;
        BinaryOperator<Double> acumulador = (x, y) -> {
            System.out.println(x + " => " + y);
            return x + y;
        };

        double somaSalarioal = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(valorInicial, acumulador);
        System.out.println(somaSalarioal);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * Listar todos os hobbies dos func.
         */
        List<String> hobbies = funcionarios.stream()
                .flatMap(funcionario -> funcionario.getHobbies().stream())
                .collect(Collectors.toList());
        System.out.println(hobbies);

        System.out.println();

        //Distinct
        List<String> hobbies_I = funcionarios.stream()
                .flatMap(funcionario -> funcionario.getHobbies().stream())
                .distinct()
                .collect(Collectors.toList());
        System.out.println(hobbies_I);

        System.out.println();

        //Set
        Set<String> hobbies_II = funcionarios.stream()
                .flatMap(funcionario -> funcionario.getHobbies().stream())
                .collect(Collectors.toSet());
        System.out.println(hobbies_II);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * Mapear func. por hobbies (chave x valor)
         */
        funcionarios.stream()
                .collect(Collectors.toMap(Funcionario::getNome, Funcionario::getHobbies))
                .forEach((k, v) -> System.out.println(k + " => " + v));

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * Agrupar func. por idade
         */
        Map<Integer, List<Funcionario>> collect = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getIdade));
        System.out.println(collect);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * Agrupar func. por saláiro
         */
        Map<Integer, List<Double>> collect1 = funcionarios.stream()
                .collect(
                        Collectors.groupingBy(Funcionario::getIdade,
                                Collectors.mapping(Funcionario::getSalario, Collectors.toList())));
        System.out.println(collect1);

    }

}
