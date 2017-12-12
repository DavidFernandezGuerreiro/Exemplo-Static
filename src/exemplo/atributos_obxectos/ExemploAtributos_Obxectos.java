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
public class ExemploAtributos_Obxectos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conta obxConta=new Conta("millonetis", "1111111", 10000000); //Siempre en orden Nombre, DNI y saldo.
        System.out.println(obxConta.saldoFinal());
        
        /*
        //Con los atributos da clase Conta sin ser privados (private): 
        //Acceder directamente a xuro:
        System.out.println("xuro = "+Conta.xuro); //variable de clase
        
        //Mirar o saldo:
        System.out.println("saldo = "+obxConta.saldo); //Solo se puede acceder a través dunha persoa (obxConta). //variable de obxecto
        */
        //Con los atributos da clase Conta en privado (private):
        System.out.println("xuro "+Conta.getXuro());

    }
    
}
