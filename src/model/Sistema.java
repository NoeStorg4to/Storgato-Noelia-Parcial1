
package model;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
        private List<Servicio> listServicio ;
        
        public Sistema(){
        this.listServicio  = new ArrayList<>();
        }

    public List<Servicio> getListServicio() {
        return listServicio;
    }

    public void setListServicio(List<Servicio> listServicio) {
        this.listServicio = listServicio;
    }

 public Servicio traerServicio (String codServicio){
        Servicio servicioEncontrado = null;
        for (Servicio servicio : listServicio) {
                  if (servicio.getCodServicio().equals(codServicio)) {
                           servicioEncontrado = servicio;
                           System.out.println(servicio);
                  } 
        } return servicioEncontrado;
 }
 


 public List<Servicio> traerServicio (boolean enPromocion, LocalDate dia){
        List<Servicio> segunFecha = new ArrayList <>();
        if (listServicio != null){
                 for (Servicio servicio : listServicio) {
                           if (servicio instanceof Hospedaje hospedaje) {
                                    DayOfWeek diaSemana = dia.getDayOfWeek(); 
                                    LocalDate fechaActual = LocalDate.now();
                                    if (fechaActual.getDayOfWeek() == diaSemana) {
                                             segunFecha.add(servicio);
                                    }
                           }
                 }
        }
        return segunFecha;   
 }
 
 public boolean agregarGastronomia (String codServicio, double porcentajeDescuento, boolean enPromocion, String gastronomia, double precio, int diaSemDescuento) throws PersonalException{
        boolean agregado = false;
       
         for (Servicio servicio : listServicio) {    
                  
                  if (servicio.getCodServicio().equals(codServicio)) {
                           throw new PersonalException("El servicio con el código " + codServicio + " ya existe.");                           
                  }
                listServicio.add(servicio);
                agregado = true;
         }
         return agregado;         
 }
 
  public ArrayList<Servicio> traerServicio(boolean enPromocion){
        ArrayList<Servicio> seleccionadosPromocion = new ArrayList<> ();
       
        if (listServicio != null) {
                  for (Servicio servicio : listServicio) {
                          if (servicio instanceof Gastronomia gastronomia && gastronomia.isEnPromocion() == enPromocion) {
                                    seleccionadosPromocion.add(servicio);
                            }
                  }   
         }
        return seleccionadosPromocion;    
  }
 
 public boolean agregarHospedaje (String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje, double precioPorNoche) {
        boolean agregado = false;
       
         for (Servicio servicio : listServicio) {    
                  
                  if (servicio.getCodServicio().equals(codServicio)) {
                           throw new PersonalException("El servicio con el código " + codServicio + " ya existe.");                           
                  }
                  listServicio.add(servicio);
                  agregado = true;
                       
        }
         return agregado;     
 }

    @Override
    public String toString() {
        return "Sistema{" + "listServicio=" + listServicio + '}';
    }
 
 
}
