import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome");
        nome = input.next();
        Pessoa p1 = new Pessoa(nome);

        System.out.println("Voce trabalha com produtos ou serviços?");
        String tipo;
        tipo = input.next();
        if(Objects.equals(tipo, "produtos")) {
            System.out.println("Qual valor e nome do seu produto respectivamente?");
            int valor;
            String pnome;
            valor = input.nextInt();
            pnome = input.next();
            Produto prod1 = new Produto(valor,pnome);
            IPI ipiprod = new IPI();
            ICMS icmsprod = new ICMS();
            Double valorcomIPI = ipiprod.calcular_IPI(prod1);
            Double valorcomICMS =  icmsprod.calcular_ICMS(prod1);
            Double valortotal = valorcomICMS + valorcomIPI;
            System.out.println("O valor da transação com o IPI e ICMS aplicados é de R$" + valortotal);
        }else if(Objects.equals(tipo, "serviços")) {
            System.out.println("Qual velor e nome do seu produto respectivamente?");
            int valor;
            String snome;
            valor = input.nextInt();
            snome = input.next();
            Servico serv1 = new Servico(valor,snome);
            ISS issserv = new ISS();
            ICMS icmsserv = new ICMS();
            Double valorcomISS = issserv.calcular_ISS(serv1);
            Double valorcomICMS =  icmsserv.calcular_ICMS(serv1);
            Double valortotal = valorcomICMS + valorcomISS;
            System.out.println("O valor da transação com o ISS e ICMS aplicados é de R$" + valortotal);
        }



    }
}
