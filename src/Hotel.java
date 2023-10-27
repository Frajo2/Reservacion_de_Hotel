import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hotel {
    private List<Habitacion> habitaciones;

    public Hotel() {
        habitaciones = new ArrayList<>();
        habitaciones.add(new Habitacion("Suite Ático", 200.0));
        habitaciones.add(new Habitacion("Gran Habitación", 150.0));
        habitaciones.add(new Habitacion("Habitación Simple", 100.0));
    }

    public Habitacion asignarHabitacion(String tipoPreferido) {
        List<Habitacion> habitacionesDisponibles = new ArrayList<>();

        for (Habitacion habitacion : habitaciones) {
            if (habitacion.isDisponible() && habitacion.getTipo().equalsIgnoreCase(tipoPreferido)) {
                habitacionesDisponibles.add(habitacion);
            }
        }

        if (habitacionesDisponibles.isEmpty()) {
            System.out.println("Lo siento, no hay habitaciones disponibles del tipo deseado.");
            return null;
        }

        Random rand = new Random();
        int index = rand.nextInt(habitacionesDisponibles.size());
        Habitacion habitacionAsignada = habitacionesDisponibles.get(index);
        habitacionAsignada.reservar();

        System.out.println("Habitación asignada: " + habitacionAsignada.getTipo());
        return habitacionAsignada;
    }
}


