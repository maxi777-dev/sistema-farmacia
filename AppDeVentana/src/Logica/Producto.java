/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author maxi
 */
public class Producto {

    public int Id;
    public String Droga;
    public String Concentracion;
    public String Componentes;
    public String Preparacion;
    public String Observacion;
    public double Precio;
    public double PrecioF;
    public String Ubicacion;
    public String Nombre;

    public String Presentacion; // COMP, CREMA, GEL, ETC
    public String Cantidad; // NUMERO DE CANTIDAD 10, 30, 60, 100
    public String Unidad; //ML, L ,G ,ETC
    public String RutaImpresionM;
    public String RutaImpresionDM;
    public String TamañoCap;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getDroga() {
        return Droga;
    }
    
    public String getNombre(){
        String nombre="";
        switch (this.Presentacion) {
            case "Capsulas_Comprimidos":
                nombre = this.Droga + ' ' + this.Concentracion + ' ' + this.Unidad + " x " + this.Cantidad + " CAPS";
                break;
            //(droga & " " & concentracion & " " & unidad & " " & "x" & " " & cantidad & " CAPS")  
            default:
                nombre = this.Droga + ' ' + this.Concentracion + " x " + this.Cantidad + ' ' + this.Unidad;
                break;
            //(droga & " " & concentracion & " " & "x" & " " & cantidad & unidad)
        }
        return nombre;
    }
    
    public void setDroga(String Droga) {
        this.Droga = Droga;
    }

    public String getConcentracion() {
        return Concentracion;
    }

    public void setConcentracion(String Concentracion) {
        this.Concentracion = Concentracion;
    }

    public String getComponentes() {
        return Componentes;
    }

    public void setComponentes(String Componentes) {
        this.Componentes = Componentes;
    }

    public String getPreparacion() {
        return Preparacion;
    }

    public void setPreparacion(String Preparacion) {
        this.Preparacion = Preparacion;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }

    public double getPrecioF() {
        PrecioF = Precio - (Precio*1.1);
        return PrecioF;
    }

    public void setPrecioF(double PrecioF) {
        this.PrecioF = PrecioF;
    }

//    public TipoPresentacion getPresentacion() {
//        return Presentacion;
//    }
//
//    public void setPresentacion(TipoPresentacion Presentacion) {
//        this.Presentacion = Presentacion;
//    }

    public String getCantidad() {
        return Cantidad;
    }

    public String getPresentacion() {
        return Presentacion;
    }

    public void setPresentacion(String Presentacion) {
        this.Presentacion = Presentacion;
    }

    public void setCantidad(String Cantidad) {
        this.Cantidad = Cantidad;
    }

    public String getUnidad() {
        return Unidad;
    }

    public void setUnidad(String Unidad) {
        this.Unidad = Unidad;
    }

    public String getRutaImpresionM() {
        return RutaImpresionM;
    }

    public void setRutaImpresionM(String RutaImpresionM) {
        this.RutaImpresionM = RutaImpresionM;
    }

    public String getRutaImpresionDM() {
        return RutaImpresionDM;
    }

    public void setRutaImpresionDM(String RutaImpresionDM) {
        this.RutaImpresionDM = RutaImpresionDM;
    }

    public String getTamañoCap() {
        return TamañoCap;
    }

    public void setTamañoCap(String TamañoCap) {
        this.TamañoCap = TamañoCap;
    }

}
