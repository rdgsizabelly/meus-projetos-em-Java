/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade03;

/**
 *
 * @author BELA
 */
public class Conta03 {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public void Conta03(){
        this.setSaldo(0);
        this.setStatus(false);
    }
    public void extrato(){
        System.out.println("---------------------------------------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
    }
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getDono() {
        return dono;
    }
    public void setDono(String dono) {
        this.dono = dono;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if("CC".equals(t)){
            this.setSaldo(50);
        }else{
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta com dinheiro");
        }else if(this.getSaldo() < 0){
            System.out.println("Conta com debito");
        }else{
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso");
        }
    }
    public void deposito(double v){
        if(getStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Deposito realizado com sucesso na conta de " + this.getDono());
        }else{
            System.out.println("Impossivel sacar");
        }
    }
    public void sacar(double v){
        if(this.getStatus() && this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque feito com sucesso na conta de + " + this.getDono());
        }else{
            System.out.println("Saldo insuficiente");
            System.out.println("Impossivel sacar");
        }
    }
    public void pagarMensal(){
        double v = 0;
        if("CC".equals(this.getTipo())){
            v = 12;
        }else if ("CP".equals(this.getTipo())){
            v = 20;
        }
        if(this.getStatus() && this.getSaldo() > v ){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso");
        }else{
            System.out.println("Saldo insuficiente");
            System.out.println("Impossivel sacar");
        }
    }
}
