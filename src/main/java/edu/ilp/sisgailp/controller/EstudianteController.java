package edu.ilp.sisgailp.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import edu.ilp.sisgailp.entity.Escuela;
import edu.ilp.sisgailp.entity.Estudiante;
import edu.ilp.sisgailp.service.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class EstudianteController {

    @Autowired
    private IEstudianteService estudianteService;

    //Covierte el json en una entidad para realizar cambios
    @Autowired
    private ObjectMapper objectMapper;

    //Guardar Modificar Eliminar se usa PostMapping
    @PostMapping("/registrar")
    public String registrarEstudiante(@RequestBody String jsonEstudiante) throws JsonProcessingException {
        Estudiante estudiante=this.objectMapper.readValue(jsonEstudiante, Estudiante.class);

        this.estudianteService.guardarEstudiante(estudiante);
        return "El estudiante se registro correctamente ";
    }

    @GetMapping("/lista")
    public List<Estudiante> listaEstudiante(@RequestParam Escuela idescuela){
        return this.estudianteService.listaEstudiantes((idescuela));
    }

    @GetMapping("/listaPage")
    public Page<Estudiante> listaEstudiantesPage(@RequestParam Escuela idescuela, @RequestParam int pagina){

        Pageable page = PageRequest.of(pagina, 2);
        return this.estudianteService.listaEstudianteByPagina(page,idescuela);
    }


}
