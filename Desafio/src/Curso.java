public class Curso {
    public String nomeCurso;
    public Integer codCurso;

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(Integer codCurso) {
        this.codCurso = codCurso;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
