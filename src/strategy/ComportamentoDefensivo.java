package strategy;

public class ComportamentoDefensivo implements iComportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se defensivamente...");
    }
    
}
