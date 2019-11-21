package Aula_21nov19_POO_ExercicioContaCorrente;

public class CampoNaoPodeSerNulo extends RuntimeException {

    public CampoNaoPodeSerNulo() {
    }

    public CampoNaoPodeSerNulo(String frase) {
        super(frase);
    }

    public void compararObjetoComNulo(Object object, String frase) {
        if (object == null) {
            throw new CampoNaoPodeSerNulo(frase);
        }
    }

    public void compararQuantiaComSaldo(Double quantia, Double saldo){
        if (quantia > saldo){
            throw new CampoNaoPodeSerNulo("Saldo insuficiente!");
        }
    }

}
