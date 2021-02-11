/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.duoc.Proyecto1.service;

import cl.duoc.Proyecto1.dao.PersonaDAO;
import cl.duoc.Proyecto1.domain.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author David
 */
public class PersonaServiceImpl implements PersonaService{

    @Autowired
    private PersonaDAO personaDAO;
    
    @Override
    @Transactional(readOnly=true)
    public List<Persona> listarPersonas() {
        return (List<Persona>)personaDAO.findAll();
    }

    @Override
    @Transactional
    public void guardar(Persona persona) {
        personaDAO.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDAO.delete(persona);
    }

    @Override
    @Transactional
    public Persona encontrarPersona(Persona persona) {
        return personaDAO.findById(persona.getIdPersona()).orElse(persona);
    }

}
