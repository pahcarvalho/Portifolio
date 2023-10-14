package edu.paloma.primeirasemana;
public class MinhaClasse {

    public static void main (String [] args){

        String primeiroNome = "Paloma";
        String segundoNome="Lima";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.print(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método" + primeiroNome.concat(" ").concat(segundoNome);

    }
    
}
