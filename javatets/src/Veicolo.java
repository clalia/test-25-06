public class Veicolo {
    private String marca;
    private String modello;

    public Veicolo(String marca, String modello){
        setMarca(marca);
        setModello(modello);
        
    }
    public String getMarca(){
        return marca;
    }
    public void setMarca(String marca){
        this.marca=marca;
    }
    public String getModello(){
        return modello;
    }
    public void setModello(String modello){
        this.modello=modello;
    }

    public String toString() {
        return "Veicolo [Marca=" + marca + ", Modello=" + modello + "]";
    }
}

