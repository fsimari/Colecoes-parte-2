package br.com.exemplo.colecoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GrupoPessoas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();

        String nome, sexo;
        char continuar;

        do {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine();

            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.nextLine().trim().toUpperCase();

            if (sexo.equals("M")) {
                grupoMasculino.add(nome);
            } else if (sexo.equals("F")) {
                grupoFeminino.add(nome);
            } else {
                System.out.println("⚠️ Sexo inválido! Use 'M' para Masculino ou 'F' para Feminino.");
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.nextLine().trim().toUpperCase().charAt(0);

        } while (continuar == 'S');

        scanner.close();

        System.out.println("\n👨 Grupo Masculino: " + grupoMasculino);
        System.out.println("👩 Grupo Feminino: " + grupoFeminino);
    }
}
