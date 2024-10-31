package br.edu.ifpr.herancalista.modelo;

import java.util.Objects;

public class EmpregadoHorista extends Empregado{
    private int horasTrabalhadas;
    private double valorHora;
    private Empregado empregado;

    // Contrustors, Default and normal
    public EmpregadoHorista(){}
    public EmpregadoHorista(String nome, String cpf, Double salarioBase, int horasTrabalhadas, double valorHora, Empregado empregado) {
        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
        this.empregado = empregado;
    }

    //Getters & Setters
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }

    // ToString
    @Override
    public String toString() {
        return "EmpregadoHorista{" +
                "horasTrabalhadas=" + horasTrabalhadas +
                ", valorHora=" + valorHora +
                ", empregado=" + empregado +
                '}';
    }

    // Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EmpregadoHorista that = (EmpregadoHorista) o;
        return horasTrabalhadas == that.horasTrabalhadas && Double.compare(valorHora, that.valorHora) == 0 && Objects.equals(empregado, that.empregado);
    }
}