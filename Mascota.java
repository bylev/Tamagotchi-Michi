import java.util.Date;

public class Mascota {
    private String nombre;
    private int edad;
    private Date fechaNacimiento;
    private int hambre;
    private int energia;
    private int aburrimiento;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.hambre = 50;
        this.energia = 100;
        this.aburrimiento = 50;
        this.fechaNacimiento = new Date(); // fecha actual
    }

    // Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHambre(int hambre) {
        this.hambre = Math.max(0, Math.min(100, hambre));
    }

    public void setEnergia(int energia) {
        this.energia = Math.max(0, Math.min(100, energia));
    }

    public void setAburrimiento(int aburrimiento) {
        this.aburrimiento = Math.max(0, Math.min(100, aburrimiento));
    }

    // Getters

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public Date getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public int getHambre() {
        return this.hambre;
    }

    public int getEnergia() {
        return this.energia;
    }

    public int getAburrimiento() {
        return this.aburrimiento;
    }

    public String toString() {
        return "Nombre: " + this.nombre +
                "\nEdad: " + this.edad +
                "\nHambre: " + this.hambre +
                "\nEnergia: " + this.energia +
                "\nAburrimiento: " + this.aburrimiento;
    }

    // Métodos

    public void alimentar(int cantidad) {
        if (this.hambre == 100) {
            System.out.println("No tiene hambre");
            return;
        }

        setHambre(this.hambre + cantidad);
        setEnergia(this.energia - 5);
        setAburrimiento(this.aburrimiento + 5);
        System.out.println("Alimentado, hambre:" + getHambre());
    }
}