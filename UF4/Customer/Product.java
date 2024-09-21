public class Product {

    private int productId;
    private String name;
    private double precio;

    public Product(int productId, String name, double precio) {
        this.productId = productId;
        this.name = name;
        this.precio = precio;
    }


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


}
