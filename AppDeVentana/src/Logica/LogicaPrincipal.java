/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author maxi
 */
public class LogicaPrincipal {

    public ArrayList<Producto> ObtenerProductos() throws SQLException {

        List<Producto> Productos = new ArrayList<>();

        String query = "select * from Producto";
        ResultSet resultado = ObtenerConexion(query);

        while (resultado.next()) {

            Producto p = new Producto();

            p.setId(resultado.getInt(1));
            p.setDroga(resultado.getString(2));
            p.setUbicacion(resultado.getString(3));
            p.setConcentracion(resultado.getString(4));
            p.setPresentacion(resultado.getString(5));
            p.setCantidad(resultado.getString(6));
            p.setComponentes(resultado.getString(7));
            p.setPreparacion(resultado.getString(8));
            p.setObservacion(resultado.getString(9));
            p.setUnidad(resultado.getString(10));
            p.setTamañoCap(resultado.getString(11));
            p.setRutaImpresionM(resultado.getString(12));
            p.setRutaImpresionDM(resultado.getString(13));
            p.setPrecio(resultado.getDouble(14));

            Productos.add(p);
        }

        return (ArrayList<Producto>) Productos;
    }

    public ResultSet ObtenerConexion(String query) {
        ResultSet resultado = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/Farmacia", "maxi", "zaq123wsx");
            Statement sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(query);
        } catch (SQLException | ClassNotFoundException e1) {
            JOptionPane.showMessageDialog(null, "Error de conexion " + e1.getMessage());
        }
        return resultado;
    }

    public void InsertarDatos() {

    }

}
