/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formagenda.controller;

import formagenda.dao.DB;
import formagenda.models.Contato;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class ContatoController {
    
    
    public static void salvar(Contato contato){
       DB.getLista().add(contato);  
    }
    
    public static List<Contato> consultar(){
        return  DB.getLista();
    }
}
