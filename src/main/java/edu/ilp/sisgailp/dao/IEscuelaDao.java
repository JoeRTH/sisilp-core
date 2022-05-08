package edu.ilp.sisgailp.dao;

import edu.ilp.sisgailp.entity.Escuela;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IEscuelaDao extends JpaRepository<Escuela, Long> {
    //Obtiene una escuela a traves de su codigo
    //Viene del Entity - Esta es una forma de realizar una consulta
    Escuela findByCodigoEscuela(String codigo);

    //2da Forma
    @Query("SELECT e FROM Escuela e WHERE e.codigoEscuela=?1")
    Escuela obtenerEscuelaPorCodigo(String codigo);

    //3ra Forma
    @Query("SELECT e FROM Escuela e WHERE e.codigoEscuela =:codigo")
    Escuela obtenerEscuelaPorParam(@Param("codigo") String codigo);

    //Obtiene una escuela a través de su id y su denominación
    Escuela findByIdescuelaAndDenominacion(Long idescuela, String denominacion);
}
