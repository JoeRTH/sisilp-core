package edu.ilp.sisgailp.service;

import edu.ilp.sisgailp.entity.Escuela;
import edu.ilp.sisgailp.entity.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IEstudianteService {
    //Este metodo registra un estudiante
    Estudiante guardarEstudiante(Estudiante estudiante);

    //Lista de estudiantes por escuela
    List<Estudiante> listaEstudiantes(Escuela idescuela);

    //Lista de estudiantes por escuela y por páginas
    Page<Estudiante> listaEstudianteByPagina(Pageable pageable, Escuela idescuela);
}
