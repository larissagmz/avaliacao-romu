package br.edu.ifpr.herancalista.utils;

public class DocsUtils {

    public static StringBuilder formatCPF(String cpf) {

        StringBuilder sb = new StringBuilder(cpf);

        sb.insert(3, ".");
        sb.insert(7, ".");
        sb.insert(11, "-");

        return sb;
    }
}
