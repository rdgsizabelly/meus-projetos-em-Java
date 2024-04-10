package uef;

public class Lutador {
    //Atributos
    private String nome, nacionalidade, categoria;
    private float peso, altura;
    private int idade, vitoria, derrota, empate;
    //Metodos especiais

    public Lutador(String no, String na, float pe, float al, int id, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.setPeso(pe);
        this.altura = al;
        this.idade = id;
        this.vitoria = vi;
        this.derrota = de;
        this.empate = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria() {
        if(peso < 52.2){
            this.categoria = "Invalido";
        }else if(peso <= 70.3){
            this.categoria = "Leve";
        }else if(peso <= 83.9){
            this.categoria = "Medio";
        }else if(peso <= 102.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
        }
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    //Metodos publicos
    public void apresentar(){
        System.out.println("-------------------------------------------------");
        System.out.println("CHEGOU A HORA! Apresentamos o lutador " + this.getNome());
        System.out.println("de " + this.getNacionalidade());
        System.out.println("com " + this.getIdade() + " anos e com " + this.getAltura() + "m");
        System.out.println("pesando " + this.getPeso() + "KG");
        System.out.println("com " + this.getVitoria() + " vitorias");
        System.out.println(this.getDerrota() + " derrotas e ");
        System.out.println(this.getEmpate() + " empates!");
    }
    public void status(){
        System.out.println("-----------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitoria() + " vezes");
        System.out.println("Perdeu " + this.getDerrota() + " vezes");
        System.out.println("Empatou " + this.getEmpate() + " vezes");
    }
    public void ganharLuta(){
        this.setVitoria(this.getVitoria() + 1);
    }
    public void perderLutar(){
        this.setDerrota(this.getDerrota() + 1);
    }
    public void empatarLutar(){
        this.setEmpate(this.getEmpate() + 1);
    }
}
