package Aula_25nov19_ContaCorrenteResolvido;

import java.util.Date;

public class Operacao {

    private String tipo;

    private Date data;

    private Double valor;

    public Operacao(String tipo, Double valor) {
        this.tipo = tipo;
        this.valor = valor;
        this.data = new Date(); // data nao pode ser passada por parametro, evitar batota
    }


}
