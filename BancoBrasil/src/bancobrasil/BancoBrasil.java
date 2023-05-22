package bancobrasil;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Guilherme Severino Galvão
 */
public class BancoBrasil {

    public static void main(String[] args) {
        //FORMA MELHORADA DE INTERFACE
        Scanner scan = new Scanner(System.in);
        //Variável global de opção
        int opcao = 0;
        boolean existe = false;
        //Objetos
        Usuario user;
        Usuario[] users = new Usuario[5];
        ContaBancaria contaBancaria = new ContaBancaria();
       
       
       
        while(opcao != 3){
        //1º Tela
            System.out.println("***BANCO BRASIL***");
            System.out.println("1- Cadastro de Cliente");
            System.out.println("2- Cadastro de Conta");
            System.out.println("3- Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scan.nextInt();
       
            switch(opcao){
                case 1:
                    for(int i=0; i<5 ; i++){
                        user = new Usuario();
                        System.out.println("***CADASTRO DE CLIENTE***");
                        System.out.println("Informe o Nome: ");                      
                        user.setNome(scan.next());
                        System.out.println("Informe o Sobrenome: ");
                        user.setSobrenome(scan.next());
                        System.out.println("Informe o Telefone: ");
                        user.setTelefone(scan.next());
                       
                        users[i] = user;
                    }
                    break;
                case 2:
                    System.out.println("***CADASTRO DE CONTA***");
                    System.out.println("Informe a Agência: ");
                    contaBancaria.setAgencia(scan.next());                  
                    System.out.println("Informe a Conta: ");
                    contaBancaria.setConta(scan.next());
                    System.out.println("CLIENTES CADASTRADOS");
                   
                    for(int i = 0; i<5 ; i++){
                        System.out.printf("%d- %s %s",i,users[i].getNome(),users[i].getSobrenome());
                    }
                   
                    System.out.println("Selecione o cliente: ");
                   
                    int userOpcao = scan.nextInt();
                           
                    for(int i=0; i<users.length; i++){
                        if(userOpcao-1 == i){
                            contaBancaria.setProprietario(users[userOpcao-1]);
                            existe = true;
                        }
                    }
                    if(existe==false){
                        System.out.println("O cliente informado não existe!");
                        break;
                    }
                    System.out.println("Insira o saldo inicial do cliente: ");
                    contaBancaria.setSaldo(scan.nextDouble());
                    break;                                  
                case 3:
                    System.out.println("***ATÉ BREVE!***");
                    System.out.println("Cliente(s) cadastrado(s) com uma conta: "+ contaBancaria.getProprietario().getNome());
                    break;  
                default:
                    System.out.println("Opção Inválida!");
               
            }
        }
       
       
       
    }
   
}