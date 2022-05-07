package edu.ilp.sisgailp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "escuela")
public class Escuela {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long idescuela;

    private String denominacion;

    private String codigoEscuela;
    //Viene del estudiante el escuela - una escuela viene de muchos a....
    @OneToMany(mappedBy = "escuela")
    //Sirve para solo listado
    private List<Estudiante> estudiantes;

    //Cuando no tiene relacion extends se crea asi/ diferente de estudiante y docente
    public Escuela() {
    }

    public Escuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    //Sirve para crear un registro de la escuela
    public Escuela(Long idescuela, String denominacion, String codigoEscuela) {
        this.idescuela = idescuela;
        this.denominacion = denominacion;
        this.codigoEscuela = codigoEscuela;
    }

    public Long getIdescuela() {
        return idescuela;
    }

    public void setIdescuela(Long idescuela) {
        this.idescuela = idescuela;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getCodigoEscuela() {
        return codigoEscuela;
    }

    public void setCodigoEscuela(String codigoEscuela) {
        this.codigoEscuela = codigoEscuela;
    }
}
