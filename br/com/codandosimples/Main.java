package br.com.codandosimples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Contato> contatos = Arrays.asList(
                new Contato("Rodrigo", "Curitiba"),
                new Contato("Ana", "Campinas"),
                new Contato("Luiz", "Campinas"),
                new Contato("Carla", "Bauru"));

        List<Contato> filtro = contatos.stream()
                .filter(contato -> contato.getCidade().equalsIgnoreCase("Campinas"))
                //.collect(Collectors.toList());
                .collect(Collectors.toCollection(ArrayList::new));

        System.out.println(filtro);

    }
}
