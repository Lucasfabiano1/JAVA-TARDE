package POOHeranca;

public class App {
    public static void main(String[] args) {
        Alunos aluno01 = new Alunos(); //obj
        aluno01.setCpf(null);
        aluno01.setEndereço(null);
        aluno01.setIdade(0);
        aluno01.setNome(null);
        Professores prof01 = new Professores(); //obj
        prof01.setCpf(null);
        prof01.setEndereço(null);
        prof01.setIdade(0);
        prof01.setNome(null);
        FuncionarioLimpeza func01 = new FuncionarioLimpeza();
        func01.setCpf(null);
        func01.setEndereço(null);
        func01.setIdade(0);
        func01.setNome(null);
    }
}
