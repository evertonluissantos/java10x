package TiposDeDados;

public class Desafio1 {
    public static void main(String[] args) {

        // ==================== NINJA 1 ====================
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 17;
        String missaoNinja1 = "Resgatar Gaara";
        char nivelDaMissao1 = 'S';
        String statusMissaoNinja1 = "";

        //Verificar nivel da missao e idade do ninja

        if(idadeNinja1 < 15) {
            if (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D'){
                statusMissaoNinja1 = "Concluida";
            } else {
                statusMissaoNinja1 = "Não concluida";
            }
        } else {
            statusMissaoNinja1 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idadeNinja1);
        System.out.println("Missão: " + missaoNinja1);
        System.out.println("Rank: " + nivelDaMissao1);
        System.out.println("Status da missão: " + statusMissaoNinja1);

        System.out.println("_________________________________________");

        // ==================== NINJA 2 ====================
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 17;
        String missaoNinja2 = "Derrotar Itachi";
        char nivelDaMissao2 = 'S';
        String statusMissaoNinja2 = "";

        if (idadeNinja2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusMissaoNinja2 = "Concluída";
            } else {
                statusMissaoNinja2 = "Não concluída";
            }
        } else {
            statusMissaoNinja2 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idadeNinja2);
        System.out.println("Missão: " + missaoNinja2);
        System.out.println("Rank: " + nivelDaMissao2);
        System.out.println("Status da missão: " + statusMissaoNinja2);

        System.out.println("_________________________________________");

// ==================== NINJA 3 ====================
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 17;
        String missaoNinja3 = "Resgatar Gaara";
        char nivelDaMissao3 = 'S';
        String statusMissaoNinja3 = "";

        if (idadeNinja3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusMissaoNinja3 = "Concluída";
            } else {
                statusMissaoNinja3 = "Não concluída";
            }
        } else {
            statusMissaoNinja3 = "Concluída";
        }

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idadeNinja3);
        System.out.println("Missão: " + missaoNinja3);
        System.out.println("Rank: " + nivelDaMissao3);
        System.out.println("Status da missão: " + statusMissaoNinja3);

        System.out.println("_________________________________________");

    }
}