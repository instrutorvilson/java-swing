/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formagenda.dao;

import formagenda.models.Contato;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class DB {
    private static List<Contato> lista = new ArrayList<>();

    public static List<Contato> getLista() {
        return lista;
    }
}
