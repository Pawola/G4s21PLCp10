/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package informacion;

import com.google.gson.Gson;

/**
 *
 * @author Paola
 */
public class convertir {
    
    public datos aclase(String cadena){
        Gson gson = new Gson();
        return gson.fromJson(cadena, datos.class);
    }
    public String ajson(datos Datos){
        Gson gson = new Gson();
        return gson.toJson(Datos);
    }
}
