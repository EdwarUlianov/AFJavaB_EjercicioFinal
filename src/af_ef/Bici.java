
package af_ef;


public class Bici {

    //Atributos
    private String modelo;
    private double precio;
    
    //Constructor
    public Bici(String m, double p){
    
        modelo = m;     //Asigno el modelo
        precio = p;     //Asigno el precio
                
    }
    
    //Método para obtener el modelo
    public String ObtenerModelo(){
    
        return modelo;
        
    }
    
    //Método para obtener el precio
    public double ObtenerPrecio(){
    
        return precio;
    
    }
    
    
}
