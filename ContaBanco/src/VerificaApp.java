import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class VerificaApp {


    public void VerificaBanco(){ 
        VerificaBanco vb = new VerificaBanco();
        Scanner vs = new Scanner(System.in);
        LocalTime horaAtual = LocalTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        
        System.out.println("Hora atual: " + horaAtual.format(formato));

        if (horaAtual.isBefore(LocalTime.of(12, 0))) {
            System.out.println("Bom dia! O banco está aberto.");
        } else if (horaAtual.isBefore(LocalTime.of(18, 0))) {
            System.out.println("Boa tarde! O banco está aberto.");
        } else {
            System.out.println("Boa noite! O banco está aberto.");
        }

        System.out.println("Qual banco você deseja acessar?");

        System.out.println("Temos acesso aos seguintes bancos:");
        System.out.println("-----------------------------------------------------------------------");
        System.out.println("1 - Banco do Brasil" + " | " + "2 - Caixa Econômica" + " | " + "3 - Bradesco" + " | " + "4 - Itaú");
        System.out.println("-----------------------------------------------------------------------");

        System.out.println("Por favor, escolha o número correspondente ao banco:");
        int resp = vs.nextInt();

        switch (resp) {
            case 1:
                vb.BancoDoBrasil();
                break;
            case 2:
                vb.CaixaEconomica();
                break;
            case 3:
                vb.Bradesco();
                break;
            case 4:
                vb.Itau();
                break;
            default:
                throw new AssertionError();
                
        }

    }
    
}
