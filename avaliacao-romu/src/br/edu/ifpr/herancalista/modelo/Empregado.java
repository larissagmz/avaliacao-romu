package br.edu.ifpr.herancalista.modelo;

import br.edu.ifpr.herancalista.utils.DocsUtils;

import java.util.Objects;

public abstract class Empregado {
    private String nome;
    private String cpf;
    private Double salarioBase;

    public Empregado(){}
    public Empregado(String nome, String cpf, Double salarioBase) {
        this.nome = nome;
        this.cpf = cpf;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", cpf='" + DocsUtils.formatCPF(cpf) + '\'' +
                ", salarioBase=" + salarioBase +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empregado empregado = (Empregado) o;
        return salarioBase == empregado.salarioBase && Objects.equals(nome, empregado.nome) && Objects.equals(cpf, empregado.cpf);
    }
}