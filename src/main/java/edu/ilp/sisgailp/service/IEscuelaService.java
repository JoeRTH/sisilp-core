package edu.ilp.sisgailp.service;

import edu.ilp.sisgailp.entity.Escuela;

import java.util.List;

public interface IEscuelaService {
    //Listar todas las escuelas
    List<Escuela> listarEscuelas();

    //Obtener escuela x su código
    Escuela obtenerEscuelaPorCodigo(String codigo);

    //Buscar una escuela a travez de su id y denomanicación
    Escuela buscarEscuelaByIdAndDenominacion(Long idescuela, String denominacion);
}
