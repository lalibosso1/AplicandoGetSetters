public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void verificarIdade(){
        if (idade < 18){
            System.out.println("Usuário menor de idade");
        }
        else {
            System.out.println("Usuário maior de idade");
        }


    }
}
