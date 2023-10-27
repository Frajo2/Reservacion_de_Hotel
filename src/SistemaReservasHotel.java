import java.util.Scanner;

public class SistemaReservasHotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 2) {
            Hotel hotel = new Hotel();

            System.out.println("Seleccione el tipo de habitación:");
            System.out.println("1. Suite Ático");
            System.out.println("2. Gran Habitación");
            System.out.println("3. Habitación Simple");
            System.out.print("Ingrese el número correspondiente al tipo de habitación: ");

            int tipoSeleccionado = scanner.nextInt();
            String tipoPreferido = "";

            switch (tipoSeleccionado) {
                case 1:
                    tipoPreferido = "Suite Ático";
                    break;
                case 2:
                    tipoPreferido = "Gran Habitación";
                    break;
                case 3:
                    tipoPreferido = "Habitación Simple";
                    break;
                default:
                    System.out.println("Opción no válida.");
                    scanner.close();
                    return;
            }

            scanner.nextLine();

            System.out.print("Ingrese su día de ingreso (Lunes a Domingo): ");
            String diaIngreso = scanner.nextLine();

            System.out.print("Ingrese su día de salida (Lunes a Domingo): ");
            String diaSalida = scanner.nextLine();

            Habitacion habitacionAsignada = hotel.asignarHabitacion(tipoPreferido);

            if (habitacionAsignada != null) {
                System.out.println("Habitación asignada: " + habitacionAsignada.getTipo());
                System.out.println("Precio de la habitación: $" + habitacionAsignada.getPrecio());
                System.out.println("Día de ingreso: " + diaIngreso);
                System.out.println("Día de salida: " + diaSalida);
            }

            System.out.println("Seleccione una opción:");
            System.out.println("1. Realizar otra reserva");
            System.out.println("2. Finalizar");
            System.out.print("Ingrese el número de la opción: ");
            opcion = scanner.nextInt();
        }

        scanner.close();
    }
}