public class OGG extends Musica {
    private int version;

    public OGG(){

    }

    public OGG(String name, double duracion, String arti, String estil, int version) {
        this.version = version;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void imprimir() {
        System.out.println(getName());
        System.out.println(getDuracion());
        System.out.println(getArti());
        System.out.println(getEstil());
        System.out.println(version);
    }
}