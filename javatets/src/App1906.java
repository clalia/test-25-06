public class App1906 {

    public static void main(String[] args) {
        es1();
    }

    public static void es1() {
        Circle c = new Circle(5);
            
        System.out.println(c);
        System.out.println("c x: " + c.raggio);
        
        System.out.println("c getPer: " + c.getPer());
        System.out.println("c getArea: " + c.getArea());
    
        
        Student s1 = new Student("Claudia", "Lia", 269060);
        Student s2 = new Student("Sara", "Bar", 204840);

        System.out.println(s1.getDetails());
        System.out.println(s2.getDetails());
        System.out.println(s1);
        System.out.println(s2);

        Auto a1 = new Auto("Fiat", "Bravo", "CS456TG");
        Auto a2 = new Auto("Audi", "A1", "DF789YT");

        System.out.println(a1.getDetails());
        System.out.println(a2.getDetails());
        System.out.println(a1);
        System.out.println(a2);

        Rombo x1 = new Rombo(2, 7, 4);
        Rombo x2 = new Rombo(-1, 10, 8);
        Rombo x3 = new Rombo(10, 14, 16);
        
        Rombo[] rombi={x1,x2,x3};
        int maxArea=Integer.MIN_VALUE;{
        for(Rombo rombo:rombi){
            if(rombo.getArea()> maxArea){
                maxArea=rombo.getArea();

            }
        }
        System.out.println("Il rombo con l'area maggiore è: " + maxArea);
    }



        System.out.println(x1.getDetails());
        System.out.println(x2.getDetails());
        System.out.println(x3.getDetails());
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
    }
}
    

