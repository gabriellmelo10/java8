package br.com.codandosimples;

@FunctionalInterface
interface Taxi {
    double reserva(String origem, String destino);
}

public class Main {
    public static void main(String[] args) {
        Taxi taxi = (origem, destino) -> {
            System.out.println("Taxi reservado. Origem: " + origem + " => Destino: " + destino);
            return 80.60;
        };
        double valorReserva = taxi.reserva("Ribeirão Perto", "Brasília");
        System.out.println("Valor da reserva: " + valorReserva);
    }
}
