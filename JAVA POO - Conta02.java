/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package atividade03;

import java.util.Scanner;

/**
 *
 * @author BELA
 */
public class Atividade03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Conta03 p1 = new Conta03();
        Conta03 p2 = new Conta03();
        int dep = 0;
        int saq = 0;
        int fec = 0;
        System.out.print("Digite um numero para sua conta: ");
        p1.setNumConta(teclado.nextInt());
        System.out.print("Digite seu primeiro nome: ");
        p1.setDono(teclado.next());
        System.out.println("Qual tipo de conta voce deseja?"
                + "['CC' PARA CONTA CORRENTE / 'CP' PARA CONTA POUPANÇA]");
        p1.abrirConta(teclado.next());
        System.out.println("Deseja fazer um deposisito?['1' PARA SIM / '2' PARA NAO]");
        dep = teclado.nextInt();
        if(dep == 1){
            System.out.println("Digite o valor");
            p1.deposito(teclado.nextDouble());
            System.out.println("Deja fazer um saque?['1' PARA SIM / '2' PARA NAO]");
            saq = teclado.nextInt();
            if(saq == 1){
                System.out.println("Digite o valor do saque");
                p1.sacar(teclado.nextDouble());
            }
        }
        p1.pagarMensal();
        System.out.println("Deseja fechar a conta?['1' PARA SIM / '2' PARA NAO]");
        fec = teclado.nextInt();
        if(fec == 1){
            p1.fecharConta();
            while(p1.getStatus()){
                System.out.println("Retire seu dinheiro");
                System.out.println("Seu saldo: " + p1.getSaldo());
                System.out.println("Retire seu dinheiro");
                p1.sacar(teclado.nextDouble());
                p1.fecharConta();
            }
        }
        
        System.out.print("Digite um numero para sua conta: ");
        p2.setNumConta(teclado.nextInt());
        System.out.print("Digite seu primeiro nome: ");
        p2.setDono(teclado.next());
        System.out.println("Qual tipo de conta voce deseja?"
                + "['CC' PARA CONTA CORRENTE / 'CP' PARA CONTA POUPANÇA]");
        p2.abrirConta(teclado.next());
        System.out.println("Deseja fazer um deposisito?['1' PARA SIM / '2' PARA NAO]");
        dep = teclado.nextInt();
        if(dep == 1){
            System.out.println("Digite o valor");
            p2.deposito(teclado.nextDouble());
            System.out.println("Deja fazer um saque?['1' PARA SIM / '2' PARA NAO]");
            saq = teclado.nextInt();
            if(saq == 1){
                System.out.println("Digite o valor do saque");
                p2.sacar(teclado.nextDouble());
            }
        }
        p2.pagarMensal();
        System.out.println("Deseja fechar a conta?['1' PARA SIM / '2' PARA NAO]");
        fec = teclado.nextInt();
        if(fec == 1){
            p2.fecharConta();
            while(p2.getStatus()){
                System.out.println("Retire seu dinheiro");
                System.out.println("Seu saldo: " + p2.getSaldo());
                p2.sacar(teclado.nextDouble());
                p2.fecharConta();
            }
        }
        
        p1.extrato();
        p2.extrato();
    }
    
}
