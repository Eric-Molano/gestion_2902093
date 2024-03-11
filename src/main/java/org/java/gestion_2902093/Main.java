package org.java.gestion_2902093;

import gestion_2902093_entities.Medico;
import gestion_2902093_entities.enum.Especialidad;
import gestion_2902093_entities.enum.TipoIdentificacion;

import gestion_2902093_entities.Medico;

public class Main {
    public static void main(String[] args) {
        Medico m = new Medico(1,
                              "Carolina",
                              "forero",
                              TipoIdentificacion.CC,
                              1016008031L,
                              234234234L,
                              Especialidad.PEDIATRIA);
    }
}