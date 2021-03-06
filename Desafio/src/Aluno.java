import java.util.Objects;

public class Aluno {
    public String nome;
    public String sobrenome;
    public Integer codAluno;

    public Aluno(String nome, String sobrenome, Integer codAluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codAluno = codAluno;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(codAluno, aluno.codAluno);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codAluno);
    }
}
