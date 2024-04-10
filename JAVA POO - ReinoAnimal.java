package reinoanimal;

public class ReinoAnimal {

    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        
        m.alimentar();
        r.emitirSom();
        p.locomover();
        a.emitirSom();
        
        Canguru c = new Canguru();
        Cachorro ca = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        PeixinhoDourado pe = new PeixinhoDourado();
        Arara ar = new Arara();
        
        System.out.println("");
        c.locomover();
        t.locomover();
        co.emitirSom();
        ca.emitirSom();
        pe.soltarBolha();
        ar.fazerNinho();
        ar.setIdade(12);
        ca.setCorPelo("Caramelo");
        System.out.println("Cor do cachorro: " + ca.getCorPelo());
        c.usarBolsa(false);
        c.usarBolsa();
    }
    
}
