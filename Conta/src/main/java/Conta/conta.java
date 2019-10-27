/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conta;

/**
 *
 * @author patricia
 */
public class conta {

     private int Numero;
     public int op;
     private String Dono;
     private double Saldo;
     private double Limite;
     
     
     
     //primeiro método
     public Conta(){
         
         this.Numero=0;
         this.Dono"";
         this.Saldo=0;
         this.Limite=0;
     }
     
     public int getNumero(){
         return Numero;
     }
     
     public void setNumero(int Numero){
         
         this.Numero = Numero;
         
     }
     
     public String getDono(){
         
         return Dono;
     }
     
     public void setDono(String Dono){
         
         this.Dono = Dono;
     }
         
     }
     

