/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bancobrasil;

import java.util.Date;

/**
 *
 * @author Guilherme Severino Galvão
 */
public class Usuario {
    //Atributos
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date();
    
    //Métodos
    String imprimirInfo(){
        return String.format("O nome do usuário é: %s\n Sobrenome: %s\n Telefone: %s\n Data de registro: %s",
                            this.nome,this.sobrenome,this.telefone,this.dataRegistro);
    }
                      
            
}