import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /* 
         Scanner scanner= new Scanner(System.in);
         System.out.println("Inserisci un numero : ");
        int x= Integer.valueOf(scanner.nextLine());
        System.out.println("Inserisci un altro numero : ");
        int y=Integer.valueOf(scanner.nextLine());
        System.out.println("La somma è "+ (x+y));
        System.out.println("La differenza è " +(x-y));
        System.out.println("Il prodotto è "+ (x*y));
        System.out.println("Il quoziente è " + ((double)x/(double)y));
        

        System.out.println("Inserisci nome: ");
        String name=scanner.nextLine();
        System.out.println("Inserisci cognome:");
        String cognome=scanner.nextLine();
        System.out.println("Hello "+ name +  cognome);
        scanner.close();
        

        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci un numero : ");
        int x= Integer.valueOf(scanner.nextLine());
        System.out.println("Inserisci un altro numero : ");
        int y=Integer.valueOf(scanner.nextLine());
        if(x>y){
            System.out.println("x è maggiore di y");
        } else if(x<y){
            System.out.println("x è minore di y");
        }else {
            System.out.println("x e y sono uguali");
        }           
       
        System.out.println("Inserisci un numero : ");
        int z= Integer.valueOf(scanner.nextLine());
        int w =z*100;
        System.out.println("Numero moltiplicato : " + w);
        if (w>500){
            System.out.println("w è maggiore di 500");
        } else {
            System.out.println("w è minore di 500");
        }    

int y=11;
int z=y>10 ? 10:20;
System.out.println("z: " + z);
*/
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci un numero : ");
        int x= Integer.valueOf(scanner.nextLine());
        if(x % 2==0){
            System.out.println("Il numero è pari");
        } else {
            System.out.println("Il numero è dispari");
        }
       
        if (x % 3 == 0 && x % 5 == 0) {
            System.out.println("Il numero divide esattamente 3 e 5.");
        } else {
            
            System.out.println("Il numero non divide esattamente 3 e 5.");
        }
        if (x > 0 && x < 100) {
            System.out.println("Il numero è positivo e minore di 100.");
        } else {
            System.out.println("Il numero non è positivo oppure è maggiore o uguale a 100.");
        }

        

        //esercizio 2. richiedi all'utente di inserire due numeri e stamparli in ordine decrescente (dal piu' grande al piu' piccolo)
        
        System.out.println("Inserisci due numeri : ");
        int val1= Integer.valueOf(scanner.nextLine());
        int val2= Integer.valueOf(scanner.nextLine());
        if(val1>val2) {
            System.out.println("Numeri in ordine decrescente: "+ val1 + "," + val2);
        
        //inserire un numero e creare una variabile di tipo stringa che conterra' 'ok' se il numero e' positivo, 'ko' altrimenti. Stampare la stringa.
        System.out.println("Inserisci un numero : ");
        int val3= Integer.valueOf(scanner.nextLine());
        String stato= val3>0 ? "ok":"ko";
        System.out.println(stato);

        //
        System.out.println("Inserisci un numero : ");
        double val4= scanner.nextDouble();
        val4 += 100;
        System.out.println("val4: " + val4);
        val4 -= 65;
        System.out.println("val4: " + val4);
        val4 *= 3;
        System.out.println("val4: " + val4);
        val4 /= 6;
        System.out.println("val4: " + val4);

        if(val4 == (int) val4){
            System.out.println("Il risultato finale è un numero intero.");
        } else {
            System.out.println("Il risultato finale contiene dei decimali.");


            
        }    
    }
}
}    
       
        

       
        


     




    
