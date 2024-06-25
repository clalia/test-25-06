
public class App2 {

    public static void main(String[] args) {

        // prendere 3 numeri dall'utente e sommarli tra
        // loro dopo averli salvati in un array
        int arr[] = {-17, 19, 21, 23, -25, 27, 29, 31, -33, 35, 30};

/* 
        Scanner sc = new Scanner(System.in);
         
        int[] arr = new int[3];

        for (int x = 0; x < arr.length; x++) {

            System.out.println("Inserisci un numero: ");
            int value = Integer.parseInt(sc.nextLine());
            arr[x] = value;
        }

        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int value : arr) {
            sum += value;
        }

        System.out.println("La somma dei valori inseriti è: " + sum);

        // trovare la media
        double avg = (double) sum / arr.length;

        System.out.println("La media dei valori inseriti è: " + avg);

        // trovare il valore massimo
        int max = Integer.MIN_VALUE;
        for (int value : arr) {

            if (value > max) {
                max = value;
            }
        }

        System.out.println("Il valore massimo è: " + max);
    */
        //valore minimo
        int min = Integer.MAX_VALUE;
        for (int value : arr) {

            if (value < min) {
                min = value;
            }
        }
        System.out.println("Il valore minimo è: " + min);
 

        //trovo la sommatoria
        int sum= 0;
        for(int value:arr){
            sum+=value;
        }
        System.out.println("La somma dei valori inseriti è: " + sum);
        
        // media
        double avg = (double) sum / arr.length;

            System.out.println("La media dei valori inseriti è: " + avg);

        //stampo valori negativi
        for(int value:arr){
            if(value<0){
                System.out.println("I valori negativi sono:" + value);
            }
        }    

        //valori pari
        for(int value:arr) { 
            if(value %2==0){
                System.out.println(value);
            }
        } 
        System.out.println("Valori pari:");   

        for(int val=0; val<arr.length; val++){
            if(val %3==0){     
                System.out.println(val);
            }
        }    
        System.out.println("Valori dispari:");
                
        for (int val1 = 0; val1 < arr.length; val1++) {
                    // Controllare se l'elemento è un multiplo di 3
            if (val1 % 3 == 0) {
                        // Stampare il valore multiplo di 3
                System.out.println(val1);
            }
        }
        System.out.println("I valori multipli di 3 nell'array sono:");
        
                // Stampare tutti i valori multipli di 5
                
        for (int val2 = 0; val2 < arr.length; val2++) {
            if (arr[val2] % 5 == 0) {
                System.out.println(val2);
            }
        }
        System.out.println("I valori multipli di 5 nell'array sono:" );



// Stampare tutti i valori finché non si incontra un multiplo di 3
        for (int value : arr) {

            if (value % 3 == 0) {
            break;
            }
        
        System.out.println(value);      
                        
        }
    }
}
        
            




   
       


