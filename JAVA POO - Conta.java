/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade;

import java.util.Scanner;

/**
 *
 * @author BELA
 */
public class Atividade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        int criarConta;
        int ret;
        System.out.println("Deseja criar sua conta?[1 para sim/ 2 para nao]");
        criarConta = teclado.nextInt();
        if(criarConta == 1){
            System.out.println("Digite seu ano e mes de nascimento");
            c1.setNumConta(teclado.nextInt());
            System.out.println("Qual o tipo de conat que voce quer? [1 para "
                    + "conta corrente / 2 para conta poupanca]");
            c1.setNumConta(teclado.nextInt());
            System.out.println("Faça seu primeiro deposito!");
            c1.setDeposito(teclado.nextDouble());   
        }
        System.out.println("Deseja criar sua conta?[1 para sim/ 2 para nao]");
        criarConta = teclado.nextInt();
        if(criarConta == 1){
            System.out.println("Digite seu ano e mes de nascimento");
            c2.setNumConta(teclado.nextInt());
            System.out.println("Qual o tipo de conat que voce quer? [1 para "
                    + "conta corrente / 2 para conta poupanca]");
            c2.setNumConta(teclado.nextInt());
            System.out.println("Faça seu primeiro deposito!");
            c2.setDeposito(teclado.nextDouble());
            System.out.println("Deseja fazer retirada?[1 para sim / 2 para nao]");
            ret = teclado.nextInt();
            if(ret == 1){
                System.out.println("Quanto voce quer retirar?");
                c2.setRetirada(teclado.nextDouble());
            }
        }
        c1.status();
        System.out.println(" ");
        c2.status();
    }    
}
