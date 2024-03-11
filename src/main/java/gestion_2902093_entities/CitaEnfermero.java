package gestion_2902093_entities;

import java.time.LocalDateTime;

public class CitaEnfermero extends Appointment implements IAgendable{
    private String procedimiento;
    private Enfermero enfermero;
    
    public CitaEnfermero(int id, LocalDateTime fecha, Paciente paciente, Consultorio consultorio, String procedimiento,
            Enfermero enfermero) {
        super(id, fecha, paciente, consultorio);
        this.procedimiento = procedimiento;
        this.enfermero = enfermero;
    }

    public String getProcedimiento() {
        return procedimiento;
    }

    public void setProcedimiento(String procedimiento) {
        this.procedimiento = procedimiento;
    }

    public Enfermero getEnfermero() {
        return enfermero;
    }

    public void setEnfermero(Enfermero enfermero) {
        this.enfermero = enfermero;
    }

    @Override
    public void agendarCita(LocalDateTime fecha) {
        super.fecha = fecha;
    }

    @Override
    public void cancelarCita() {
        System.out.println("Cita Cancelada");
    }

    @Override
    public void reagendarCita(LocalDateTime fecha) {
        super.fecha = fecha;
    }
    
    
}