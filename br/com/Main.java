package br.com.codandosimples;

@FunctionalInterface
interface Taxi {
        void reserva(String origem);
        }

public class Main {
    public static void main(String[] args) {
        Taxi taxi = (origem) -> {
            System.out.println("Taxi reservado. Origem: " + origem);
        };
        taxi.reserva("Ribeirao Perto");
    }
}
