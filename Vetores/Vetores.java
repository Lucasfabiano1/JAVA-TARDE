package Vetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    // criar um vetor com 5 nímeros inteiros
    public void Exemplo1() {
        int vetoresInt[] = new int[5];
        int vetor2[] = new int[] { 1, 2, 3, 4, 5 };
        // preenchendo o Vetor 1º
        System.out.println("Preencha o vetor de 5 posições");
        vetoresInt[0] = sc.nextInt(); // 1º posição indice 0
        vetoresInt[1] = sc.nextInt(); // 2º posição indice 1
        vetoresInt[2] = sc.nextInt(); // 3º posição indice 2
        vetoresInt[3] = sc.nextInt(); // 4º posição indice 3
        vetoresInt[4] = sc.nextInt(); // 5º posição indice 4
        System.out.println("O valor da 1º posição indice 0 é " + vetoresInt[0]);
        System.out.println("O valor da 2º posição indice 0 é " + vetoresInt[1]);
        System.out.println("O valor da 3º posição indice 0 é " + vetoresInt[2]);
        System.out.println("O valor da 4º posição indice 0 é " + vetoresInt[3]);
        System.out.println("O valor da 5º posição indice 0 é " + vetoresInt[4]);
    }

    public void Exemplo2() {
        double vetoresDouble[] = new double[10];
       for (int i = 0; i < vetoresDouble.length; i++) {
        system.out.println("");
        vetoresDouble[i];
       }


    }

    // 1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo
    // tipo e tamanho e com os "mesmos" elementos do
    // vetor A, ou seja, B[i] = A[i].
    public void exercicio1() {
        int vetoresInt[] = new int[5];
        int vetoresInt2[] = new int[5];
        System.out.println("Preencha os vetores de 5 posições de A e verifique se os valores são os mesmo que B");
        vetoresInt[0] = vetoresInt2[0] = sc.nextInt();
        vetoresInt[1] = vetoresInt2[1] = sc.nextInt();
        vetoresInt[2] = vetoresInt2[2] = sc.nextInt();
        vetoresInt[3] = vetoresInt2[3] = sc.nextInt();
        vetoresInt[4] = vetoresInt2[4] = sc.nextInt();
        System.out.println("os valores de A e B são respectivamente "+vetoresInt );
    }
}
