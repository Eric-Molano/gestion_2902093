package gestion_2902093_entities;

import java.time.LocalDateTime;

public interface IAgendable {
    public  void  agendarCita(LocalDateTime fecha);
    public void cancelarCita();
    public void reagendarCita(LocalDateTime fecha);

}
