package br.com.codandosimples;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Contato> contatos = Arrays.asList(
                new Contato("Rodrigo", "Curitiba"),
                new Contato("Ana", "Campinas"),
                new Contato("Luiz", "Campinas"),
                new Contato("Carla", "Bauru"));

        contatos.stream()
                .filter(contato -> contato.getCidade().equalsIgnoreCase("Campinas"))
                .forEach(System.out::println);

    }
}
