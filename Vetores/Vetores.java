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
        int vetorNumeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int contPar = 0;// contador de nº Pares
        int contImpar = 0;// contador de nº Impares
        // percorrer o meu vetor e contar os nº pares e Impares
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
        }
        int nPar[] = new int[contPar];
        int nImpar[] = new int[contImpar];
        // distribuir os nº nos vetores Par e Impar
        contPar = 0;
        contImpar = 0;
        for (int i = 0; i < vetorNumeros.length; i++) {
            if (vetorNumeros[i] % 2 == 0) { // se nº for Par
                nPar[contPar] = vetorNumeros[i];
                contPar++;// acréscimo do contador
            } else { // se nº for Impar
                nImpar[contImpar] = vetorNumeros[i];
                contImpar++;// acréscimo do contador
            }
        }
        // Imprimindo os vetores
        for (int i = 0; i < vetorNumeros.length; i++) {
            System.out.println("vetor[" + i + "]=" + vetorNumeros[i]);
        }
        for (int i = 0; i < nPar.length; i++) {
            System.out.println("vetorPar[" + i + "]=" + nPar[i]);
        }
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println("vetorImpar[" + i + "]=" + nImpar[i]);
        }
    }
    public void Exercício5ganb() {
        int numeros[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
        int nPar[] = new int[numeros.length] ;
        int nImpar[] = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                nPar[i] = numeros[i];
            } else {
                nImpar[i] = numeros[i];
            }
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("vetor[" + i + "]=" + numeros[i]);
        }
        for (int i = 0; i < nPar.length; i++) {
            System.out.println("vetorPar[" + i + "]=" + nPar[i]);
        }
        for (int i = 0; i < nImpar.length; i++) {
            System.out.println("vetorImpar[" + i + "]=" + nImpar[i]);
        }
    }
    public void exercicio6() {
        double mediasAlunos[]= new double[3];
        double notasAlunos[]= new double[4];
        int cont = 0;
        for (int i = 0; i < mediasAlunos.length; i++) {
            for (int j = 0; j < notasAlunos.length; j++) {
                System.out.println("Informe a Nota "+(j+1)+" do Aluno "+(i+1)+":");
                notasAlunos[j]=sc.nextDouble();
                mediasAlunos[i]+=notasAlunos[j];
            }
            mediasAlunos[i]/=notasAlunos.length;
            if (mediasAlunos[i]>=7){
                cont++;
            }
        }
        for (int i = 0; i < mediasAlunos.length; i++) {
            System.out.println(" a média do Aluno "+(i+1)+" é :"+mediasAlunos[i]);
        }
        System.out.println("O nº de alunos com Nota >=7 é "+ cont);
    }
}