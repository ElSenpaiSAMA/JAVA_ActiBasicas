package UF4.HerenciaSimple;

public class Cat extends Animal{
    private void miau() {
        System.out.println("Cat '" + getId() + "' MIAUUU");
    }

    // Overriding super class behavior

    public void sound() {
        miau();
    }
}

