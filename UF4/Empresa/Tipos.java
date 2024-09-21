public class Tipos {
    private String nombre ;
    private int numID ;
    private double valor ;
    private int stock ;
    private boolean venta ;

    public Tipos(String nombre, int numID, double valor, int stock, boolean venta) {
        this.nombre = nombre;
        this.numID = numID;
        this.valor = valor;
        this.stock = stock;
        this.venta = venta;
    }

    public String getNombre(String nombre2) {
        nombre2 = nombre;
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumID(int id) {
        id = numID;
        return numID;
    }

    public void setNumID(int numID) {
        this.numID = numID;
    }

    public double getValor( double valor2) {
        valor2 = valor;
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getStock(int stock2) {
        stock2 = stock;
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isVenta( boolean venta2) {
        venta2=venta;
        return venta;
    }

    public void setVenta(boolean venta) {
        this.venta = venta;
    }

}
