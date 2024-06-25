
import java.util.Arrays;
import java.util.Scanner;

public class App3 {
    public static void main(String[] args) throws Exception {
    String str="Hello Word";
    System.out.println(str);
    str="Hello"+"from";
    System.err.println(str);

    char[] arrStr=str.toCharArray(); //scompone i caratteri
    System.out.println(Arrays.toString(arrStr));

    for(char c: arrStr){
        System.out.println(c);
    }
//chiedere all'utente quanti numeri vuole inserire,creare poi un array di interi di quella di mensione
        // e chiedere all'utente ogni numero da inserire

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci quanti numeri vuoi inserire: ");
        int n= Integer.valueOf(scanner.nextLine());

        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci il numero :"+(i+1)+ ":");
            arr[i]= Integer.parseInt(scanner.nextLine());
            
        }
        System.out.println("I numeri inseriti sono:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }


        //solo numeri pari
        System.out.print("Inserisci quanti numeri vuoi inserire: ");
        int x= Integer.valueOf(scanner.nextLine());

        int[] numeri = new int[x];
        for (int i = 0; i < x; i++) {
            int numero;
            do{
                System.out.print("Inserisci il numero pari: " + (i + 1) + ": ");
                numero = scanner.nextInt();  // Leggere il numero dall'utente
                if (numero % 2 != 0) {
                    System.out.println("Devi inserire un numero pari. Riprova.");
                }
            }while  (numero%2==0);
            numeri[i] = numero;
        System.out.println("I numeri pari inseriti sono:");
        for (int y = 0; y < n; y++) {
            System.out.println(numeri[i]);  
        }
        
        //lunghezza stringa
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine(); 
        int lunghezza = input.length();
        System.out.println("La stringa inserita contiene " + lunghezza + " caratteri.");


        // Chiedere all'utente di inserire una stringa
        System.out.print("Inserisci una stringa: ");
        String inpuString= scanner.nextLine();
        // Contare i caratteri maiuscoli nella stringa
        int contatoreMaiuscole = 0;
        for (int b = 0; b < inpuString.length(); b++) {
            char carattere = input.charAt(i);
            if (Character.isUpperCase(carattere)) {
                contatoreMaiuscole++;
            }
        }

        // Stampare il numero di caratteri maiuscoli nella stringa
        System.out.println("La stringa inserita contiene " + contatoreMaiuscole + " caratteri maiuscoli.");
    }
}
    }

  




        