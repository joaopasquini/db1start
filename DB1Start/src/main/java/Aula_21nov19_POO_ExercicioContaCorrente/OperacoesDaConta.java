package Aula_21nov19_POO_ExercicioContaCorrente;

import java.util.Date;

public class OperacoesDaConta {

    private Date dataOperacao;
    private String id;
    private String nomeTitular;
    private String tipoOperacao;
    private String favorecido;
    private String idDestinario;
    private String valor;


    public OperacoesDaConta(Date dataOperacao, String id, String nomeTitular, String tipoOperacao, String valor) {
        this.dataOperacao = dataOperacao;
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    public OperacoesDaConta(Date dataOperacao, String id, String nomeTitular, String tipoOperacao, String favorecido, String idDestinario, String valor) {
        this.dataOperacao = dataOperacao;
        this.id = id;
        this.nomeTitular = nomeTitular;
        this.tipoOperacao = tipoOperacao;
        this.favorecido = favorecido;
        this.idDestinario = idDestinario;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "=================================\n" +
                "dataOperacao=" + dataOperacao +
                "\n id='" + id + '\'' +
                "\n nomeTitular='" + nomeTitular + '\'' +
                "\n tipoOperacao='" + tipoOperacao + '\'' +
                "\n valor='" + valor + '\'' +
                "\n idDestinario='" + idDestinario + '\'' +
                "\n favorecido='" + favorecido + '\'' +
                '}';
    }
}
