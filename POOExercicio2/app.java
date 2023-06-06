package POOExercicio2;

import java.util.Random;

import javax.swing.JOptionPane;

public class app {
    public static void main(String[] args) {
        Random rd = new Random();
        //criar um vetor para 10 objetos
        Agenda contato[] = new Agenda[10];
        //criar os objetos e preencher os atributos do obejeto
        for (int i = 0; i < contato.length; i++) {
            //criar o objeto - construtor
            contato[i] = new Agenda();
            //preencher atributos (set)
            contato[i].setNome(JOptionPane.showInputDialog(
                "Digite o Nome:"));
            contato[i].setAltura(rd.nextDouble(1.5,2));
            contato[i].setIdade(i+18);
        }
        //criar um metodos para busca uma pessoa do array
        String buscarNome = JOptionPane.showInputDialog(
            "Informe o nome a ser Buscado");
        boolean busca = true;
        int cont=0;
        while(busca){
            if(buscarNome.equals(contato[cont].getNome())){
                busca = false;
                contato[cont].imprinir();
            }
            cont++;
        }
    }
}
