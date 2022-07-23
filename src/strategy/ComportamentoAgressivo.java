package strategy;

public class ComportamentoAgressivo implements iComportamento{

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }
    
}
