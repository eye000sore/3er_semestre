public class rectangulo {
    private double ladoA;
    private double ladoB;
    public rectangulo(double ladoAA, double ladoBB){//constructor con parámetros
    ladoA= ladoAA;
    ladoB= ladoBB;
    }
    public void setLadoA(double ladoAA) {
    this.ladoA = ladoAA;
    }
    public void setLadoB(double ladoBB) {
    this.ladoB = ladoBB;
    }
    public double getPerimetro() {
    return 2*ladoA+2*ladoB;
    }
    public double getArea() {
    return ladoA*ladoB;
    }
    }
    