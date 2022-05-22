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
public class ContaEspecial extends ContaBancaria{
    
    private double limite;

    /**
     * @return the limite
     */
    public double getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    //método sacar com limite
    public void sacar (double valor){
    
        double saldoComLimite = this.getSaldo() +this.getLimite();
        
        if (valor <= saldoComLimite){
           this.setSaldo(this.getSaldo()- valor); 
        }
        else{
            System.out.println ("Saldo insuficiente para o saque de: " + valor +"; Saldo de = " + this.getSaldo());
        }
    }    

    
    //método transferir com limite
    
   public void transferir (double valor, ContaBancaria conta){
        
       double saldoComLimite = this.getSaldo() + this.getLimite();
        
       if ((saldoComLimite - valor)>= 0){
            this.setSaldo(this.getSaldo()- valor);
    
            conta.depositar(valor);
        }
        else{
            System.out.println ("Saldo insuficiente para a transferência de : " + valor +"; Saldo de = " + this.getSaldo());
        }
    } 
    
    
        
    @Override
    public String toString() {
               
        String s = "Conta Corrente [ ";
        
        s += "" + super.toString();
        s += " Limite: " + limite;
        s += " ]";
        return s; 
    }
    
}
