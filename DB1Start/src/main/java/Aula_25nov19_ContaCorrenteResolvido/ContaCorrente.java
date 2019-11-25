package Aula_25nov19_ContaCorrenteResolvido;

import java.util.ArrayList;
import java.util.List;

public class ContaCorrente {

    private Agencia agencia;

    private String numero;

    private String digito;

    private Cliente cliente;

    private Double saldo;

    private List<Operacao> operacoes;

    public void depositar(Double valor) {
        if(valor == null){
            throw new RuntimeException("Valor nao pode ser nulo!");
        }
        if(valor <= 0 ){
            throw new RuntimeException("Valor invalido!");
        }

        this.saldo += valor;
        this.operacoes.add(new Operacao("ENTRADA",valor));
    }

    public void sacar(Double valor){
        if(valor == null){
            throw new RuntimeException("Valor nao pode ser nulo!");
        }
        if(valor <= 0 ){
            throw new RuntimeException("Valor invalido!");
        }
        if(valor > saldo){
            throw new RuntimeException("Saldo insuficiente!");
        }
        this.saldo -= valor;
        this.operacoes.add(new Operacao("SAIDA",valor));
    }

    public void transferir(ContaCorrente from, Double valor){
        if(from == null){
            throw new RuntimeException("");
        }
        if(valor == null){
            throw new RuntimeException("");
        }
        from.sacar(valor);
        this.depositar(valor);
        this.operacoes.add(new Operacao("TRANSFERENCIA",valor));
    }

    public ContaCorrente(Agencia agencia, String numero, String digito, Cliente cliente) {
        this.agencia = agencia;
        this.numero = numero;
        this.digito = digito;
        this.cliente = cliente;
        this.saldo = 0.0;
        this.operacoes = new ArrayList<Operacao>();
    }

    public List<Operacao> getExtrato(){
        return this.operacoes;
    }
}
