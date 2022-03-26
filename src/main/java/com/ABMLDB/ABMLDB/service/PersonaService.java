/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ABMLDB.ABMLDB.service;

import com.ABMLDB.ABMLDB.model.Persona;
import com.ABMLDB.ABMLDB.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sosag
 */
@Service
public class PersonaService implements IpersonaService {
    
    @Autowired
    private PersonaRepository persorepo;
    
    @Override
   public List<Persona> getPersonas(){
   List<Persona> listasper= persorepo.findAll();
   return listasper;
       
   }
    @Override
    public void savePersona(Persona perso){
    persorepo.save(perso);
    }
    @Override
    public void deletePersona(Long id){
    persorepo.deleteById(id);
    
    
    }
    @Override
    public Persona findPersona(Long id){
        //acasi no encuentro la persona  devuelve null por ese va el orelse
    Persona perso= persorepo.findById(id).orElse(null);
    return perso;
    }
    
    
    
    
}
