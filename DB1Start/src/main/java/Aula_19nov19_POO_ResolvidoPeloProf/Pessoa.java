package Aula_19nov19_POO_ResolvidoPeloProf;

public abstract class Pessoa {
   // tipos de modificadores de acesso: default, protected, private e public


    private String email;
    private String nome;

    public  Pessoa(){

    }


    public Pessoa(String email, String nome) {
        CampoNaoPodeSerNulo campo = new CampoNaoPodeSerNulo();

        campo.compararObjetoComNulo(email,"Email nao pode ser nulo");
        campo.compararObjetoComNulo(nome,"Nome nao pode ser nulo");

        this.email = email;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "email='" + email + '\'' +
                ", nome='" + nome + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}
