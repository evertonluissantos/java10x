package Condicoes;

public class Condicoes {
    public static void main(String[] args) {

        /*
        IF e ELSE - Condicoes
        ELSE e IF
        *  Objetivo: Passar o ninja de nível de acordo com o numero de missoes
        * */

        // Ninja Naruto
        String nome = "Naruto Uzumaki";
        String rank = "";

        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 20;


        //se (condicao) {faça isso}
        if(numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }

    }
}
