/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cl.duoc.Proyecto1.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * 
 * @author David
 */
@Data
@Entity //reconoce la clase como entidad
@Table(name="persona")//para que no tenga errores en reconocer la tabla de la bdd

public class Persona implements Serializable{
    
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long idPersona;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
    
}
