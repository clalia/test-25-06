public class Camion extends Auto{
    private int carico;
    private boolean rimorchio;

    public Camion(String marca, String modello, int cilindrata, int potenza, int carico, boolean rimorchio){
        super(marca,modello,cilindrata,potenza);
        setCarico(carico);
        setRimorchio(rimorchio);
    }
    public int getCarico(){
        return carico;
    }
    public void setCarico(int carico){
        this.carico=carico;   
    }
    public boolean getRimorchio(){
        return rimorchio;
    }
    public void setRimorchio(boolean rimorchio){
        this.rimorchio=rimorchio;
    }
    public String toString() {
        return "Camion [Marca=" + getMarca() + ", Modello=" + getModello() +
               ", Cilindrata=" + getCilindrata() + "cc, Potenza=" + getPotenza() + "CV" +
               ", Carico=" + carico + "kg, Rimorchio=" + (rimorchio ? "Sì" : "No") + "]";
}

}
