package POOInterface;

public class Trapezio implements FigurasGeometricas{
    int baseMenor;
    int baseMaior;
    int altura;
    int lado1;
    int lado2;
    
    public Trapezio(int baseMenor, int baseMaior, int altura, int lado1, int lado2) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    public double getArea() {
        int area = (baseMaior-baseMenor)*altura/2;
        return area;
    }
    @Override
    public String getNomeFigura() {
        return "Trapezio";
    }
    @Override
    public double getPerimetro() {
        int perimetro = baseMaior+baseMenor+lado1+lado2;
        return perimetro;
    }
}
