public class Usuario {
     public static void main (String[] args)throws Exception{
      
        SmartTv smartTv = new smartTv();

        System.out.println("TV ligada?" + smartTv.ligada);
        System.out.println("Qual o canal atual?" + smartTv.canal);
        System.out.println("Qual o volume atual?" + smartTv.volume);
        

    }

}
