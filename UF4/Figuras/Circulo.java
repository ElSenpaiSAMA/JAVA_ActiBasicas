public class Circulo extends Figura{
    private int radi;
    private static double pi = 3.14;

    public Circulo(String figura, int id, int radi) {
        super(figura, id);
        this.radi = radi;
    }

    public int getRadi() {
        return radi;
    }

    public void setRadi(int radi) {
        this.radi = radi;
    }
    @Override
    public double calcular(){
        double area =pi*(radi^2);
        imprimir(getFigura(), getId(), area);
        return  area;
    }
}
