package tarea1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alexis Gomez
 */
public class Datos {
  String nombre, universidad;
  int edad ,NFavorito;
  
  public Datos(String nombre,String universidad, int edad, int NFavorito){
      this.nombre=nombre;
      this.universidad=universidad;
      this.edad=edad;
      this.NFavorito=NFavorito;
  }
  
  public void MostrarDatos(){
      System.out.println(nombre);
      System.out.println(universidad);
      System.out.println(edad);
      System.out.println(NFavorito);
      
}
}

    
    
    

