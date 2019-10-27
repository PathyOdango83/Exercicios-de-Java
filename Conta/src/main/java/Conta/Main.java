/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conta;

import  java.util.Scanner;
/**
 *
 * @author patricia
 */
public class Principal{

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
    
     minhaConta = new conta();
     
     Scanner leitura = new Scanner(System.in);
     
     
        int CPF;
    String nome;
    double saldo;
    int nun;
    int op;
    double lim;
    double valor;
    
      do{
    
    System.out.println("*******Conta Bancaria do  Banco XYZ*******");
    System.out.println("1- Insira os  dados do Cliente");
    System.out.println("2- Mostrar  os dados");
    System.out.println("3- Fazer deposito");
    System.out.println("4- Sacar dinheiro ");
    System.out.println("0- Limpar tela.");
    
    leitura.nextLine();
     op = leitura.nextInt();
     
          switch(op){
             
            case 1:
                System.out.println("Entre com o nome");
                nome = leitura.nextLine();
                
                System.out.println("Entre com o número da conta");
                num = leitura.nextInt();
                
                
                
                System.out.println("Entre com o saldo");
                saldo = leitura.nextDouble();
                
           
                System.out.println("Entre com o limite ");
                lim = leitura.nextDouble();
                
                minhaConta.inseredados(nome,num,saldo,lim);
                
                break
                        
                        
            case 2:
                
                minhaConta.mostrardado();
                
                break
                        
               
            case 3:
                
                System.out.println("Entre com o valor a ser depositado");
            
                valor = leitura.nextDouble(); 
                
                minhaConta.deposita(valor);
                
                break
                
            case 4:    
                 minhaConta.mostrasal();
                
                System.out.println("Entre com o valor a ser sacado");
                 
                valor = leitura.nextDouble();
                
                minhaConta.saca(valor);
                
                break
                        
            
            case 5:
                
                minhaConta.mostrasal();
                
                break
                        }
          
      } 
      
      while (op!=0);
      
                
                
                            
                
                
                
                
           
               
                
            
        }
// TODO code application logic here
        
    }
    

