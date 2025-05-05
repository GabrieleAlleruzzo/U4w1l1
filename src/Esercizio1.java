public class Esercizio1 {

    public static void main(String[] args) {
        System.out.println(molt(2,4));
        System.out.println(concat("il risultato è: ",8));

        String[] arrayString = new String[5];
        arrayString[0] = "ciao";
        arrayString[1] = "hello";
        arrayString[2] = "hola";
        arrayString[3] = "wei";
        arrayString[4] = "meff";
    }

    public static int molt(int a, int b) {
        return a* b;
    }

    public static String concat(String a, int b) {
        return a + b;
    }

}
