public class Musica extends Media {
    private String arti;
    private String estil;

    public Musica(){

    }

    public Musica(String name, double duracion, String arti, String estil) {
        this.arti = arti;
        this.estil = estil;
    }

    public String getArti() {
        return arti;
    }

    public void setArti(String arti) {
        this.arti = arti;
    }

    public String getEstil() {
        return estil;
    }

    public void setEstil(String estil) {
        this.estil = estil;
    }
}
