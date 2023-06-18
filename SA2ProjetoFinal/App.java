package SA2ProjetoFinal;

import javax.swing.JOptionPane;

import SA2ProjetoFinal.Conta.ContaPF;
import SA2ProjetoFinal.Conta.ContaPJ;

public class App {

    public static void main(String[] args) {
        // criar um vetor das contas
        ContaPF clientePf[] = new ContaPF[10];// cleintes pf
        ContaPJ clientePj[] = new ContaPJ[10];// cliente pj
        boolean aberta = true;
        int contPf = 0;
        int contPj = 0;
        while (aberta) {
            int acao = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma ação:"
                    + "\n 1-Criar Conta;"
                    + "\n 2-Acessar Conta;"));
            if (acao == 1) { // criar a conta

                int opcaoConta = Integer.parseInt(JOptionPane.showInputDialog("Escolha sua conta a ser criada:"
                        + "\n 1-Pessoa Fisica;"
                        + "\n 2-Pessoa Júridica;"
                        + "\n 3-Sair."));

                if (opcaoConta == 1) {// criar física

                    // criar um objeto (construtor)
                    clientePf[contPf] = new ContaPF();// obj/conta esta criado
                    // preencher as informações da conta
                    clientePf[contPf].setNome(JOptionPane.showInputDialog("Digite o Nome do Cliente"));
                    clientePf[contPf].setnCpf(JOptionPane.showInputDialog("Informe o CPF do Cliente"));
                    clientePf[contPf].setSaldo(0);
                    clientePf[contPf].setnConta(1000 + contPf + 1);
                    //imprimir
                     JOptionPane.showMessageDialog(null, "O número da sua conta é " +clientePf[contPf].getnConta()+ " \n Não compartilhe com ninguém");
                    // acrescimo do contador
                    contPf++;

           
        

                } else if (opcaoConta == 2) { // criar juridica
                    // criar um objeto (construtor)
                    clientePj[contPj] = new ContaPJ();// obj/conta esta criado
                    // preencher as informações da conta
                    clientePj[contPj].setNome(JOptionPane.showInputDialog("Digite o Nome da empresa"));
                    clientePj[contPj].setnCnpj(JOptionPane.showInputDialog("Informe o CNPJ da empresa"));
                    clientePj[contPj].setSaldo(0);
                    clientePj[contPj].setnConta(2000 + contPj + 1);
                    //imprimir
                     JOptionPane.showMessageDialog(null, "O número da sua conta é " +clientePj[contPj].getnConta()+ " \n Não compartilhe com ninguém");
                     
                    // acrescimo do contador
                    contPf++;
                }

            } else if (acao == 2) { // acessar a conta
                int opcaoConta2 = Integer.parseInt(JOptionPane.showInputDialog("Escolha sua conta:"
                        + "\n 1-Pessoa Fisica;"
                        + "\n 2-Pessoa Júridica;"
                        + "\n 3-Sair."));

                if (opcaoConta2 == 1) {// acessar física

                    // buscar a conta no vetor
                    int nContaBuscada = Integer
                            .parseInt(JOptionPane.showInputDialog("Informe o nº da Conta a ser buscada:"));
                    int contaAtual = 0;
                    for (int i = 0; i < clientePf.length; i++) {
                        if (nContaBuscada == clientePf[i].getnConta()) {
                            // encontrei a posição da conta no vetor
                            // preciso guardar o "i"
                            contaAtual = i;
                            JOptionPane.showMessageDialog(null, "Cliente Encontrado");
                            break;
                        }
                    }
                    // entrar na conta do cliente
                    boolean acessar = true;
                    while (acessar) {
                        int i=0;
                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Informe a ação desejada"
                                        + "\n 1-verificar saldo"
                                        + "\n 2-Saque"
                                        + "\n 3-Depósito"));
                        if (acao2 == 1) {
                            JOptionPane.showMessageDialog(
                                    null, clientePf[contaAtual].getSaldo());
                        }else if(acao2==2){
                            clientePf[i].saque();
                        }else if(acao2==3){
                            clientePf[i].deposito();
                        }
                    }
                } else if (opcaoConta2 == 2) { // acessar juridica
                    // buscar a conta no vetor
                    int nContaBuscada = Integer
                            .parseInt(JOptionPane.showInputDialog("Informe o nº da Conta a ser buscada:"));
                    int contaAtual = 0;
                    for (int i = 0; i < clientePj.length; i++) {
                        if (nContaBuscada == clientePj[i].getnConta()) {
                            // encontrei a posição da conta no vetor
                            // preciso guardar o "i"
                            contaAtual = i;
                            JOptionPane.showMessageDialog(null, "Cliente Encontrado");
                            break;
                        }
                    }
                    // entrar na conta do cliente
                    boolean acessar = true;
                    while (acessar) {
                        int i=0;
                        int acao2 = Integer.parseInt(JOptionPane.showInputDialog(
                                "Informe a ação desejada"
                                        + "\n 1-verificar saldo"
                                        + "\n 2-Saque"
                                        + "\n 3-Depósito"));
                        if (acao2 == 1) {
                            JOptionPane.showMessageDialog(
                                    null, clientePj[contaAtual].getSaldo());
                        }else if(acao2==2){
                            clientePj[i].saque();
                        }else if(acao2==3){
                            clientePj[i].deposito();
                        }
                    }
                }

            }
        }
    }
}