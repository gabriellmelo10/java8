package br.com.codandosimples;

@FunctionalInterface
interface Taxi {
    void reserva();
}

public class Main {
    public static void main(String[] args) {
        Taxi taxi = () -> {
            System.out.println("Taxi reservado");
        };
        taxi.reserva();
    }
}
