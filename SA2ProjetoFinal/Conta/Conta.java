package SA2ProjetoFinal.Conta;

import javax.swing.JOptionPane;

public abstract class Conta {

    //aributos básicos
    String nome;
    int nConta;
    double saldo;
    double saque;
    double deposito;

     //métodos
    //gets sets

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getnConta() {
        return nConta;
    }
    public void setnConta(int nConta) {
        this.nConta = nConta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void saque(){
    double saque = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor do Saque"));
        saldo -=saque;
}
    public void deposito(){
    double deposito = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser depositado"));
    saldo +=deposito;
}
}