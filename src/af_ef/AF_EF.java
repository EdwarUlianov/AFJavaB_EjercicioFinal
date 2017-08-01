package af_ef;

import vehiculos.Moto;
import vehiculos.Bici;


public class AF_EF {


    public static void main(String[] args) {
        
        //Probamos la clase Moto
        
        //Creamos una moto
        Moto m = new Moto("Yamaha", 125);
        
        //Mostramos la marca
        System.out.println("La marca de la moto 1 es " + m.ObtenerMarca());
        
        //Mostramos la cilindrada
        System.out.println("La cilindrada de la moto 1 es de " + m.ObtenerCc());
        
        //Probamos la clase Bici
        
        //Creamos una bici
        Bici b = new Bici("Paseo", 100.0);
        
        //Mostramos el modelo
        System.out.println("El modelo de la bici 1 es " + b.ObtenerModelo());
        
        //Mostramos el precio
        System.out.println("El precio de la bici 1 es de " + b.ObtenerPrecio());
        

        
    }
    
}
