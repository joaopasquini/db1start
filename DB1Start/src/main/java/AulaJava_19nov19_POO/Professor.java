package AulaJava_19nov19_POO;

public class Professor extends Pessoa {

    private double salario;

    public Professor(String nome, String email, double salario){
       super(nome,email);
       salario = this.salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
