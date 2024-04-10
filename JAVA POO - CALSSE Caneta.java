/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula01;

/**
 *
 * @author BELA
 */
public class Caneta {
    
    String marca;
    String cor;
    double ponta;
    int carga;
    boolean tampada;
    
    void status(){
        System.out.println("O modelo e: " + this.marca);
        System.out.println("A cor da caneta e: " + this.cor);
        System.out.println("A ponta e: " + this.ponta);
        System.out.println("A carga esta em: " + this.carga);
        System.out.println("A caneta esta tampada? " + this.tampada);
    }
    void rabisca(){
        System.out.println("Rabisco");
    }
    
    void tampar(){
        this.tampada = true;
    }
    
    void destampar(){
        this.tampada = false;
    }
}
