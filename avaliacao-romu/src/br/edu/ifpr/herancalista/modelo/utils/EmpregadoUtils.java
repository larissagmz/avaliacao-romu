package br.edu.ifpr.herancalista.modelo.utils;

import br.edu.ifpr.herancalista.modelo.Empregado;
import br.edu.ifpr.herancalista.modelo.EmpregadoComissionado;
import br.edu.ifpr.herancalista.modelo.EmpregadoHorista;

public final class EmpregadoUtils {
    public static Double calcularSalárioBruto (Empregado empregado){
        Double salário = 0.0;

        if (empregado instanceof EmpregadoHorista) {
            salário = calcularSalárioHorista((EmpregadoHorista) empregado);
        } else if (empregado instanceof EmpregadoComissionado) {
            salário = calcularSalárioComissionado((EmpregadoComissionado) empregado);
        }

        return salário;
    }

    private static Double calcularSalárioHorista(EmpregadoHorista empregado){
        Double salário = 0.0;

        salário = empregado.getSalarioBase() + (empregado.getValorHora() * empregado.getHorasTrabalhadas());

        return salário;
    }

    private static Double calcularSalárioComissionado(EmpregadoComissionado empregado){
        Double salário = 0.0;

        salário = empregado.getSalarioBase() + (empregado.getVendas() * empregado.getComissão());

        return salário;
    }

}