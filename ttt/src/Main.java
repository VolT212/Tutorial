import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //System.out.println("Podaj jakiś napis:");



        //String text = scanner.next();
        //System.out.println("Podaj rok:");
        //int rok = scanner.nextInt();
        //int length = text.length();
        //int samo = 0;
        //int spol = 0;


        /*for (int x = 0; x < length / 2 + 1; x++) {
            if (x == length - 1 - x) {
                System.out.println("Słowo jest palindromem");
                break;
            }
            if (text.charAt(x) == text.charAt(length - 1 - x)) {
                System.out.print(x + " ");
                System.out.println(length - 1 - x);

            } else {
                System.out.println("Słowo nie jest palindromem");
                break;
            }


        }

        for (int b = 0; b < length; b++) {
            char character = text.charAt(b);
            if ('a' == character || 'e' == character || 'y' == character || 'o' == character || 'i' == character || 'u' == character ) {
                samo += 1;
            }


        }

        for (int b = 0; b < length; b++) {
            char character = text.charAt(b);
            if (!('a' == character || 'e' == character || 'y' == character || 'o' == character || 'i' == character || 'u' == character )) {
                spol += 1;
            }


        }

        if (rok%4 == 0 && rok%100 !=0 || rok%400 == 0){
            System.out.println("Podany rok jest przestępny");
        }
        else{
            System.out.println("Podany rok nie jest przestępny");
        }

        System.out.println("Liczba samogłosek w podanym wyrazie to: " + samo);
        System.out.println("Liczba spółgłosek w podanym wyrazie to: " + spol);*/
        /*int a = 0;
        int b = 0;
        while( b != -1){
            a +=b;
            System.out.println("Podaj liczbę (aby zakończyć wpisz -1)");
            b = scanner.nextInt();



        }
        System.out.println("Suma podanych liczb: " + a);*/



        /*double d = 0;
        int licznik = 0;
        while(true){
            System.out.println("Podaj liczbę (aby zakończyć wpisz -1)");
            double c = scanner.nextInt();
            if (c!= -1){
                d +=c;
                licznik++;}
            else {
                break;
            }




        }
        if (licznik >=1){
            System.out.println("Średnia arytmetyczna wynosi: " + d/licznik);
        }
        else {
            System.out.println("Nie można wyliczyć średniej gdy nie podano żadnej liczby");
        }*/

        /*double d = 0;
        int licznik = 0;
        while(true){
            System.out.println("Podaj liczbę (aby zakończyć wpisz -1)");
            double c = scanner.nextInt();
            if (c!= -1){
                d +=1/c;
                licznik++;}
            else {
                break;
            }




        }
        if (licznik >=1){
            System.out.println("Średnia harmoniczna wynosi: " + licznik/d);
        }
        else {
            System.out.println("Nie można wyliczyć średniej gdy nie podano żadnej liczby");
        }*/

        double d = 1;
        double licznik = 0;
        double c = 0;
        while(true){
            System.out.println("Podaj liczbę (aby zakończyć wpisz -1)");
            c = scanner.nextInt();
            if (c!= -1){
                d *=c;
                licznik++;}
            else {
                break;
            }




        }
        if (licznik >=1){
            System.out.println("Średnia harmoniczna wynosi: " + Math.pow(d,1/licznik));
        }
        else {
            System.out.println("Nie można wyliczyć średniej gdy nie podano żadnej liczby");
        }

        scanner.close();
    }
}
