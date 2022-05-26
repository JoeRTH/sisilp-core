package edu.ilp.sisgailp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
public class Estudiante extends Persona{
    //El Id hereda de la persona
    @Column(name="codigo", length = 10, nullable = false)
    private  String codigo;

    @Column(name="serie",length = 10)
    private String serie;

    //Cascade cuando actulizamos escuela se actualiza estudiante
    //Eager Retorna datos del estudiante + escuela - Lazy solo retorna datos del estudiante
    //@ManyToOne(optional = false,cascade = CascadeType.ALL, fetch = FetchType.LAZY)        -   Clase pasada
    @ManyToOne(optional = false,fetch = FetchType.LAZY)
    private Escuela escuela;

    //Constructor vacio
    public Estudiante() {
    }

    //Constructor select tod0 despues tod0
    public Estudiante(String codigo, String serie, Escuela escuela) {
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public Estudiante(Long idpersona, String codigo, String serie, Escuela escuela) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    public Estudiante(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigo, String serie, Escuela escuela) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigo = codigo;
        this.serie = serie;
        this.escuela = escuela;
    }

    //Get and Set
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public Escuela getEscuela() {
        return escuela;
    }

    public void setEscuela(Escuela escuela) {
        this.escuela = escuela;
    }
}
