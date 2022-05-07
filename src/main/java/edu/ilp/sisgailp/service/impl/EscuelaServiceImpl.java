package edu.ilp.sisgailp.service.impl;

import edu.ilp.sisgailp.dao.IEscuelaDao;
import edu.ilp.sisgailp.entity.Escuela;
import edu.ilp.sisgailp.service.IEscuelaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
//Para que reconozca como servicio
@Service
//Extends para herencia - implements tienes que implentar los metodos si o si
public class EscuelaServiceImpl implements IEscuelaService {

    @Autowired
    private IEscuelaDao escuelaDao;

    //alt + enter implementar metodos
    @Override
    public List<Escuela> listarEscuelas() {
        return this.escuelaDao.findAll();
    }
}
