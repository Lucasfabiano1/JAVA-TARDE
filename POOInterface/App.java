package POOInterface;

public class App {
    public static void main(String[] args) {
        Quadrado figura1 = new Quadrado(8);
        Retangulo figura2 = new Retangulo(10, 5);
        Trapezio figura3 = new Trapezio(5, 10, 8, 15, 3);
        System.out.println(figura1.getNomeFigura()
        +"/n Area: "+figura1.getArea()
        +"/n Perimetro: "+figura1.getPerimetro()

        System.out.println(figura2.getNomeFigura())
        +"/n Area: "+figura2.getArea()
        +"/n Perimetro: "+figura2.getPerimetro()

        System.out.println(figura3.getNomeFigura()
        +"/n Area: "+figura3.getArea()
        +"/n Perimetro: "+figura3.getPerimetro()
        );
    }
}