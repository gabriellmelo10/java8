package br.com.codandosimples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = Arrays.asList(
                new Funcionario("José", 44, 4500),
                new Funcionario("Luana", 23, 2800),
                new Funcionario("Paulo", 17, 1300),
                new Funcionario("Guilherme", 28, 5300),
                new Funcionario("Karina", 32, 4500));

        /**
         * Listar todos os funcionarios com idade acima de 25 anos (filter)
         */
        List<Funcionario> filtro = funcionarios.stream()
                .filter(funcionario -> funcionario.getIdade() > 25)
                .collect(Collectors.toList());
        System.out.println(filtro);
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * Listar os nomes dos func. (map)
         */
        funcionarios.stream()
                .map(Funcionario::getNome)
                .forEach(System.out::println);

        System.out.println();

        List<String> nome = funcionarios.stream()
                .map(Funcionario::getNome)
                .collect(Collectors.toList());
        System.out.println(nome);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * Listar todos os func. salários (map)
         */
        List<Double> salario = funcionarios.stream()
                .map(Funcionario::getSalario)
                .collect(Collectors.toList());
        System.out.println(salario);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * Listar todos os func. sem repeti-los (distinct ou toSet)
         */
        List<Double> salarioDistinc = funcionarios.stream()
                .map(Funcionario::getSalario)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(salarioDistinc);

        System.out.println();

        Set<Double> salarioSet = funcionarios.stream()
                .map(Funcionario::getSalario)
                .collect(Collectors.toSet());
        System.out.println(salarioSet);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * Retornar qualquer func. acima de 18 anos (findAny)
         */
        funcionarios.stream()
                .filter(funcionario -> funcionario.getIdade() > 18)
                .findAny()
                .ifPresent(System.out::println);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();


        /**
         * Qtd de func. com salário acima de 3000 (count)
         */
        long qtd = funcionarios.stream()
                .filter(funcionario -> funcionario.getSalario() > 3000)
                .count();
        System.out.println(qtd);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();
        /**
         * Média de todos os salários (mapToDouble e average)
         */
        double mediaSalarial = funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .average()
                .orElse(0);
        System.out.println(mediaSalarial);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * Soma de todos os salários (mapToDouble e sum)
         */
        double somaSalarial = funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .sum();
        System.out.println(somaSalarial);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * O maior salário (mapToDouble e max)
         */
        double maiorSalario = funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .max()
                .orElse(0);
        System.out.println(maiorSalario);

        System.out.println();

        funcionarios.stream()
                        .max(Comparator.comparing(Funcionario::getSalario))
                        .ifPresent(System.out::println);

        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println();

        /**
         * O menos salário (mapToDouble e min)
         */
        double menorSalario = funcionarios.stream()
                .mapToDouble(Funcionario::getSalario)
                .min()
                .orElse(0);
        System.out.println(menorSalario);

        System.out.println();

        funcionarios.stream()
                .min(Comparator.comparing(Funcionario::getSalario))
                .ifPresent(System.out::println);

    }
}
