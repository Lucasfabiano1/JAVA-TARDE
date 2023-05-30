package POOInterface;

public class Quadrado implements FigurasGeometricas {
    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double getArea() {
        int area = lado * lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "Quadrado";
    }

    @Override
    public double getPerimetro() {
        int perimetro = 4 * lado;
        return perimetro;
    }

}
