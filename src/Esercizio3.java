import java.sql.SQLOutput;
import java.util.Scanner;

public class Esercizio3 {

    public static int perimetro(int base, int altezza) {
        return (base + altezza) * 2;
    }

    public static int pariOdisp(int numero) {
        if ((numero % 2) == 0) {return 0;}
        else {return 1;}
    }


    public static void main(String[] args) {

        /*----------- Calcolo perimetro -----------*/

        System.out.println("Calcola perimetro rettangolo:");
        Scanner Scan = new Scanner(System.in);
        int base = Scan.nextInt();
        int altezza = Scan.nextInt();

        System.out.println("Risultato: " + perimetro(base, altezza));

        /*----------- Pari o dispari? -----------*/

        System.out.println("Inserisci il tuo numero:");

        int numero = Scan.nextInt();
        System.out.println("Il tuo numero è:" + pariOdisp(numero));

    }
}
