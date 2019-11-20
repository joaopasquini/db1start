package AulaJava_19nov19_POO_ResolvidoPeloProf;

public class Materia {

    public String nome;
    public String descricao;
    public Double cargaHoraria;
    public Integer quantidadeAulas;
    public Professor professor;




    public Materia(String nome, String descricao, Double cargaHoraria, Integer quantidadeAulas, Professor professor) {

        CampoNaoPodeSerNulo campo = new CampoNaoPodeSerNulo();

//        if( descricao == null){
//            throw new CampoNaoPodeSerNulo("Descricao nao pode ser nulo");
//        }

        campo.compararObjetoComNulo(nome,"Nome da Materia nao pode ser nulo");
        campo.compararObjetoComNulo(descricao,"Descricao nao pode ser nula");
        campo.compararObjetoComNulo(cargaHoraria, "Carga Horaria nao pode ser nula");
        campo.compararObjetoComNulo(quantidadeAulas, "Quantidade de aulas nao pode ser nula");
        campo.compararObjetoComNulo(professor,"Professor nao pode ser nulo");

        this.nome = nome;
        this.descricao = descricao;
        this.cargaHoraria = cargaHoraria;
        this.quantidadeAulas = quantidadeAulas;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getCargaHoraria() {
        return cargaHoraria;
    }

    public Integer getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public Professor getProfessor() {
        return professor;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                ", quantidadeAulas=" + quantidadeAulas +
                ", professor=" + professor +
                '}';
    }



}
