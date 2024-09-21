public class Trapecio extends  Figura {
    private int a;
    private int b;
    private int h;

    public Trapecio(String figura, int id, int a, int b, int h) {
        super(figura, id);
        this.a = a;
        this.b = b;
        this.h = h;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
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
        double area =(h*(b*a))/2;
        imprimir(getFigura(), getId(), area);
        return  area;
    }
}
