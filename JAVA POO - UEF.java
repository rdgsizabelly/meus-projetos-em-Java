package uef;

public class UEF {

    
    public static void main(String[] args) {
       
        Lutador l[] = new Lutador[6];
        
        l[0] = new Lutador("Bibi lambe-picas", "França", 68.3f, 1.75f, 20, 11, 6, 3);
        l[1] = new Lutador("Lelo", "Italia", 57.8f, 1.68f, 29, 14, 2, 3);
        l[2] = new Lutador("Ralf", "EUA", 80.9f, 1.65f, 35, 12, 2, 1);
        l[3] = new Lutador("Chupinga", "Cuba", 81.6f, 1.9f, 28, 13, 0, 2);
        l[4] = new Lutador("[giria regional]", "Bahia", 119.3f, 1.70f, 37, 5, 4, 3);
        l[5] = new Lutador("Corno", "Recife", 105.7f, 1.80f, 30, 12, 2, 4);
        
        Luta UEF01 = new Luta();
        UEF01.marcarLuta(l[0], l[1]);
        UEF01.lutar();
        UEF01.marcarLuta(l[1], l[1]);
        UEF01.lutar();
        UEF01.marcarLuta(l[1], l[5]);
        UEF01.lutar();
        l[0].status();
        l[1].status();
        l[2].status();
        l[3].status();
        l[4].status();
        l[5].status();
        
    }
    
}
