/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ABMLDB.ABMLDB.repository;

import com.ABMLDB.ABMLDB.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sosag
 */
/*
@repository  la interface va a extender de Jpareposirty  que maneja JPA
en el parametros <> debe ir la clase a presisistir, tipo de dato de la id


*/

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    
}
