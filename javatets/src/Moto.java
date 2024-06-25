public class Moto extends Veicolo {
    boolean bauletto;
    boolean casco;
    public Moto(String marca, String modello, boolean baluetto, boolean casco){
        super(marca,modello);
        setBauletto(bauletto);
        this.casco=casco;
    }
    public boolean getBauletto(){
        return bauletto;
    }
    public void setBauletto(boolean bauletto){
        this.bauletto=bauletto;   
    }
    public boolean getCasco(){
        return casco;
    }
    public void setCasco(boolean casco){
        this.casco=casco;
    }
    public String toString() {
        return "Moto [Marca=" + getMarca() + ", Modello=" + getModello() +
               ", Bauletto=" + (bauletto ? "Sì" : "No") + ", Casco=" + (casco ? "Sì" : "No") + "]";
    
    }



}
