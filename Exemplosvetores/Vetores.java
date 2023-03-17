package Exemplosvetores;

public class Vetores {
    public void Exemplo1() {
        //Declaração
        double[] valores = new double[]{10.5,20.7,30.6,40.4};
        System.out.println("1º possição- índice[0]: " +valores[0]);
        System.out.println("2º possição- índice[1]: " +valores[1]);
        System.out.println("3º possição- índice[2]: " +valores[2]);
        System.out.println("4º possição- índice[3]: " +valores[3]);
        // Mudando valores de uma posição definida
        valores[0] = 15.6; //Mudando o valor do índice[0]
        System.out.println("1º Possição- índice[0]" + valores);
    }
    public void Exemplo2() {
        //criando o vetor
        int[] novoValores = new int[5];
        novoValores[0] = 10;
        novoValores[1] = 20;
        novoValores[2] = 35;
        novoValores[3] = 67;
        novoValores[4] = 98;
        System.out.println("1º possição- índice[0]: " + novoValores[0]);
        System.out.println("2º possição- índice[1]: " + novoValores[1]); 
        System.out.println("3º possição- índice[2]: " + novoValores[2]);
        System.out.println("4º possição- índice[3]: " + novoValores[3]);
        System.out.println("5º possição- índice[4]: " + novoValores[4]);
    }
    public void Exemplo3() {
              
    }
}
