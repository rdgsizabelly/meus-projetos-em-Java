package projetolivro;

public class Livro implements Publicado{
    private String titulo, autor;
    private int totPag, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPag = totPag;
        this.leitor = leitor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPag() {
        return totPag;
    }

    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String detalhes() {
        return "Livro{" + " titulo = " + titulo + ", autor = " + 
                autor + "\n totPag=" + totPag + ", pagAtual = " + pagAtual +
                "\n aberto = " + aberto + " \nleitor = " + leitor.getNome() + " sexo = " + leitor.getSexo() +
                " idade = " + leitor.getIdade() + " }" ;
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
    }

    @Override
    public void folhear(int p) {
        if(this.getPagAtual() <= 1 && p > this.getTotPag() - 1){
            this.setPagAtual(0);
        }else{
            this.setPagAtual(this.getPagAtual() + p);
        }
        
    }

    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
    
    
}
