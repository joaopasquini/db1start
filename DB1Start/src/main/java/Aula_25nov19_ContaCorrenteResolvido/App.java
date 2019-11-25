package Aula_25nov19_ContaCorrenteResolvido;

public class App {

    public static void main(String[] args) {

        Cliente cliente = new Cliente("9999999999","Maiko Cunha");
        Agencia agencia = new Agencia("210","8","PR","Maringa");
        ContaCorrente contaCorrente = new ContaCorrente(agencia,"0001","8",cliente);

        try{
            contaCorrente.sacar(2000.0);
        }catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
            System.out.println("Enviando e-mail para o gerente");
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }



    }


}
