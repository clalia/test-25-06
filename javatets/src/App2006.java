public class App2006 {
    public static void main(String[] args) {

        System.out.println("The end");

        // Creazione di un'istanza di Veicolo
        Veicolo veicolo = new Veicolo("Toyota", "Corolla");
        System.out.println(veicolo);

        // Creazione di un'istanza di Auto
        Auto auto = new Auto("Ford", "Mustang", 5000, 450);
        System.out.println(auto);

        // Creazione di un'istanza di Camion
        Camion camion = new Camion("Volvo", "FH16", 13000, 540, 20000, true);
        System.out.println(camion);

        // Creazione di un'istanza di Moto
        Moto moto = new Moto("Yamaha", "MT-07", true, true);
        System.out.println(moto);
    }
    public static void testAutoManager() {

        AutoManager manager = new AutoManager();
        

        Auto auto1 = new Auto("Fiat", "Bravo", 3000, 150);
        Auto auto2 = new Auto("Citroen", "Jumper", 2500,120);
        Auto auto3 = new Auto("Fiat", "Ducato", 2000, 100);
        Auto auto4 = new Auto("Renault", "Master", 2200, 110);
        Auto[] autosToAdd = {auto1, auto2, auto3, auto4};
        manager.addAll(autosToAdd);

        manager.add(auto1);
        manager.add(auto2);
        manager.add(auto3);
        manager.add(auto4);
        

        System.out.println(manager);
        System.out.println(manager.getMaxPotenzaAuto());
        manager.remove();
        System.out.println(manager);

        manager.remove(1);
        System.out.println(manager);

    }
}
    
    