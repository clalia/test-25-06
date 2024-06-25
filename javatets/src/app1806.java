import java.net.PasswordAuthentication;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class app1806 {
    public static void main(String[] args) {
      
        //es1();
        //es2();
        //es3();
        //es4();
        //es5();
        //es6();
        //es7();
        es8();
    }


    public static void es1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero intero positivo: ");
        int x=Integer.valueOf(sc.nextLine());
        if(x<0){
            System.out.println("Il numero non è positivo");
        }else{
            for(int i=x;i>=0;i--){
                System.out.println(i);
                sc.close();
            }
        }
    }

   
    
/** 
    Scrivi un programma che stampi la tabellina di un numero specificato
      dall'utente. Il programma dovrebbe:
      
      Chiedere all'utente di inserire un numero intero utilizzando la classe
      Scanner.
      Utilizzare un ciclo for per stampare la tabellina del numero inserito
      dall'utente.
      Stampare i risultati della tabellina.
*/ 

       public static void es2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci un numero intero: ");
        int x=Integer.valueOf(sc.nextLine());
        
        System.out.println("La tabellina del numero " + x + " è:");
        for(int i=1; i<=10;i++){
            int risultato= x*i;

            System.out.println(x + " x " + i + " = " + risultato);
            sc.close();
        } 
    }
/* 
    /* Scrivi un programma che cerchi un numero specificato dall'utente in un array
     * di numeri interi. Il programma dovrebbe:
     * 
     * Creare un array di numeri interi con valori random compresi tra 0 e 99
     * Chiedere all'utente di inserire un numero intero utilizzando la classe
     * Scanner.
     * Utilizzare un ciclo for per cercare il numero nell'array.
     * Stampare un messaggio che indica se il numero è presente nell'array.
*/

      public static void es3(){      
      Scanner sc = new Scanner(System.in);
      Random rnd = new Random();
      System.out.println("Inserisci la dimensione dell'array: ");
      int dim=10;

      int[]values=new int[dim];

      for(int x=0;x<dim;x++){
        values[x]=rnd.nextInt(100);
      }
      System.out.print("Array:"+ Arrays.toString(values));

      System.out.println("Inserisci un numero intero");
      int value=Integer.valueOf(sc.nextLine());

      boolean found=false;
      for(int rndValue:values){
        if(value==rndValue){
            found=true;
            break;
        }
    }
    System.out.println(found ?"Il numero è presente": "Il numero non è presente");



      
      }  
 

/* 
 Scrivi un programma che conti il numero di volte che un carattere specificato
     * dall'utente appare in una stringa. Il programma dovrebbe:
     * 
     * Chiedere all'utente di inserire una stringa e un carattere utilizzando la
     * classe Scanner.
     * Utilizzare un ciclo for per contare le occorrenze del carattere nella
     * stringa.
     * Stampare il conteggio delle occorrenze.
???*/
    public static void es4() {      
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      char c=sc.next().charAt(0);
      System.out.print("Inserisci una stringa: ");
      System.out.print("Inserisci un carattere: ");
      int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count++;
            
        System.out.println("Il carattere '" + c + "' appare " + count + " volte nella stringa.");
        sc.close();
            }
        }
    }
  

    public static void es5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una stringa:");
        String s = sc.nextLine();

        System.out.print("I caratteri in posizione pari sono: ");
        for (int i=0; i< s.length(); i+=2) {
                System.out.print(s.charAt(i));
            }
        }
    


    public static void es6(){ 
        Scanner sc = new Scanner(System.in);
        System.out.print("Inserisci una stringa:");
        String s = sc.nextLine();

        String rvsStr="";
        for(int i=s.length() -1; i>=0;i--){
            rvsStr+= s.charAt(i);
        }
        System.out.println("La stringa invertita è: " + rvsStr);
    }

//Chiedere all'utente di inserire la dimensione dell'array e riempire l'array di numeri random compresi tra 0 e 99.Utilizzare un ciclo for per sommare solo i numeri pari nell'array.Stampare la somma risultante.
    public static void es7(){
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        System.out.println("Inserisci la dimensione dell'array: ");
        int dim = Integer.valueOf(sc.nextLine());

        

        int[] arr = new int[dim];
        
        for (int x = 0; x < dim; x++) {

            arr[x] = rnd.nextInt(100);
        }
        int sommaPari = 0;
        for (int num : arr) {
            if (num % 2 == 0) { 
                sommaPari += num;
            }
        }

        System.out.println("La somma dei numeri pari nell'array è: " + sommaPari);
    }


    public static void es8(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci una password: ");
        String p = sc.nextLine();
        boolean flagLong=false;
        boolean flagNumberfalse;
        boolean flagUpper=false;
        boolean flagLower=false;
        boolean flagSpecial=false;

        for(char c: PasswordAuthentication.toCharArray()){
            if(c>'0' && c<'9'){
                flagNumber=True;
            else if (c>'A' && c < 'Z')
            

    }

    


        
        public static boolean lung(String p){
            if(p.length()>=8){
                return true;
            }else{
                return false;
            }
        }
        public static boolean contNum(String p){
            for(char c : p.toCharArray()){
                if(Character.isDigit(c)){
                    return true;
                }
            }
            return false;
        }
        public static boolean MinMai(String p){
            boolean maiuscola=false;
            boolean minuscola=false;
            for(char c: p.toCharArray()){
                if(Character.isUpperCase(c)){
                    maiuscola=true;
                }
                if(Character.isLowerCase(c)){
                    minuscola=true;
                }
            }
            return minuscola && maiuscola;
        }
        public static boolean carSpec(String)
        









    









     

            







      

