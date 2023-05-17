/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bancobrasil;

import java.util.Scanner;

/**
 *
 * @author programador
 */
public class BancoBrasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando um objeto do tipo ContaBancaria e referenciando na variavel contaBancaria1 e 2
        ContaBancaria contaBancaria1 = new ContaBancaria();
        ContaBancaria contaBancaria2 = new ContaBancaria();
        
        /*contaBancaria1.agencia="0001";
        contaBancaria1.conta="12345";
        contaBancaria1.proprietario="Junior";
        contaBancaria1.saldo=1.99;
        
        System.out.println(contaBancaria1.agencia+"\n"+
        contaBancaria1.conta+"\n"+
        contaBancaria1.proprietario+"\n"+
        contaBancaria1.saldo);*/
        Scanner scan = new Scanner(System.in);
        System.out.println("BEM VINDO AO BANCO");
        System.out.println("CADASTRO DE CONTAS");
        System.out.println("Digite a agência -> ");
        contaBancaria1.agencia=scan.next();
        System.out.println("\nDigite a conta -> ");
        contaBancaria1.conta=scan.next();
        System.out.println("\nDigite o proprietário -> ");
        contaBancaria1.proprietario=scan.next();
        System.out.println("\nDigite o saldo inicial -> ");
        contaBancaria1.saldo=scan.nextDouble();
    }
    
}
