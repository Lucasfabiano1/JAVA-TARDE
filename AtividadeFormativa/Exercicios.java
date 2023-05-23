package AtividadeFormativa;

import java.util.Random;
import java.util.Scanner;

public class Exercicios {
    Scanner sc = new Scanner(System.in);
    Random rd = new Random(10);

    public void atvd1() {
        // Crie uma Classe que crie uma Matriz de Linha determinada pelo Usuário e
        // Coluna determinadas pelo Usuário
        // Preencha a Matriz com valores aleatórios entre 0 e 9 e imprimia a matriz
        // Substitua os valores da matriz anterior pelo seguinte sistema: se i>j valor =
        // 1; se i==j valor = 0; se j>i valor = 2
        System.out.println("Informe a quantidade de linhas e a quantidade de colunas ");
        int linha = sc.nextInt();
        int coluna = sc.nextInt();

        int classe[][] = new int[linha][coluna];
        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                classe[i][j] = rd.nextInt(10);
            }
        }
        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                System.out.print(classe[i][j] + " ");
            }
            System.out.println("|");
        }

        for (int i = 0; i < linha; i++) {
            for (int j = 0; j < coluna; j++) {
                if (i > j) {
                    classe[i][j] = 1;
                } else if (i == j) {
                    classe[i][j] = 0;
                } else if (j > i) {
                    classe[i][j] = 2;
                }
            }
        }
        System.out.println("---------------");
        for (int i = 0; i < linha; i++) {
            System.out.print("| ");
            for (int j = 0; j < coluna; j++) {
                System.out.print(classe[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void atvd2() {
        // Crie uma classe que:
        // Sorteie um número de 0 a 1000;
        // Peça um palpite ao usuário. Se ele errar, informe se o palpite é maior ou
        // menor do que o número sorteado.
        // Peça novos palpites até que o usuário acerte e, depois disso, mostre em
        // quantas tentativas ele acertou.
        int nAleatorio = rd.nextInt(1000);
        boolean tenteNovamente = true;
        int cont = 1;
        while (tenteNovamente) {
            System.out.println("Dê um palpite de 0 à 999 ");
            int nPalpite = sc.nextInt();
            if (nAleatorio == nPalpite) {
                System.out.println("PARABÉNS VOCÊ ACERTOU E GANHARÁ UM BELO NADAAAA");
            } else if (nAleatorio != nPalpite) {
                if (nPalpite > nAleatorio) {
                    System.out
                            .println("O palpite está errado, o número " + nPalpite + " é maior que o número sorteado");
                    cont++;
                } else {
                    System.out
                            .println("O palpite está errado, o número " + nPalpite + " é menor que o número sorteado");
                    cont++;
                }
            }
            System.out.println("Você tentou " + cont + " vezes");
        }
    }

    public void atvd3() {
        // Escreva um programa que:
        // Sorteie o tamanho de uma vetor de minimo 100 e máximo 1000
        // Construa o vetor
        // Liste o vetor com números aleatórios de 1 a 100
        // Exiba apenas os números pares do vetor
        // Exiba apenas os números ímpares do vetor
        // Exiba a quantidade de números pares existem nas posições ímpares do vetor
        // Exiba a quantidade de números ímpares existem nas posições pares do vetor

        int lRandow = rd.nextInt(901)+100;
        int[] classe = new int[] {lRandow};
        System.out.println( "1° Posição- Índice [0]:"+ classe[0] );
    }
}
