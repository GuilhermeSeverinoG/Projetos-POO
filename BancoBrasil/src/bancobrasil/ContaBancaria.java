
package bancobrasil;

/**
 * @author Guilherme Severino Galvão
 */
public class ContaBancaria {
    //Atributos(caracteristicas) da classe
    private String agencia;
    private String conta;
    private double saldo;
    private Usuario proprietario;
    
    //Método construtor
    public ContaBancaria(){}

    public ContaBancaria(String agencia,String conta,double saldo,Usuario proprietario){
        this.agencia=agencia;
        this.conta=conta;
        this.saldo=saldo;
        this.proprietario=proprietario;
    }
    //Métodos Getters e Setters
    public String getAgencia(){
        return agencia;
    }
    public String getConta(){
        return conta;
    }
    public String getSaldo(){
        return saldo;
    }
    public String getProprietario(){
        return proprietario;
    }
    public void setAgencia(String agencia){
        this.agencia=agencia;
    }
    public void setConta(String conta){
        this.conta=conta;
    }
    public void setSaldo(String saldo){
        this.saldo=saldo;
    }
    public void setProprietario(String proprietario){
        this.proprietario=proprietario;
    }

    //Metodos (comportamentos) da classe
    void depositar(double valor){  //Método com parâmetro
        this.saldo += valor;
        
    }
    
    void sacar(double valor){ //Método com parâmetro
        //Insuficiência de saldo
        if(valor>this.saldo){
            System.out.println("O seu saldo é insuficiente");
        }else{
            //Saque normal
            this.saldo -= valor;
        }
        
    }
    
    void transferir(ContaBancaria contabancaria, double valor){
        if(valor<=saldo){
            this.sacar(valor);
            contabancaria.saldo += valor;
        }
        else{
            System.out.println("Saldo insuficiente");
        }      
    }
    
    String consultarSaldo(){  //Método sem parâmetro
        //String.format() método da classe String para utilizar formatação com
        //identificadores(%d , %f , %s , %.2f)
        return String.format("Seu saldo é: R$ %.2f",this.saldo);
    }
    
    
    
    
    
    
    
}
