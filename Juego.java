import java.util.Scanner;

public class Juego {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cómo se llamará tu mascota? ");
        String nombre = sc.nextLine();
        Mascota mascota = new Mascota(nombre);

        System.out.println("¡" + nombre + " ha nacido! Cuídalo bien.");

        while (mascota.estaVivo()) {
            System.out.println("\n--- Estado ---");
            System.out.println(mascota);

            System.out.println("\n¿Qué quieres hacer?");
            System.out.println("1. Alimentar");
            System.out.println("2. Jugar");
            System.out.println("3. Dormir");
            System.out.println("4. Esperar");
            System.out.println("5. Salir");
            System.out.print("Opción: ");
            String opcion = sc.nextLine();

            switch (opcion) {
                case "1":
                    mascota.alimentar(30);
                    break;
                case "2":
                    mascota.jugar();
                    break;
                case "3":
                    mascota.dormir();
                    break;
                case "4":
                    System.out.println("Dejas pasar el tiempo...");
                    break;
                case "5":
                    System.out.println("¡Hasta luego!");
                    sc.close();
                    return;
                default:
                    System.out.println("Opción no válida");
            }

            mascota.pasarTiempo();
        }
        System.out.println("\nFin del juego. " + mascota.getNombre() + " ya no está contigo.");
        sc.close();
    }
}
