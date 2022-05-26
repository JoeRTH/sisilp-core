package edu.ilp.sisgailp.dao;

import edu.ilp.sisgailp.entity.Escuela;
import edu.ilp.sisgailp.entity.Estudiante;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IEstudianteDao extends JpaRepository<Estudiante, Long> {
    //Lista estudiantes por escuela
    List<Estudiante> findByEscuela(Escuela idescuela);

    //Lista de estudiantes de una escuela por páginas
    @Query("SELECT e FROM Estudiante e WHERE e.escuela = :idescuela")
    Page<Estudiante> listaEstudiantes(Pageable pageable, @Param("idescuela") Escuela idescuela);

    //Lista estudiantes por escuela y por páginas
    //Page<Estudiante>
}
