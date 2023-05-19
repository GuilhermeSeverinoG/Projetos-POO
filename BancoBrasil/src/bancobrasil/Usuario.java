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
    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dataRegistro = new Date();

    //Método construtor
    public Usuario(){}
    //Métodos de encapsulamento GET e SET
    public Usuario(String nome,String sobrenome,String telefone){
        this.nome=nome;
        this.sobrenome=sobrenome;
        this.telefone=telefone;
    }
    public String getNome(){
        return this.nome;
    }
    public String getSobrenome(){
        return this.sobrenome;
    }
    public String getTelefone(){
        return this.telefone;
    }
    public String getDataRegistro(){
        return this.dataRegistro;
    }
    public void setNome(String nome){
        this.nome=nome;
    }
    public void setSobrenome(String sobrenome){
        this.sobrenome=sobrenome;
    }
    public void setTelefone(String telefone){
        this.telefone=telefone;
    }
    public void setDataRegistro(Date dataRegistro){
        this.dataRegistro=dataRegistro;
    }
    //Métodos
    String imprimirInfo(){
        return String.format("O nome do usuário é: %s\n Sobrenome: %s\n Telefone: %s\n Data de registro: %s",
                            this.nome,this.sobrenome,this.telefone,this.dataRegistro);
    }
                      
            
}
