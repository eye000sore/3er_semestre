public class cuadrado {
    private double cA;
    public cuadrado(double ladoaa){
        cA = ladoaa;
    }
    public void setcA(double ladoaa){
        this.cA = ladoaa;

    }
    public double getPerimetro(){
        return cA*4;
    }
    public double getArea(){
        return cA*cA;
    }
}
