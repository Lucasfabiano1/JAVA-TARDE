package PooINTRODUCÇAO;

public class REGSITRAALUNO {
    // Declaração dos atributos do objeto(para cada aluno)
    private String nome;
    private String endereco;
    private String idade;
    private String notaMatematica;
    private String notaPortugues;
    private String notaCiencias;
    // Atribudo da classe(para todos)
    private static int contadorEstudante;

    // criação de metodos
    // retorna o nome do estudante
    public String getNome() {
        return nome;
    }

    // retorna o endereço do estudante
    public String getEndereco() {
        return endereco;
    }

    // retorna idade do estudante
    public String getIdadee() {
        return idade;
    }

    // retorna a média do estudante
    public String getMedia() {
        double resultado = 0;
        resultado = (notaMatematica + notaPortugues + notaCiencias)/ 3;
        return resultado;
    }

    // retorna a quantidade de estudantes cadastrados
    public static int getQauntidadeAlunos() {
        return contadorEstudante;
    }
    // define ou altera o nome do estudante
public void setNome(String temp){
    nome = temp;
    }
    // define ou altera o endereço do estudante
    public void setEndereco(String temp){
    endereco = temp;
    }
    // define ou altera o endereço do estudante
    public void setIdade(int temp){
    idade = temp;
    }
    // define ou altera o endereço do estudante
    public void setNotaMatematica(double temp){
    notaMatematica = temp;
    }
    // define ou altera o endereço do estudante
    public void setNotaPortugues(double temp){
    notaPortugues = temp;
    }
    // define ou altera o endereço do estudante
    public void setNotaCiencias(double temp){
    notaCiencias = temp;
    }
}
