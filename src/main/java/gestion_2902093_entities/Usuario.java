package gestion_2902093_entities;

public class Usuario {

    //los protected en la clase padre sera privado en las clases hijas 
    protected int id;
    protected String nombres;
    protected String apellidos;
    protected String tipoIdentificacion;
    protected Long numeroIdentificacion;

    public Usuario(int id, String nombres, String apellidos, String tipoIdentificacion, Long numeroIdentificacion) {
        this.id = id;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tipoIdentificacion = tipoIdentificacion;
        this.numeroIdentificacion = numeroIdentificacion;
    }

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

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public Long getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(Long numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }


}