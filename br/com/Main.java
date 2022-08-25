package br.com.codandosimples;

interface Taxi {
    void reserva();
}

class TaxiImpl implements Taxi {
    @Override
    public void reserva() {
        System.out.println("Taxi reservado");
    }
}

public class Main {

    public static void main(String[] args) {
        TaxiImpl taxi = new TaxiImpl();
        taxi.reserva();
    }
}
