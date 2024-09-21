public class Main {
    public static void main(String[] args){
        Media me = new Media("", 0);
        Musica mu = new Musica("", 0, "", "");
        Video vi = new Video("",0,"","");
        vi.setDirector("PONZIO");
        vi.setIdioma("ESPAÑOL");
        vi.setDuracion(90);
        vi.setName("BICHOS, LA AVENTURA");
        vi.imprimir();
        MP3 mp=new MP3("", 8, "", "", 0);
        mp.setName("LOLA");
        mp.setDuracion(3);
        mp.setArti("CARRU");
        mp.setEstil("FUNK");
        mp.setNodo(1);
        mp.imprimir();
        OGG o = new OGG("",0,"","",0);
        o.setName("YA TU SABE");
        o.setDuracion(5);
        o.setArti("DE ZONA");
        o.setEstil("POP");
        o.setVersion(2);
        o.imprimir();
    }
}
