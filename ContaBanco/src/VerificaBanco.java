
import java.util.Scanner;



public class VerificaBanco {
    
    Scanner vs = new Scanner(System.in);
    public void BancoDoBrasil(){ 
        System.out.println("Bem-vindo ao Banco do Brasil!");
        System.out.println("Insira o seu nome completo:");
        String nome = vs.nextLine();
        System.out.println("Insira a sua agência:");
        String agencia = vs.nextLine();
        System.out.println("Insira o número da sua conta:");
        String conta = vs.nextLine();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo inicial é R$ 0,00.");
        
    }
    public void CaixaEconomica(){ 
        System.out.println("Bem-vindo à Caixa Econômica!");
        System.out.println("Insira o seu nome completo:");
        String nome = vs.nextLine();
        System.out.println("Insira a sua agência:");
        String agencia = vs.nextLine();
        System.out.println("Insira o número da sua conta:");
        String conta = vs.nextLine();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo inicial é R$ 0,00.");
    }

    public void Bradesco(){ 
        System.out.println("Bem-vindo ao Bradesco!");
        System.out.println("Insira o seu nome completo:");
        String nome = vs.nextLine();
        System.out.println("Insira a sua agência:");
        String agencia = vs.nextLine();
        System.out.println("Insira o número da sua conta:");
        String conta = vs.nextLine();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo inicial é R$ 0,00.");
    }

    public void Itau(){ 
        System.out.println("Bem-vindo ao Itaú!");
        System.out.println("Insira o seu nome completo:");
        String nome = vs.nextLine();
        System.out.println("Insira a sua agência:");
        String agencia = vs.nextLine();
        System.out.println("Insira o número da sua conta:");
        String conta = vs.nextLine();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo inicial é R$ 0,00.");
    }

}