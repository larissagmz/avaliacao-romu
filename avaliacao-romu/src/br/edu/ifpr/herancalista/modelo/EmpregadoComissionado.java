package br.edu.ifpr.herancalista.modelo;

import br.edu.ifpr.herancalista.modelo.utils.EmpregadoUtils;

import java.util.Objects;

public class EmpregadoComissionado extends Empregado {
    private double comissão;
    private int vendas;
    private Empregado empregado;

    public EmpregadoComissionado() {}
    public EmpregadoComissionado(String nome, String cpf, Double salarioBase, double comissão, int vendas, Empregado empregado) {
        super(nome, cpf, salarioBase);
        this.comissão = comissão;
        this.vendas = vendas;
        this.empregado = empregado;
    }

    public double getComissão() {
        return comissão;
    }

    public void setComissão(double comissão) {
        this.comissão = comissão;
    }

    public int getVendas() {
        return vendas;
    }

    public void setVendas(int vendas) {
        this.vendas = vendas;
    }

    public Empregado getEmpregado() {
        return empregado;
    }

    public void setEmpregado(Empregado empregado) {
        this.empregado = empregado;
    }


    @Override
    public String toString() {
        return "EmpregadoComissionado{" +
                "comissão=" + comissão +
                ", vendas=" + vendas +
                ", empregado=" + empregado +
                "salário = "+ EmpregadoUtils.calcularSalárioBruto(empregado) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EmpregadoComissionado that = (EmpregadoComissionado) o;
        return Double.compare(comissão, that.comissão) == 0 && vendas == that.vendas && Objects.equals(empregado, that.empregado);
    }
}