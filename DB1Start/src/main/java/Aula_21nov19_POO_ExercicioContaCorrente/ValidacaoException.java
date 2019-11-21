package Aula_21nov19_POO_ExercicioContaCorrente;

public class ValidacaoException extends RuntimeException {

    public ValidacaoException() {
    }

    public ValidacaoException(String frase) {
        super(frase);
    }

    public void compararObjetoComNulo(Object object, String frase) {
        if (object == null) {
            throw new ValidacaoException(frase);
        }
    }

    public void compararQuantiaComSaldo(Double quantia, Double saldo){
        if (quantia > saldo){
            throw new ValidacaoException("Saldo insuficiente!");
        }
    }

    public void verificarOperacaoComQuantia0(Double quantia){
        if(quantia == 0){
            throw new ValidacaoException("Quantia invalida!");
        }
    }



}
