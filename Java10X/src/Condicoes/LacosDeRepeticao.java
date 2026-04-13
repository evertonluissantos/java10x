package Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        /*
        * Laços de Repeticao: Vão se repetir infinitamente ou até voce querer
        * WHILE = FOR
        * */

        // while
        // while (condicao) {Tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        /*while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clone das sombras! " + numeroDeClones);
        }*/

        // FOR

        for (int i = 0; i <= numeroMaximoDeClones; i++) {
            System.out.println("O Naruto está fazendo clones da sombra e já fez " + i);
        }
    }
}
