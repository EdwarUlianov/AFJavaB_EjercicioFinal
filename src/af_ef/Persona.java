
package af_ef;

import vehiculos.*;



public class Persona {

    //Atributos
    private String nombre, dni, descripcion;
    private int edad;
    private Bici bp;
    private Moto mp;
    
    //Constructor de la clase
    public Persona (String n,int e){
    
        nombre = n; //Asigna el nombre
        edad = e;   //Asigna la edad
                
    }   
    
    //Constructor para crear persona con bici
    public Persona (String nom, int e, String modelo_bici, double precio){
    
        nombre = nom;
        edad = e;
        
        bp = new Bici(modelo_bici, precio);
        
    }
    
    //Constructor para crear persona con moto
    public Persona (String nom, int e, String marca_moto, int cilindrada){
    
        nombre = nom;
        edad = e;
        
        mp = new Moto(marca_moto, cilindrada);
        
    }
    
    //Método para obtener el objeto bici
    public Bici ObtenerBici(){
        
        return bp;
    
    }
    
    //Método para obtener el objeto moto
    public Moto ObtenerMoto(){
    
        return mp;
        
    }
    
    //Método para introducir DNI
    public void MeterDni(String d){
        
        dni = d;
    
    }
    
    //Método para introducir descripcioón
    public void MeterDescripcion(String des){
    
        descripcion = des;
    
    }
    
    //Método para mostrar los datos de una persona
    public void MostrarPersona()
    {      
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + dni);
        System.out.println("Descripción: " + descripcion);
    }
    
}
