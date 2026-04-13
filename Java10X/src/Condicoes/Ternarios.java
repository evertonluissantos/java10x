package Condicoes;

public class Ternarios {

    public static void main(String[] args) {

        /*
        * Ternarios: São maneiras de reduzir o código
        * variavel = (condição) ? valorSeVerdadeiro : valorSeFalso;
        * */

        short numeroDeMissoes = 11;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missÕes" : "Esse ninja não tem 10 missões";

        System.out.println(nivelDoNinja);

    }

}
