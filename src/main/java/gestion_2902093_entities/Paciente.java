package gestion_2902093_entities ;
import java.time.LocalDate;

public class Paciente {
    private int id;
    private String nombres;
    private String apellidos;
    private String tipoIdentificacion;
    private int numeroIdentificacion;
    private String correoElectronico;
    private int celular;
    private LocalDate fechaNacimiento;
    private double altura;
    private double peso;
    private TipoSangre tipoSangre;
    private char factorRH;

    public Paciente() {
    }

    public Paciente(int id, String nombres, String apellidos, String tipoIdentificacion, int numeroIdentificacion, String correoElectronico, int celular, LocalDate fechaNacimiento, double altura, double peso, TipoSangre tipoSangre, char factorRH) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
        this.correoElectronico = correoElectronico;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.altura = altura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
        this.factorRH = factorRH;
    }

    // Métodos getter y setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
}