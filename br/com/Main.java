package br.com.codandosimples;

interface Taxi {
    void reserva();
}

/**
 * Implementando classe anonima
 */
public class Main {

    public static void main(String[] args) {
        Taxi taxi = new Taxi() {
            @Override
            public void reserva() {
                System.out.println("Taxi reservado");
            }
        };
        taxi.reserva();
    }
}



