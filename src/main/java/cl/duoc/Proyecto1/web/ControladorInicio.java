/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.duoc.Proyecto1.web;


import cl.duoc.Proyecto1.dao.PersonaDAO;
import cl.duoc.Proyecto1.service.PersonaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.beans.factory.annotation.Autowired;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    //private PersonaDAO personaDAO;
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model modelo){
        
        var personas = personaService.listarPersonas();
        modelo.addAttribute("personas", personas);
       return "index";
    }
    
    
}
