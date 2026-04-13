package TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {

        // ==================== NINJA 1 ====================
        String nomeNinja1 = "Naruto Uzumaki";
        int idade1 = 16;
        String missao1 = "Resgate do Kazekage";
        String statusDaMissao1 = "Concluido"; // Status inicial
        char nivelDaMissao1 = 'S';

        // LÓGICA: Verificar se o ninja pode fazer a missão baseado na idade
        if(idade1 < 15) {
            // Se tem menos de 15 anos, só pode fazer missões C ou D
            if (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D') {
                statusDaMissao1 = "Concluída";
            } else {
                // Missões S, A ou B são muito difíceis para menores de 15
                statusDaMissao1 = "Não concluída - idade insuficiente";
            }
        } else {
            // Se tem 15 anos ou mais, pode fazer qualquer missão
            statusDaMissao1 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade1);
        System.out.println("Missão: " + missao1);
        System.out.println("Status da Missão: " + statusDaMissao1);
        System.out.println("Nível da Missão: " + nivelDaMissao1);
        System.out.println("_______________________________");

        // ==================== NINJA 2 ====================
        String nomeNinja2 = "Sakura Haruno";
        int idade2 = 16;
        String missao2 = "Escoltar o Construtor de Pontes";
        String statusDaMissao2 = "Concluido";
        char nivelDaMissao2 = 'S';

        if(idade2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Concluída";
            } else {
                statusDaMissao2 = "Não concluída - idade insuficiente";
            }
        } else {
            statusDaMissao2 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missão: " + missao2);
        System.out.println("Status da Missão: " + statusDaMissao2);
        System.out.println("Nível da Missão: " + nivelDaMissao2);
        System.out.println("_______________________________");

        // ==================== NINJA 3 ====================
        String nomeNinja3 = "Sasuke Uchiha";
        int idade3 = 16;
        String missao3 = "Reconhecimento da aldeia";
        String statusDaMissao3 = "Em andamento";
        char nivelDaMissao3 = 'S';

        if(idade3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Concluída";
            } else {
                statusDaMissao3 = "Não concluída - idade insuficiente";
            }
        } else {
            statusDaMissao3 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missão: " + missao3);
        System.out.println("Status da Missão: " + statusDaMissao3);
        System.out.println("Nível da Missão: " + nivelDaMissao3);
    }
}