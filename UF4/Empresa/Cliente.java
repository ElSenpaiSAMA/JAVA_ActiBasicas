public class Cliente {
    private String nombre ;
    private String direccion ;
    private String telefo ;
    private String email;

    public Cliente(String nombre, String direccion, String telefo, String email) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefo = telefo;
        this.email = email;
    }

    public String getNombre(String nom) {
        nom = nombre;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion(String dir) {
        dir = direccion;
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefo(String tel) {
        tel = telefo
        return telefo;
    }

    public void setTelefo(String telefo) {
        this.telefo = telefo;
    }

    public String getEmail(String em) {
        em = email;
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void asignarEncargo(Peticion p){

    }
    public void eliminarProduc(Peticion p){

    }


}
