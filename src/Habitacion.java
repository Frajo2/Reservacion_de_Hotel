public class Habitacion {
    private String tipo;
    private double precio;
    private boolean disponible;
    private HorasLibres horasLibres;

    public Habitacion(String tipo, double precio) {
        this.tipo = tipo;
        this.precio = precio;
        this.disponible = true;
        this.horasLibres = new HorasLibres();

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        for (String dia : diasSemana) {
            horasLibres.agregarHoraLibre(dia);
        }
    }

    public String getTipo() {
        return tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void reservar() {
        disponible = false;
    }

}