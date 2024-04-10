package reinoanimal;

public class Canguru extends Mamifero{
    public void usarBolsa(){
        System.out.println("Bebe na bolsa");
    }
    public void usarBolsa(boolean op){
       if(op){
           System.out.println("Bebe na bolsa");
       }else{
           System.out.println("Bebe fora da bolsa");
       }
    }

    @Override
    public void locomover() {
        System.out.println("Saltando");
    }
    
}
