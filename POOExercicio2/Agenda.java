package POOExercicio2;

import javax.swing.JOptionPane;

public class Agenda {
    String nome;
    int idade;
    double altura;
    //metodos
    //construtor com parametros
    public Agenda(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
     //construtor vazio
     public Agenda(){
     }
     //getters and setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
     // imprimir(void)
    public void imprinir(){
        JOptionPane.showMessageDialog(null, "Nome: "+ nome + "Idade: "+ idade+ "Altura: " + altura );
    }
}
