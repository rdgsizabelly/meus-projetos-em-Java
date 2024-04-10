/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author BELA
 */
public class ProjetoYoutube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1");
        v[1] = new Video("Aula 2");
        v[2] = new Video("Aula 3");
        //System.out.println(v[0].toString());
        
        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Jujuba", "F", 20, "juju");
        g[1] = new Gafanhoto("Lelo", "F", 21, "lelo");
        //System.out.println(g[0].toString());
        Visualizacao vis[] = new Visualizacao[5];
        vis[0] = new Visualizacao(g[0], v[1]);
        vis[0].avaliar();
        System.out.println(vis[0].toString());
        vis[1] = new Visualizacao(g[0], v[0]);
        vis[0].avaliar(8);
        System.out.println(vis[1].toString());
    }
    
}
