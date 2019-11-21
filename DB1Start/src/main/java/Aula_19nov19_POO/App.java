package Aula_19nov19_POO;

public class App {

    public static void main(String[] args) {


        Professor p1 = new Professor("Maiko", "maiko@gmail.com", 4500);
        Professor p2 = new Professor("Aline", "sovnreign@bing.com", 8500.8f);

        Aluno a1 = new Aluno("Pedro", "pedro@gmail.com", 10);
        Aluno a2 = new Aluno("Alfred", "alfred@hotmail.com", 8.5f);
        Aluno a3 = new Aluno("Jonas", "jonas@bing.com", 7.8f);
        Aluno a4 = new Aluno("Raissa", "raissa@bing.com", 8.4f);

        Materia m1 = new Materia("POO", "Fundamentos Basicos de POO", 10.5f);
        Materia m2 = new Materia("Banco de Dados", "Nocoes Basicas de Banco de Dados", 7f);

        m1.setProfessorResponsavel(p1);
        m2.setProfessorResponsavel(p2);

        Aula pooA01 = new Aula("06/11/2019",m1);
        Aula dbA01 = new Aula ("02/11/2019",m2);

        pooA01.adicionarAluno(a1);
        pooA01.adicionarAluno(a2);

        dbA01.adicionarAluno(a3);
        dbA01.adicionarAluno(a4);





    }

}
