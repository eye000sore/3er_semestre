public class circulo {
    private double radio;
    public circulo(double ra){
       radio = ra;
    }
    public void setradio(double ra){
        this.radio = ra;
    }
    public double getPerimetro(){
        return 2*radio*Math.PI;
    }
    public double getArea(){
        return Math.PI*radio*radio;
    }
}
