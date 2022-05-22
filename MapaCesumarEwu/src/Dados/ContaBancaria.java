/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dados;

/**
 *
 * @author Werner
 */
public class ContaBancaria {

    //atributos:
    
    protected int numAgencia;
    protected int numConta;
    protected int digConta;
    protected double saldo;

    
    // getters and setters e encapsulamento:
    
    /**
     * @return the nomeAgencia
     */
    public int getNumAgencia() {
        return numAgencia;
    }

    /**
     * @param numAgencia the nomeAgencia to set
     */
    public void setNumAgencia(int numAgencia) {
        this.numAgencia = numAgencia;
    }

    /**
     * @return the numConta
     */
    public int getNumConta() {
        return numConta;
    }

    /**
     * @param numConta the numConta to set
     */
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    /**
     * @return the digConta
     */
    public int getDigConta() {
        return digConta;
    }

    /**
     * @param digConta the digConta to set
     */
    public void setDigConta(int digConta) {
        this.digConta = digConta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
   // métodos:
    public void sacar (double valor){
        if (valor <= saldo){
           saldo = saldo - valor; 
        }
        else{
            System.out.println ("Saldo insuficiente para o saque de: " + valor +"; Saldo de = " + this.getSaldo());
        }
    }    
    
    
    public void depositar (double valor){
        saldo += valor;
    }
    
    public void transferir (double valor, ContaBancaria conta){
        if ((saldo - valor)>= 0) {
            saldo -=valor;
            conta.depositar(valor);
        }
        else{
            System.out.println ("Saldo insuficiente para a transferência de : " + valor +"; Saldo de = " + this.getSaldo());
        }
    }
    
                
     @Override
    public String toString() {//Saldo por meio de toString
    String s = "Conta Bancária [ ";//nomeAgencia; numConta; digConta; double saldo; limite
        s += "Agencia nº: " + numAgencia;
        s += "; Conta nº: " + numConta;
        s += "; Conta digito: " + digConta;
        s += "; Saldo: " + saldo;
        s += " ]";
        
        return s; 
    }
}
