/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ABMLDB.ABMLDB.service;

import com.ABMLDB.ABMLDB.model.Persona;
import java.util.List;

/**
 *
 * @author sosag
 */

//la interfaz es como un contratos en donde vamos a definir los metodos
public interface IpersonaService {
    //metodo para traer una lista de persona
    public List<Persona> getPersonas();
    //metodo para dar de alta persona
    public void savePersona(Persona perso);
    //metodo para borrar persona
    public void deletePersona(Long id);
    //metodo para encontrar a una persona
    public Persona findPersona(Long id);
    
    
    
    
    
    
}
