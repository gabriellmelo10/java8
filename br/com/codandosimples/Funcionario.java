package br.com.codandosimples;

import java.util.List;

public class Funcionario {
    private String nome;
    private Integer idade;
    private double salario;
    private List<String> hobbies;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer idade, double salario, List<String> hobbies) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.hobbies = hobbies;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    @Override
    public String toString() {
        return
                "nome='" + nome;
    }
}
