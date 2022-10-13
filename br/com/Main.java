package br.com.codandosimples;

@FunctionalInterface
interface Taxi {
    void reserva(String origem, String destino);
}

public class Main {
    public static void main(String[] args) {
        Taxi taxi = (origem, destino) -> {
            System.out.println("Taxi reservado. Origem: " + origem + " => Destino: " + destino);
        };
        taxi.reserva("Ribeirão Preto", "Brasília");
    }
}
