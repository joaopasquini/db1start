package Aula_21nov19_POO_ExercicioContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    String nomeDoBanco;
    List<ContaCorrente> contasCorrentes = new ArrayList<>();

    ValidacaoException validar = new ValidacaoException();

    public Banco(String nome){
        this.nomeDoBanco = nome;
    }

    public void adicionarContaCorrente(ContaCorrente conta){
        validar.compararObjetoComNulo(conta,"Conta invalida!");
        this.contasCorrentes.add(conta);
    }

    public ContaCorrente retornarContaEspecificaAtravesDoId(String idDaConta){
        for(ContaCorrente conta : contasCorrentes){
            if(conta.getId() == (idDaConta)){
                return conta;
            }
        }
        return null;
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public List<ContaCorrente> getContasCorrentes() {
        return contasCorrentes;
    }


}
