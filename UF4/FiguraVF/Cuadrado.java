public class Cuadrado extends Figura {
    private int lado;

    public Cuadrado(String figura, int id, int lado) {
        super(figura, id);
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    @Override
    public double calcular(){
        double area =lado*lado;
        imprimir(getFigura(), getId(), area);
        return  area;
    }
}
