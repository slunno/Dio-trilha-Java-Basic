
import java.util.Scanner;



public class VerificaBanco {
    
    LimparTela lt = new LimparTela();





    Scanner vs = new Scanner(System.in);
    public void BancoDoBrasil(){ 
        lt.limparTela();
        System.out.println("Bem-vindo ao Banco do Brasil!");
        System.out.println("-------------------------------------------");
        System.out.print("Insira o seu nome completo: ");
        String nome = vs.nextLine();
        System.out.print("Insira a sua agência (4 dígitos): ");
        String agencia = vs.nextLine();
        System.out.print("Insira o número da sua conta (8 dígitos + o dígito verificador): ");
        String conta = vs.nextLine();
        String agenciaFormatada = agencia.substring(0,3) + "-" + agencia.substring(3,4);
        String contaFormatada = conta.substring(0,8) + "-" + conta.substring(8,9);
        lt.limparTela();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agenciaFormatada + ", conta " + contaFormatada + " e seu saldo inicial é R$ 0,00.");
        
    }
    public void CaixaEconomica(){ 
        lt.limparTela();
        System.out.println("Bem-vindo à Caixa Econômica!");
        System.out.println("-------------------------------------------");
        System.out.print("Insira o seu nome completo: ");
        String nome = vs.nextLine();
        System.out.print("Insira a sua agência (4 dígitos): ");
        String agencia = vs.nextLine();
        System.out.print("Insira o número da sua conta (11 dígitos + o dígito verificador): ");
        String conta = vs.nextLine();
        String agenciaFormatada = agencia.substring(0,3) + "-" + agencia.substring(3,4);
        String contaFormatada = conta.substring(0,10) + "-" + conta.substring(10,11);
        lt.limparTela();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agenciaFormatada + ", conta " + contaFormatada + " e seu saldo inicial é R$ 0,00.");
    }

    public void Bradesco(){ 
        lt.limparTela();
        System.out.println("Bem-vindo ao Bradesco!");
        System.out.println("-------------------------------------------");
        System.out.print("Insira o seu nome completo: ");
        String nome = vs.nextLine();
        System.out.print("Insira a sua agência (4 dígitos): ");
        String agencia = vs.nextLine();
        System.out.print("Insira o número da sua conta (7 dígitos + o dígito verificador):");
        String conta = vs.nextLine();
        String agenciaFormatada = agencia.substring(0,3) + "-" + agencia.substring(3,4);
        String contaFormatada = conta.substring(0,7) + "-" + conta.substring(7,8);
        lt.limparTela();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agenciaFormatada + ", conta " + contaFormatada + " e seu saldo inicial é R$ 0,00.");
    }

    public void Itau(){ 
        lt.limparTela();
        System.out.println("Bem-vindo ao Itaú!");
        System.out.println("-------------------------------------------");
        System.out.print("Insira o seu nome completo: ");
        String nome = vs.nextLine();
        System.out.print("Insira a sua agência (4 dígitos): ");
        String agencia = vs.nextLine();
        System.out.print("Insira o número da sua conta (6 dígitos + o dígito verificador):");
        String conta = vs.nextLine();
        String agenciaFormatada = agencia.substring(0,3) + "-" + agencia.substring(3,4);
        String contaFormatada = conta.substring(0,6) + "-" + conta.substring(6,7);
        lt.limparTela();
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agenciaFormatada + ", conta " + contaFormatada + " e seu saldo inicial é R$ 0,00.");
    }

}