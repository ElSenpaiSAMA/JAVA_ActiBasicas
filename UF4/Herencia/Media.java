public class Media {
    private String name;
    private double duracion;

    public Media(){

    }

    public Media(String name, double duracion) {
        this.name = name;
        this.duracion = duracion;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }
}
