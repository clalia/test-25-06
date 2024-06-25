public class Circle {
    double raggio;
    

    public Circle(int raggio){
        this.raggio= raggio;
        
    }

    public double getPer() { 
        return raggio*2 *Math.PI;
    }
    public double getArea(){
        return Math.PI*raggio*raggio;
    }
    public String toString() {

        return "Circle [x=" + raggio + "] | Area: " + getArea() + " | Perimeter: " + getPer();
    }
}
