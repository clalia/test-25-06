public class Rombo {
    private int lato;
    private int diagonale_maggiore;
    private int diagonale_minore;

    public Rombo(int lato, int diagonale_maggiore, int diagonale_minore){
        setLato(lato);
        setDiagonaleMaggiore(diagonale_maggiore);
        setDiagonaleMinore(diagonale_minore);
    }
    public int getLato(){
        return lato;
    }
    public void setLato(int lato){
        if (lato<=0){
            this.diagonale_minore=1;
        }else{
        this.lato=lato;
        }
    }
    public int getDiagonaleMaggiore(){
        return diagonale_maggiore;
    }
    public void setDiagonaleMaggiore(int diagonale_maggiore){
        if (diagonale_maggiore<=0){
            this.diagonale_maggiore=1;
        }else{
        this.diagonale_maggiore=diagonale_maggiore;
        }
    }

    public int getDiagonaleMinore(){
        return diagonale_minore;
    }
    public void setDiagonaleMinore(int diagonale_minore){
        if (diagonale_minore<=0){
            this.diagonale_minore=1;
        }else{
        this.diagonale_minore=diagonale_minore;
        }
    }

    public int getPer(){
        return 4*getLato();
    }
    public int getArea(){
        return (getDiagonaleMaggiore()*getDiagonaleMinore())/2;
    }
    public String getDetails(){
        return "perimetro: " + getPer() + ", area: " + getArea();
    }
    public String toString() {
        return "perimetro: " + getPer() + ", area: " + getArea();
    }


}
