public class Usuario {
     public static void main (String[] args)throws Exception{
      
        SmartTv smartTv = new SmartTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        System.out.println("O volume atual é " + smartTv.volume);

        smartTv.diminuirVolume();
        System.out.println("O volume atual é " + smartTv.volume);



        System.out.println("TV ligada?" + smartTv.ligada);
        System.out.println("Qual o canal atual?" + smartTv.canal);
        System.out.println("Qual o volume atual?" + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status - : TV ligada?" + smartTv.ligada);

    }

}
