/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Logica.Producto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author maxi
 */
public interface IfrmProductos {
    
    public ArrayList<Producto> ObtenerProductos()throws ClassNotFoundException, SQLException;
    
}
