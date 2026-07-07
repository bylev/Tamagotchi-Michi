import java.util.Date;

public class Mascota {
    private String nombre;
    private int edad;
    private Date fechaNacimiento;
    private int hambre;
    private int energia;
    private int felicidad;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.hambre = 50;
        this.energia = 100;
        this.felicidad = 50;
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

    public void setFelicidad(int felicidad) {
        this.felicidad = Math.max(0, Math.min(100, felicidad));
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

    public int getFelicidad() {
        return this.felicidad;
    }

    public String toString() {
        return "Nombre: " + this.nombre +
                "\nEdad: " + this.edad +
                "\nHambre: " + this.hambre +
                "\nEnergia: " + this.energia +
                "\nFelicidad: " + this.felicidad;
    }

    public boolean estaVivo() {
        return this.hambre > 0 && this.energia > 0 && this.felicidad > 0;
    }

    // Métodos

    public void alimentar(int cantidad) {
        if (this.hambre == 100) {
            System.out.println("No tiene hambre");
            return;
        }
        setHambre(this.hambre + cantidad);
        setEnergia(this.energia - 5);
        setFelicidad(this.felicidad + 5);
        System.out.println("Alimentado, hambre:" + getHambre());
    }

    public void jugar() {
        if (getFelicidad() == 100) {
            System.out.println("Ya está muy feliz, no quiere jugar más");
            return;
        }
        setFelicidad(this.felicidad + 10);
        setEnergia(this.energia - 10);
        setHambre(this.hambre - 10);
        System.out.println("Jugando, felicidad:" + getFelicidad());
    }

    public void dormir() {
        if (getEnergia() == 100) {
            System.out.println("Ya está descansado, no necesita dormir");
            return;
        }
        setEnergia(this.energia + 20);
        setHambre(this.hambre - 10);
        System.out.println("Durmiendo, energia:" + getEnergia());
    }

    public void pasarTiempo() {
        setHambre(this.hambre - 5);
        setEnergia(this.energia - 5);
        setFelicidad(this.felicidad - 5);

        if (!estaVivo()) {
            System.out.println(getNombre() + " ha muerto.");
            return;
        }
        System.out.println("Pasando tiempo -> hambre:" + getHambre() +
                " energia:" + getEnergia() +
                " felicidad:" + getFelicidad());
    }
}
