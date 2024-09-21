public class Transportista {
    private String nombre;
    private String direccion;
    private int licencia;
    public Transportista(String nomTran, String Direcs){
        nombre = nomTran;
        direccion= Direcs;
    }
    public Transportista(int numLicencia){
        licencia=numLicencia;
    }

    public String getNombre(String nombree) {
        nombree = nombre;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion(String direc) {
        direc = direccion;
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getLicencia( int linc) {
        linc = licencia;
        return licencia;
    }

    public void setLicencia(int licencia) {
        this.licencia = licencia;
    }

    public void asignarEnc(Encargo e){

    }
    public void anulEnc(Encargo e){

    }
}
