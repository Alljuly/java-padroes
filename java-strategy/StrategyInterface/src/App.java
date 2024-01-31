public class App {
    public static void main(String[] args) throws Exception {
     Comportamento normal = new ComportamentoNormal();
     Comportamento defensivo = new ComportamentoDefensivo();
     Comportamento agressivo = new ComportamentoAgressivo();

    Robo robo = new Robo();

        robo.setStrategy(normal);
        robo.mover();
        robo.setStrategy(agressivo);
        robo.mover();
        robo.setStrategy(defensivo);
        robo.mover();

    
    }
}
