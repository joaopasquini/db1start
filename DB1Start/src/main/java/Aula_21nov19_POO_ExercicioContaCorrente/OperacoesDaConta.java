package Aula_21nov19_POO_ExercicioContaCorrente;

import java.util.Date;

public class OperacoesDaConta {

    private Date dataOperacao;
    private String id;
    private String nomeTitular;
    private String tipoOperacao;
    private String favorecido;
    private String idFavorecido;
    private String valor;


    public OperacoesDaConta(Date dataOperacao, String id, String nomeTitular, String tipoOperacao, String valor) {
        this.dataOperacao = dataOperacao;
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    public OperacoesDaConta(Date dataOperacao, String id, String nomeTitular, String tipoOperacao, String favorecido, String idFavorecido, String valor) {
        this.dataOperacao = dataOperacao;
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.tipoOperacao = tipoOperacao;
        this.favorecido = favorecido;
        this.idFavorecido = idFavorecido;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return  " Data Operacao: " + dataOperacao +
                "\n Conta Titular: '" + id + '\'' +
                "\n Nome Titular: '" + nomeTitular + '\'' +
                "\n Tipo de Operacao: '" + tipoOperacao + '\'' +
                "\n Valor(R$): '" + valor + '\'' +
                "\n Conta Beneficiario: '" + idFavorecido + '\'' +
                "\n Nome Favorecido: '" + favorecido + '\'' +
                '}'
                +"\n------------------------------------------------";
    }

    public Date getDataOperacao() {
        return dataOperacao;
    }

    public String getId() {
        return id;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public String getFavorecido() {
        return favorecido;
    }

    public String getIdFavorecido() {
        return idFavorecido;
    }

    public String getValor() {
        return valor;
    }
}
