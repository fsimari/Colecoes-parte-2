package br.com.exemplo.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GrupoPessoasSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> grupoMasculino = new ArrayList<>();
        List<String> grupoFeminino = new ArrayList<>();
        List<String> pessoas = new ArrayList<>();
        List<String> listaCompleta = new ArrayList<>();

        String nome, sexo;
        char continuar;

        do {
            System.out.print("Digite o nome: ");
            nome = scanner.nextLine().trim();

            System.out.print("Digite o sexo (M/F): ");
            sexo = scanner.nextLine().trim().toUpperCase();

            if (sexo.equals("M") || sexo.equals("F")) {
                pessoas.add(nome + "-" + sexo); // Armazena no formato "Nome-Sexo"
                listaCompleta.add(nome);        // Adiciona à lista completa
            } else {
                System.out.println("⚠️ Sexo inválido! Use 'M' para Masculino ou 'F' para Feminino.");
            }

            System.out.print("Deseja continuar? (S/N): ");
            continuar = scanner.nextLine().trim().toUpperCase().charAt(0);

        } while (continuar == 'S');

        // Separar os nomes por sexo usando split
        for (String pessoa : pessoas) {
            String[] dados = pessoa.split("-");
            if (dados.length == 2) {
                String nomePessoa = dados[0];
                String sexoPessoa = dados[1];

                if (sexoPessoa.equals("M")) {
                    grupoMasculino.add(nomePessoa);
                } else if (sexoPessoa.equals("F")) {
                    grupoFeminino.add(nomePessoa);
                }
            }
        }

        // Ordenar as listas
        Collections.sort(listaCompleta); // Ordena a lista completa
        Collections.sort(grupoMasculino); // Ordena os grupos
        Collections.sort(grupoFeminino);

        scanner.close();

        // Exibindo as listas
        System.out.println("\nLista de nomes (Alfabético): " + String.join(", ", listaCompleta));
        System.out.println("👨 Grupo Masculino (Ordenado): " + grupoMasculino);
        System.out.println("👩 Grupo Feminino (Ordenado): " + grupoFeminino);
    }
}
