public class app4 {
    public static void main(String[] args) throws Exception {

                
                String numStr = "3423908234";
        
                // Creare un array di interi della stessa lunghezza della stringa
                int[] numeri = new int[numStr.length()];
        
                // Iterare attraverso ogni carattere della stringa e convertirlo in un intero
                for (int i = 0; i < numStr.length(); i++) {
                    // Convertire il carattere in un intero
                    numeri[i] = Character.getNumericValue(numStr.charAt(i));
                }
        
                // Stampare l'array di interi
                System.out.println("L'array di interi è:");
                for (int i = 0; i < numeri.length; i++) {
                    System.out.print(numeri[i] + " ");
                }

                //a due cifre
                String numStr2 = "5543948298";
               
        

     
}


