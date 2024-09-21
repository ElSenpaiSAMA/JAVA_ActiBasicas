package Primer.UF4.HerenciaJerarquica;

public class PermanentEmployee extends Employee{
    private double hike = 0.5;

    public double getHike() {
        return hike;
    }

    public void setHike(double hike) {
        this.hike = hike;
    }
}
