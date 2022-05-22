/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Dados.ContaBancaria;
import Dados.ContaEspecial;
import Dados.ContaPoupanca;

/**
 *
 * @author Werner
 */
public class Principal {
    
    public static void main (String[] args) {
    
    //Comandos do exercício:
    //• Crie duas contas correntes e duas poupanças (pode definir os números das contas como quiser)
    //Conta Corrente # 01:
    ContaEspecial contaSimples = new ContaEspecial (); //nomeAgencia; numConta; digConta; double saldo;
    contaSimples.setNumAgencia(1111);
    contaSimples.setNumConta(55555);
    contaSimples.setDigConta(1);
    contaSimples.setSaldo(1000);
    contaSimples.setLimite(200);
    
    //Conta Corrente #02:
    ContaEspecial contaSimples02 = new ContaEspecial();
    contaSimples02.setNumAgencia(2222);
    contaSimples02.setNumConta(66666);
    contaSimples02.setDigConta(2);
    contaSimples02.setSaldo(2000);
    contaSimples02.setLimite(500);
    
    //Conta Poupança # 03:
    ContaPoupanca contaPoupanca = new ContaPoupanca ();
    contaPoupanca.setNumAgencia(3333);
    contaPoupanca.setNumConta(77777);
    contaPoupanca.setDigConta(3);
    contaPoupanca.setSaldo(1500);
    contaPoupanca.setRendimento(0);
    
    //Conta Poupança # 04:
    ContaPoupanca contaPoupanca02 = new ContaPoupanca ();
    contaPoupanca02.setNumAgencia(4444);
    contaPoupanca02.setNumConta(88888);
    contaPoupanca02.setDigConta(4);
    contaPoupanca02.setSaldo(2500);
    contaPoupanca02.setRendimento(0);
    
    //• Inicie as contas com saldos e limites diferentes de zero.
    System.out.println ("*** 01 - Inicialização das contas com saldo e limite difernte de zero ***");
    System.out.println(contaSimples);
    System.out.println(contaSimples02);
    System.out.println(contaPoupanca);
    System.out.println(contaPoupanca02);
    System.out.println ("***     ***");
     
    //• Realize dois saques em quaisquer contas e exiba o saldo a seguir.
    System.out.println ("*** 02 - Saques, nos valores de 200 e 700, realizados na conta corrente 55555 ***");
    System.out.println ("*** Saldo antes do saque: ***");
    System.out.println(contaSimples);
    contaSimples.sacar(200);
    contaSimples.sacar(700);
    System.out.println ("*** Saldo após o saque: ***");
    System.out.println(contaSimples);
    System.out.println ("***     ***");
    
    System.out.println ("*** 03 - Saques, nos valores de 300 e 850 realizados na conta corrente 66666 ***");
    System.out.println ("*** Saldo antes do saque: ***");
    System.out.println(contaSimples02);
    contaSimples02.sacar(300);
    contaSimples02.sacar(850);
    System.out.println ("*** Saldo após o saque: ***");
    System.out.println(contaSimples02);
    System.out.println ("***     ***");
    
    //• Realize duas transferências e exiba os saldos das contas envolvidas.
    System.out.println ("*** 04 - Transferência, no valor de 500, da conta 66666, para a poupança 77777 ***");
    System.out.println ("*** Saldo antes da transferência: ***");
    System.out.println(contaSimples02);
    System.out.println (contaPoupanca);
    contaSimples02.transferir(500, contaPoupanca);
    System.out.println ("*** Saldo após a transferência: ***");
    System.out.println(contaSimples02);
    System.out.println (contaPoupanca);
    System.out.println ("***");
    
    System.out.println ("*** 05 - Transferência, no valor de 1000, da conta 88888, para a conta 55555 ***");
    System.out.println ("*** Saldo antes da transferência: ***");
    System.out.println(contaPoupanca02);
    System.out.println (contaSimples);
    contaPoupanca02.transferir(1000,contaSimples);
    System.out.println ("*** Saldo após a transferência: ***");
    System.out.println(contaPoupanca02);
    System.out.println (contaSimples);
    System.out.println ("***     ***");
    
    //• Realize tentativas de um saque e uma transferência a partir de uma conta corrente que não tenha saldo
    //suficiente mesmo com o limite.
    System.out.println ("*** 06 - Tentativa de saque, no valor de 1500, da conta 55555 ***");
    System.out.println ("*** Saldo antes do saque: ***");
    System.out.println (contaSimples);
    contaSimples.sacar(1500);
    System.out.println ("*** Saldo após a tentativa de saque: ***");
    System.out.println (contaSimples);
    System.out.println ("***     ***");
    
    System.out.println ("*** 07 - Tentativa de transferência, no valor de 2100, da conta 66666, para a conta 55555 ***");
    System.out.println ("*** Saldo antes da transferência: ***");
    System.out.println (contaSimples02);
    contaSimples02.transferir(2100, contaSimples);
    System.out.println ("*** Saldo após a transferência: ***");
    System.out.println (contaSimples02);
    System.out.println ("***     ***");
    
    //• Realize tentativas de um saque e de uma transferência a partir de uma conta poupança que não tenha saldo
    //suficiente.
    System.out.println ("*** 08 - Tentativa de saque, no valor de 2050, da conta 77777 ***");
    System.out.println (" Saldo antes do saque: ");
    System.out.println (contaPoupanca);
    contaPoupanca.sacar(2050);
    System.out.println (" Saldo após a tentativa de saque: ");
    System.out.println (contaPoupanca);
    System.out.println ("***     ***");
    
    System.out.println ("*** 09 - Tentativa de transferência, no valor de 2100, da conta 88888, para a conta 77777 ***");
    System.out.println (" Saldo antes da transferência: ");
    System.out.println (contaPoupanca02);
    contaPoupanca02.transferir(2100, contaPoupanca);
    System.out.println (" Saldo após a transferência: ");
    System.out.println (contaPoupanca02);
    System.out.println ("***     ***");
    
    System.out.println ("*** 10 - Conta Poupança 88888, recebendo rendimento de 2% ***");
    System.out.println (" Saldo antes do rendimento: ");
    System.out.println (contaPoupanca02);
    contaPoupanca02.render(0.02);
    System.out.println (" Saldo após a transferência: ");
    System.out.println (contaPoupanca02);
    System.out.println ("***     ***");
    }
    
}
