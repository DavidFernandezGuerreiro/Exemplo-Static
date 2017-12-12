/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo.atributos_obxectos;

/**
 *
 * @author dfernandezguerreiro
 */
public class Conta { 
    private Persoa titular = new Persoa(); 
    //double saldo; 
    //static float xuro=0.04f; // static -> por que va a ser común a todos.
    private double saldo;
    private static float xuro=0.04f;
    
    public Conta(){ 
        
    }
    public Conta (String nom, String dn, double saldo){
        titular.setNome(nom);
        titular.setDni(dn);
        this.saldo=saldo;
    }
    public Conta(Persoa ti, double saldo){
        titular=ti;
        this.saldo=saldo;
    }
    
    public void setTitular(Persoa titular){
        this.titular=titular;
    }
    public Persoa getTitular(){
        return titular;
    }
    
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public double getSaldo(){
        return saldo;
    }
    
    @Override
    public String toString(){
        return "nome : "+ titular.getNome() +", dni : "+titular.getDni()+" saldo : "+saldo;
    }
    
    public double saldoFinal(){ // método no estatico 
        return saldo+saldo*xuro;
    }
    /*
    public static double finalSaldo(){ // método estatico, no puede accedo a un metodo no estatico
        double sal;
        sal=saldo+xuro*saldo;
    }*/
    public static double getXuro(){ // metodo estatico si puedo acceder a un atributo estatico
        return xuro;
    }
}
