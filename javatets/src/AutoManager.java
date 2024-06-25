
import java.util.Arrays;

public class AutoManager  {
  /*   Creare una classe AutoManager che si occupera' di gestire un array
    * di Auto
    * 
    * La classe deve implementare i seguenti metodi:
    * - void : add(Auto)
    * per aggiungere un auto al parco auto presente
    * - Auto : getMaxPotenzaAuto()
    * per restituire l'auto con la potenza maggiore
    * - toString
    * ritorna il numero di auto presenti e tutti i dati delle auto
    */

    private int index;
    private  Auto[] autos;

    public AutoManager(){
        index=0;
        autos= new Auto[10];
    }
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Auto[] getAutos() {
        return autos;
    }

    public void setAutos(Auto[] autos) {
        this.autos = autos;
    }
    public void add(Auto auto){ //aggiungi auto
        if(index < autos.length){
            autos[index]=auto;
            index++;
            return;
        } 
        Auto[] newAutos = new Auto[getAutos().length * 2];

        for (int x = 0; x < index; x++) {

            newAutos[x] = autos[x];
        }

        newAutos[index++] = auto;

        setAutos(newAutos);
    }
    
    
    public Auto getMaxPotenzaAuto(){
        int PotMag=Integer.MIN_VALUE;
        Auto autoPotMag=null;
        for(int x=0; x< getIndex();x++){
            Auto a= autos[x];
            if(a.getPotenza()> PotMag){
                PotMag=a.getPotenza();
                autoPotMag=a;
            }
        }
        return autoPotMag;
    }
    public boolean remove(){
        if (index == 0)
        return false;

    getAutos()[index - 1] = null;
    index--;

    return true;
    }
    public boolean remove(int i) {
        if (i < 0 || i >= index)
            return false;

        for (int x = i; x < index - 1; x++) {
            autos[x] = autos[x + 1];
        }

        autos[index - 1] = null;
        index--;

        return true;
    }
    public void addAll(Auto[]autos){  //aggiungi lista di auto.
        for(Auto auto : autos){
            add(auto);
        }
    }




    @Override
    public String toString() {
        return "AutoManager: " + index + "\n" + Arrays.toString(autos);
    }
    

}
