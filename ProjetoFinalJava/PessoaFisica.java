package ProjetoFinalJava;

public class PessoaFisica extends Conta {
    // superclasse (Fornecer herança para as outras classes)
    // atributos gnéricos (comuns a todas as demais clasess)
    // Atributos
    String nome;
    String endereço;
    int idade;
    String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Métodos
}
