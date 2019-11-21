package Aula_21nov19_POO_ExercicioContaCorrente;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    String nomeDoBanco;
    List<ContaCorrente> contasCorrentes = new ArrayList<>();

    CampoNaoPodeSerNulo validar = new CampoNaoPodeSerNulo();

    public Banco(String nome){
        this.nomeDoBanco = nome;
    }

    public void adicionarContaCorrente(ContaCorrente conta){
        validar.compararObjetoComNulo(conta,"Conta invalida!");
        this.contasCorrentes.add(conta);
    }

    public String getNomeDoBanco() {
        return nomeDoBanco;
    }

    public List<ContaCorrente> getContasCorrentes() {
        return contasCorrentes;
    }
}
