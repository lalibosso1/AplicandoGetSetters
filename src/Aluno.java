public class Aluno {
    private String nome;
    private double nota;
    private double nota2;
    private double nota3;


    public Aluno(String nome, double nota, double nota2,double nota3){
        this.nome = nome;
        this.nota = nota;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double pegaMedia(){
        return (nota + nota2 + nota3 ) / 3 ;
    }

}
