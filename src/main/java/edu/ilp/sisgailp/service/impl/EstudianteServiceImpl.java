package edu.ilp.sisgailp.service.impl;

import edu.ilp.sisgailp.dao.IEstudianteDao;
import edu.ilp.sisgailp.entity.Escuela;
import edu.ilp.sisgailp.entity.Estudiante;
import edu.ilp.sisgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

//Esto se declara
@Service
public class EstudianteServiceImpl implements IEstudianteService {
    //Implementar guardar estudiante
    @Autowired
    private IEstudianteDao estudianteDao;

    @Override
    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return this.estudianteDao.save(estudiante);
    }

    @Override
    public List<Estudiante> listaEstudiantes(Escuela idescuela) {
        return this.estudianteDao.findByEscuela(idescuela);
    }

    @Override
    public Page<Estudiante> listaEstudianteByPagina(Pageable pageable, Escuela idescuela) {
        return null;
    }
}
