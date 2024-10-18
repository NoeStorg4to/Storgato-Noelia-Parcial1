
package model;

import java.time.LocalDate;

public class Gastronomia extends Servicio {
        private String gastronomia;
        private double precio;
        private int diaSemDescuento;

    public Gastronomia(String gastronomia, double precio, int diaSemDescuento, String codServicio, double porcentajeDescuento, boolean enPromocion) {
        super(codServicio, porcentajeDescuento, enPromocion);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDescuento = diaSemDescuento;
    }

    public String getGastronomia() {
        return gastronomia;
    }

    public void setGastronomia(String gastronomia) {
        this.gastronomia = gastronomia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getDiaSemDescuento() {
        return diaSemDescuento;
    }

    public void setDiaSemDescuento(int diaSemDescuento) {
        this.diaSemDescuento = diaSemDescuento;
    }

    public String getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(String codServicio) {
        this.codServicio = codServicio;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }
        
   
    @Override
    public double calcularPrecioFinal(LocalDate dia) {
       
         double precioTotal;
         if (isEnPromocion()) {
                  precioTotal = getPrecio() * (getPorcentajeDescuento() - 1);
         } else {
                  precioTotal = getPrecio();
         }
         return precioTotal;         
    }
        
        
    
}
