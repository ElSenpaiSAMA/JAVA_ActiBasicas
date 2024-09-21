public class Triangulo extends Figura {
    private int base;
    private int h;

    public Triangulo(String figura, int id, int base, int h) {
        super(figura, id);
        this.base = base;
        this.h = h;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }
    @Override
    public double calcular(){
        double area =(base*h)/2;
        imprimir(getFigura(), getId(), area);
        return  area;
    }
}
