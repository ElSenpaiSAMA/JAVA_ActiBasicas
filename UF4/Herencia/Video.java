public class Video extends Media {
    private String director;
    private String idioma;

    public Video(){

    }

    public Video(String name, double duracion, String director, String idioma) {
        this.director = director;
        this.idioma = idioma;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void imprimir() {
        System.out.println(getName());
        System.out.println(getDuracion());
        System.out.println(idioma);
        System.out.println(director);
    }
}
