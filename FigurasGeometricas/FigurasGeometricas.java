import java.util.Scanner;
public class FigurasGeometricas {
public static void main(String[] args) {
double ladoA,ladoB,radio,cuA;
Scanner leer = new Scanner(System.in);
System.out.println("Operaciones con figura geométrica rectángulo");
System.out.println("============================================");
System.out.println("Ingrese el lado A del rectangulo : ");
ladoA=leer.nextDouble();
System.out.println("Ingrese el lado B del rectangulo : ");
ladoB=leer.nextDouble();
rectangulo objetoRectangulo = new rectangulo(ladoA, ladoB); //Creamos un objeto, y lo usaremos para llamar a los métodos de la clase rectangulo
objetoRectangulo.setLadoA(ladoA); //Acá usamos al objetoRectangulo para invocar su método setLadoA
objetoRectangulo.setLadoB(ladoB); //Acá usamos al objetoRectangulo para invocar su método setLadoB
double peri = objetoRectangulo.getPerimetro(); //Acá usamos al objetoRectangulo para invocar su método getPerimetro
double are = objetoRectangulo.getArea(); //Acá usamos al objetoRectangulo para invocar su método getArea
System.out.println("El perimetro del rectángulo es: "+ peri);
System.out.println("El área del del rectángulo es: "+ are );
System.out.println("Operaciones con figura geométrica cuadrado");
System.out.println("==========================================");
System.out.println("Ingrese el lado A del cuadrado : ");
cuA=leer.nextDouble();
cuadrado objCua= new cuadrado(cuA); //Creamos un objeto, y lo usaremos para llamar a los métodos de la clase rectangulo
objCua.setcA(cuA);
double periCua = objCua.getPerimetro(); //Acá usamos al objetoRectangulo para invocar su método getPerimetro
double areCua = objCua.getArea();
System.out.println("El perimetro del cuadrado es: "+ periCua);
System.out.println("El área del del cuadrado es: "+ areCua );
System.out.println("Operaciones con figura geométrica círculo");
System.out.println("=========================================");
System.out.println("Ingrese la medida del radio");
radio=leer.nextDouble();
circulo objCirc = new circulo(radio);
objCirc.setradio(radio);
double periCirc = objCirc.getPerimetro();
double areaCirc = objCirc.getArea();
System.out.println("El perimetro del circulo es: " + periCirc);
System.out.println("El area del circulo es: " + areaCirc);
leer.close();
}
}
