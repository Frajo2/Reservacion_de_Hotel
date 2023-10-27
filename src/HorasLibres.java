import java.util.ArrayList;
import java.util.List;

public class HorasLibres {
    private List<String> horasLibres;

    public HorasLibres() {
        horasLibres = new ArrayList<>();
    }

    public void agregarHoraLibre(String hora) {
        horasLibres.add(hora);
    }


}
