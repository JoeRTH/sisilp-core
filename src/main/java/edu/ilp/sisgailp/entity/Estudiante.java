package edu.ilp.sisgailp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "estudiante")
@PrimaryKeyJoinColumn(referencedColumnName = "IDPERSONA")
//Para heredar de otra tabla se usa extends - implements para usar/heredar metodos de una interfaz
public class Estudiante extends Persona {

    @Column(name = "codigo", length = 10, nullable = false)
    private String codigo;

    @Column(name = "serie", length = 10)
    private String serie;

    public Estudiante() {
    }

    //CONSTRUCTOR
    public Estudiante(String codigo, String serie) {
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(Long idpersona, String codigo, String serie) {
        super(idpersona);
        this.codigo = codigo;
        this.serie = serie;
    }

    public Estudiante(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero, String codigo, String serie) {
        super(nombre, apellido, edad, dni, fechaNacimiento, genero);
        this.codigo = codigo;
        this.serie = serie;
    }

    //GETTERS AND SETTERS
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
}
