/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author BELA
 */
public class Conta {
    
    private int numConta;
    private int tipoConta;
    private double deposito;
    private double retirada;
    private double saldo = 0;

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(int tipoConta) {
        this.tipoConta = tipoConta;
    }
    
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo + deposito - retirada;
    }
    
    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = saldo + deposito;
    }

    public double getRetirada() {
        return retirada;
    }

    public void setRetirada(double retirada) {
        this.retirada = deposito - retirada;
    }
    public void status(){
        System.out.println("Numero da conta: " + this.numConta);
        System.out.println("Tipo da conta: " + this.tipoConta);
        System.out.println("Deposito: " + this.deposito);
        System.out.println("Retirada: " + this.retirada);
        System.out.println("Saldo: " + this.saldo);
    }
}
