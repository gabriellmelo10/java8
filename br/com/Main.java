package br.com.codandosimples;

interface Veiculo {
    String getModelo();
    void acelerar();
    void desacelerar();

    default String ligarAlarme() {
        return "Ligando o alarme do veículo";
    }

    default String desligarAlarme() {
        return "Desligando o alarme do veículo";
    }

    static int calcularCavalosDePotencia(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }
}

interface Alarme {
    default String ligarAlarme() {
        return "Ligando o alarme do veículo";
    }

    default String desligarAlarme() {
        return "Desligando o alarme do veículo";
    }
}

class Carro implements Veiculo, Alarme {

    private String modelo;

    public Carro(String modelo) {
        this.modelo = modelo;
    }


    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }

    @Override
    public void desacelerar() {
        System.out.println("O carro está desacelerando");
    }

    @Override
    public String ligarAlarme() {
        return Veiculo.super.ligarAlarme();
    }

    @Override
    public String desligarAlarme() {
        return Alarme.super.desligarAlarme();
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Porche");
        System.out.println(carro.getModelo());

        carro.acelerar();
        carro.desacelerar();

        System.out.println(carro.ligarAlarme());
        System.out.println(carro.desligarAlarme());

        System.out.println(Veiculo.calcularCavalosDePotencia(2500, 480));
    }
}
