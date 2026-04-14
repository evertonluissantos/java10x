package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCases: Que servem para gerar casos especificos
        * Objetivo: Pedir pro usuario escolher entre os ninjas
        * */

        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // Mostrar para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        // Pedirt para o usuario escolher uma da opcoes
        int escolhaDoUsuario = scanner.nextInt();
        System.out.println("Você digitou o número: " + escolhaDoUsuario);

        // Reacao ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuario escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuario escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Você não digitou nenhuma resposta válida");
        }

        scanner.close();

    }
}
