import java.util.Scanner;

public class Esercizio2 {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Inserisci tre parole:");
        String a = scanner.next(); //attende un numero
        String b = scanner.next();
        String c = scanner.next();

        System.out.println("Stringa concatenata:");
        System.out.print(a + " " + b + " " + c);
    }
}
