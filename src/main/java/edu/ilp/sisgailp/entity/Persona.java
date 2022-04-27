package edu.ilp.sisgailp.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="persona")
//La clase persona es clase padre con hijos
@Inheritance(strategy = InheritanceType.JOINED)
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona", length = 10)
    private Long idpersona;

    private String nombre;
    @Column(name = "nombre", length = 100, nullable = false)
    //Como es igual al de la base de datos queda asi
    private String apellido;
    private int edad;
    private String dni;

    //Viene de la base de datos
    @Column(name = "fecha_nacimiento", length = 50)
    private Date fechaNacimiento;

    //Constructor vacio para persona almacenar
    public Persona() {

    }

    public Persona(Long idpersona) {
        this.idpersona = idpersona;
    }

    //CONSTRUCTOR - "idpersona ya no porque se genera automatico"
    public Persona(String nombre, String apellido, int edad, String dni, Date fechaNacimiento, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    //GET y SET
    public Long getIdpersona() {
        return idpersona;
    }

    public void setIdpersona(Long idpersona) {
        this.idpersona = idpersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    private String genero;
}
