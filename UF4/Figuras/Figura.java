public class Figura {
    private String figura;
    private int id;

    public Figura(String figura, int id) {
        this.figura = figura;
        this.id = id;
    }

    public String getFigura() {
        return figura;
    }

    public void setFigura(String figura) {
        this.figura = figura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public static void imprimir(String figura, int id,double resultado){
        System.out.println("La figura es: " + figura);
        System.out.println("El ID es: " + id);
        System.out.println("El área es: " + resultado);
        System.out.println("-----------------------------");
    }
    public double calcular(){
        return 0 ;
    }
}
