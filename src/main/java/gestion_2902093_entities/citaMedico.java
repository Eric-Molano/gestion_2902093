package gestion_2902093_entities;

import java.time.LocalDateTime;


public class citaMedico extends Appointment implements IAgendable{
    private String motivo;
    private Medico medico;
    private EstadoCita estado;
    private final EstadoCita EstadoCita;

    public citaMedico(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, String motivo,
            Medico medico, EstadoCita estado) {
        super(id, fecha, paciente, consultorio);
        this.motivo = motivo;
        this.medico = medico;
        this.EstadoCita = estado;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public EstadoCita getEstado() {
        return estado;
    }

    public void setEstado(EstadoCita estado) {
        this.estado = estado;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.setFecha(fecha);
        this.estado = EstadoCita.AGENDADA;
    }

    @Override
    public void cancelarCita() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
}