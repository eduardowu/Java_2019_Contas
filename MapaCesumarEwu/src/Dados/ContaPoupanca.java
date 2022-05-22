package Dados;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Werner
 */
public class ContaPoupanca extends ContaBancaria {
    
    private double rendimento;

    /**
     * @return the rendimento
     */
    public double getRendimento() {
        return rendimento;
    }

    /**
     * @param rendimento the rendimento to set
     */
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
        
    }
    
    public void render (double taxaRendimento){
        rendimento = saldo * taxaRendimento;
        saldo += saldo * taxaRendimento;
        
    }
    
    
    @Override
    public String toString() {
               
        String s = "Conta Poupança [ ";
        
        s += "" + super.toString();
        s += " Rendimento: " + rendimento;
        s += " ]";
        return s; 
    }
    
}
