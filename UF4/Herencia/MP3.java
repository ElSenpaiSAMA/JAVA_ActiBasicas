public class MP3 extends Musica {
    private int nodo;

    public MP3 (){

    }

    public MP3(String name, double duracion, String arti, String estil, int nodo) {
        this.nodo = nodo;
    }

    public int getNodo() {
        return nodo;
    }

    public void setNodo(int nodo) {
        this.nodo = nodo;
    }

    public void imprimir() {
        System.out.println(getName());
        System.out.println(getDuracion());
        System.out.println(getArti());
        System.out.println(getEstil());
        System.out.println(nodo);
    }
}