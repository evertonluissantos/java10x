package TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        // Tudo que for digitado aqui dentro com o comando

        /*
         *  Dados nao primitivos: String, Array, Class, enum.
         * */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // ToUppercase vai colocar tudo em capslock
        System.out.println("Esse texto está normal: " + nome);
        System.out.println("Esse texto está em CAPSLOCK: " + nomeUpperCase);

        String aldeia = "ALDEIA DA FOLHA";
        String nomeToLoweCase = aldeia.toLowerCase(); // ToLowerCase vai colocar tudo em minusculo
        System.out.println(nomeToLoweCase);
    }
}
