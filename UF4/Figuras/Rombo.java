public class Rombo extends Figura{
    private int dM;
    private int dme;

    public Rombo(String figura, int id, int dM, int dme) {
        super(figura, id);
        this.dM = dM;
        this.dme = dme;
    }

    public int getdM() {
        return dM;
    }

    public void setdM(int dM) {
        this.dM = dM;
    }

    public int getDme() {
        return dme;
    }

    public void setDme(int dme) {
        this.dme = dme;
    }
    @Override
    public double calcular(){
        double area =dM*dme;
        imprimir(getFigura(), getId(), area);
        return  area;
    }
}
