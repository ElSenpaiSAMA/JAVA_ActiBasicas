public class Arona extends SEAT {
    private String color;
    private double km;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void imprimir(){
        System.out.println(getId());
        System.out.println(getModel());
        System.out.println(color);
        System.out.println(km);
    }
}
