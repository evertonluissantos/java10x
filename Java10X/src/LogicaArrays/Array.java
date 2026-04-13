package LogicaArrays;

public class Array {
    public static void main(String[] args) {

        // Arrays são tipo referencia!
        String[] ninja = new String[5];
        ninja[0] = "Naruto uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[4]);

        // Redeclarar
        ninja = new String[7];
        ninja[0] = "Hashirama Senju";
        ninja[1] = "Tobirama Senju";
        ninja[2] = "Hiruzen Sarutobi";
        ninja[3] = "Minato Namikaze";
        ninja[4] = "Tsunade Senju";
        ninja[5] = "Kakashi Hatake";
        ninja[6] = "Naruto Uzumaki";
        System.out.println(ninja[2]);

        // for para fazer o loop no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

        // Array idade
        int[] idade = new int[2];
        idade[0] = 16;
        System.out.println(idade);
    }

}