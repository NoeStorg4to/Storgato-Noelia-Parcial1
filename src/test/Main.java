
package test;

import java.time.LocalDate;
import model.Gastronomia;
import model.Hospedaje;
import model.Sistema;

public class Main {

    public static void main(String[] args) {
        Sistema sistema = new Sistema();
        
        try {
                  System.out.println("1-1");
                  Gastronomia gastronomia = new Gastronomia ("Hamburguesa criolla" , 180.0, 4, "4892", 15.0, true);

        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        try {
                  System.out.println("1-2");
                  Gastronomia gastronomia = new Gastronomia ("Hamburguesa criolla" , 180.0, 4, "489235", 15.0, true);
                  System.out.println("Se creo: " + gastronomia.getGastronomia());
                  sistema.agregarGastronomia("489235", 15.0, true, "Hamburguesa criolla", 180.0, 4);
                  
                  System.out.println("2-1");
                  LocalDate fechaConsulta = LocalDate.parse("2020-10-28");
                  System.out.println("El costo total es: " + gastronomia.calcularPrecioFinal(fechaConsulta));
                  
                  
               
                  System.out.println("1-3");
                  Hospedaje hospedaje = new Hospedaje ("Cabaña 3 personas", 1500.0, "2872", 10.0, true);
  
        }catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
        
        try {
                    System.out.println("1-4");
                    Hospedaje hospedaje = new Hospedaje ("Cabaña 3 personas", 1500.0, "287282", 10.0, true);
                    System.out.println("Se creo: " + hospedaje.getHospedaje());
                    sistema.agregarHospedaje("287282", 10.0, true, "Cabaña 3 personas", 1500.0);

                    System.out.println("2-2");
                    LocalDate fechaConsulta = LocalDate.parse("2020-10-28");
                    System.out.println("El costo total es: " + hospedaje.calcularPrecioFinal(fechaConsulta));
                    
                    System.out.println("3");
                    Gastronomia gastronomia1 = new Gastronomia ("Milanesa con pure" , 350.0, 3, "858927", 15.0, true);
                    sistema.agregarGastronomia("858927", 15.0, true, "Milanesa con pure", 350.0, 3);
                    Hospedaje hospedaje1 = new Hospedaje ("Habitación triple", 2200, "489259", 10.0, true);
                    sistema.agregarHospedaje("489259", 10.0, true, "Habitación triple", 2200.0);
                    Gastronomia gastronomia2 = new Gastronomia ("Gaseosa" , 120.0, 3, "182835", 20.0, true);
                    sistema.agregarGastronomia("182835", 20.0, true, "Gaseosa", 120.0, 3);
                    Hospedaje hospedaje2 = new Hospedaje ("Habitación simple", 1000.0, "758972", 15.0, true);
                    sistema.agregarHospedaje("758972", 15.0, true, "Habitación simple", 1000.0);
                    
                   System.out.println("Se agregaron los siguientes servicios: \n" +gastronomia1.getGastronomia() + " :" + gastronomia1 + "\n" + gastronomia2.getGastronomia() + ": " + gastronomia2 + "\n" +hospedaje1.getHospedaje() + ": " + hospedaje1 + "\n" + hospedaje2.getHospedaje() + ":" + hospedaje2);
                  
                   
                   System.out.println("4-1");
                   System.out.println("Los servicio en promocion son: " + sistema.traerServicio(true));
                
                //System.out.println("2-1");
                //Gastronomia gastronomia = new Gastronomia  ("Hamburguesa criolla" , 180.0, 4, "489235", 15.0, true);
        
        
        } catch (Exception e) {
            System.out.println(e.getMessage()); 
        }
       
    }
    
}
