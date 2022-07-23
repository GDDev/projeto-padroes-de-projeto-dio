package strategy;

public class Robo {
    
    private iComportamento comportamento;

    public void setComportamento(iComportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover(){
        comportamento.mover();
    }

}
