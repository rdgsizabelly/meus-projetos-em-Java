/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula01;

import java.util.Scanner;

/**
 *
 * @author BELA
 */
public class Aula01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Caneta c1 = new Caneta();
        System.out.println("Digite a cor da caneta:");
        c1.cor = teclado.next();
        System.out.println("Digite a marca:");
        c1.marca = teclado.next();
        System.out.println("Digite o tamanho da ponta: ");
        c1.ponta = teclado.nextDouble();
        System.out.println("Digite a carga: ");
        c1.carga = teclado.nextInt();
        c1.tampada = true;
        c1.status();
        System.out.println("Deseja rabiscar?[S/N]");
        String resp = teclado.next();
        int rab = 0; 
        do{
            if("S".equals(resp)){
                rab++; 
                if(c1.tampada){
                    c1.destampar();
                    c1.rabisca();
                }else{
                    c1.rabisca();
                }
                System.out.println("Deseja rasbiscar novamente?[S/N]");
                resp = teclado.next();
            }
            if("N".equals(resp)){
                c1.tampar();
            }
        }while("S".equals(resp));
        System.out.println("A quantidade de rabiscos foram: " + rab);
    }
}