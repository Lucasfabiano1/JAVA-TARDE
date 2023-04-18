package Vetores;

import java.util.Scanner;

public class Vetores {
    Scanner sc = new Scanner(System.in);

    // criar um vetor com 5 nímeros inteiros
    public void Exercício1() {
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

    public void Exercício2() {
        double vetoresDouble[] = new double[10];// criei um vetor 10 posições vazio
        // preencher o meu vetor
        for (int i = 0; i < vetoresDouble.length; i++) {
            System.out.print("vetor[" + i + "]=");
            vetoresDouble[i] = sc.nextDouble();
        }
        for (int i = 9; i >= 0; i--) {
            System.out.println("vetor[" + i + "]=" + vetoresDouble[i]);
        }
    }

    public void Exercício3() {
        double notaDouble[] = new double[4];
        for (int i = 0; i < notaDouble.length; i++) {
            System.out.print("Informe a nota do aluno[" + (i + 1) + "]=");
            notaDouble[i] = sc.nextDouble();
        }
        double media = 0;
        for (int i = 0; i < notaDouble.length; i++) {
            System.out.println("Notas" + (i + 1) + "=" + notaDouble[i]);
            media += notaDouble[i]; // acumular o valor das notas do vetor
        }
        media /= notaDouble.length;
        System.out.println("A média foi " + media);
    }

    public void Exercício4() {
        String letras[] = new String[] { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j" };
        int cont = 0;
        for (int i = 0; i < letras.length; i++) {
            if (letras[i] != "a" && letras[i] != "e" && letras[i] != "i" && letras[i] != "o" && letras[i] != "u") {
                System.out.println(letras[i] + " é consoante");
                cont++;
            }
        }
        System.out.println("O nº de consoantes é" + cont);
    }

    // contando consoantes de uma palavra
    public void Exercício4Extra() {
        System.out.println("Digite uma palavra");
        String letras = sc.next();
        letras = letras.toLowerCase();
        int cont = 0;
        for (int i = 0; i < letras.length(); i++) {
            char c = letras.charAt(i);
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                System.out.println(c + " é consoante");
                cont++;
            }
        }
        System.out.println("o nº de consoantes é" + cont);
    }

    // 20 nº determonar pares impares e pares em outros vetores
    public void Exercício5() {
        int vetorNumericos[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contPar = 0;
        int contImpar = 0;
        for (int i = 0; i < vetorNumericos.length; i++) {
            if (vetorNumericos[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        int npar[] = new int[contPar];
        int nimpar[] = new int[contImpar];
        contImpar = 0;
        contPar = 0;
        for (int i = 0; i < nimpar.length; i++) {
            if (vetorNumericos[i] % 2 == 0) {
                npar[contPar] = vetorNumericos[i];
                contPar++;
            } else {
                nimpar[contImpar] = vetorNumericos[i];
                contImpar++;
            }
            for (int i = 0; i < nimpar.length; i++) {
                
            }
            for (int i = 0; i < nimpar.length; i++) {
                System.out.println("vetorImpar["+ i + "]="+ nimpar[i]);
            }
        }
    }
}