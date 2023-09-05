public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println( " TV Ligada? "  + smartTv.ligada);
        System.out.println( " Canal Atual: " + smartTv.canal);
        System.out.println( " Volume Atual: " + smartTv.volume);

        smartTv.ligar();
        System.out.println( " Novo Status - " + smartTv.ligada);

        smartTv.desligar();
        System.out.println( " Novo Status - " + smartTv.ligada);
        
     
        smartTv.aumentarVolume();
        System.out.println( " Novo Volume - " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println( " Novo Volume - " + smartTv.volume);

        smartTv.mudarCanal(15);
        System.out.println( " Novo Canal - " + smartTv.canal);

        smartTv.aumentarCanal();
        System.out.println( " Novo Canal - " + smartTv.canal);
        
        smartTv.diminuirCanal();
        System.out.println( " Novo Canal - " + smartTv.canal);
        


    }
}
