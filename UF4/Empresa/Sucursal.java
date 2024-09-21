import java.util.Scanner;
public class Sucursal {
    Scanner scan= new Scanner(System.in);
    private String nombre;
    private String direccion;
    private String telefo;
    private String email;
    public Sucursal(String nomSucursal, String telefenoS, String direcSucur, String emailSucur){
        nombre=nomSucursal;
        direccion=direcSucur;
        telefo=telefenoS;
        email = emailSucur;
    }
    public String getNombre(String noombre) {
        nombre = noombre;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion(String direccion ) {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefo( String telefo) {
        return telefo;
    }

    public void setTelefo(String telefo) {
        this.telefo = telefo;
    }

    public String getEmail( String email) {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void descanso(Transportista t){
    }
    public void trabajar(Transportista t){

    }
    public void altaClient(Cliente c){

    }
    public void bajaCliente(Cliente c){

    }
    public void altaEncargo (Cliente c, Transportista t, Encargo e){

    }
    public void anulEncargo (Encargo e){

    }
}
