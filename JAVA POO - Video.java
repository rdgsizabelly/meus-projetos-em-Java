/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projetoyoutube;

/**
 *
 * @author BELA
 */
public class Video implements AcoesVideos{
    private String titulo;
    private boolean reproduzindo;
    private int views, curtidas;
    private int avaliacao;

    public Video(String titulo) {
        this.titulo = titulo;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzindo = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int nova;
        nova = (this.getAvaliacao() + avaliacao) / 2;
        this.avaliacao = nova;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    
    @Override
    public void play() {
        this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        this.setReproduzindo(false); 
    }

    @Override
    public void like() {
        this.setCurtidas(this.getCurtidas() + 1);
    }

    @Override
    public String toString() {
        return  '{' + titulo + ", reproduzindo = " + reproduzindo + ", views = " + views + ", curtidas = " + curtidas + ", avaliacao = " + avaliacao + '}';
    }
    
}
