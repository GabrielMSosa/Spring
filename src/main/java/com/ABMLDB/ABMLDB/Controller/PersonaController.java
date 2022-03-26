/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ABMLDB.ABMLDB.Controller;

import com.ABMLDB.ABMLDB.model.Persona;
import com.ABMLDB.ABMLDB.service.IpersonaService;
import java.util.List;
import javax.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sosag
 */
@RestController
public class PersonaController {
    //inyectamos dependencias
    @Autowired
    private IpersonaService interpersona;
    
    @GetMapping("/persona/traer")
    public List<Persona> getPersonas(){
        return interpersona.getPersonas();
        
    }
    
    @PostMapping("/persona/crear")
    public String crearpersona(@RequestBody Persona pers){
    interpersona.savePersona(pers);
    return "La persona fue creada correctamente";
    }
    
    //annotacion delete es para borrar !!
    @DeleteMapping("/persona/borrar/{id}")
    public String borrarpers(@PathVariable Long id ){
    interpersona.deletePersona(id);
    return "La persona fue borradacon exito";
    }
    
    @PutMapping("/persona/editar/{id}")
    public Persona editarperso(@PathVariable Long id,
            @RequestParam("nombre") String nuevonombre,
            @RequestParam("apellido") String nuevoapellido,
            @RequestParam("edad") int nuevaedad    ){
    //buscamos las persona en cuestion
    Persona pers= interpersona.findPersona(id);
    
    pers.setNombre(nuevonombre);
    pers.setApellido(nuevoapellido);
    pers.setEdad(nuevaedad);
    interpersona.savePersona(pers);//guardamos los cambios en la persona en cuestion
    return pers; }
    
}
