public class Paralelo extends Figura {
    private int b;
    private int h;

    public Paralelo(String figura, int id, int b, int h) {
        super(figura, id);
        this.b = b;
        this.h = h;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    @Override
    public double calcular(){
        double area =b*h;
        imprimir(getFigura(), getId(), area);
        return  area;
    }
}
