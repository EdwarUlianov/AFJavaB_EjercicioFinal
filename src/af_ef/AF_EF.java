package af_ef;

import vehiculos.Moto;
import vehiculos.Bici;


public class AF_EF {


    public static void main(String[] args) {
        
        //Probamos la clase Moto
        System.out.println("/////////////////////////////////////////////");
        System.out.println("______PRUEBAS CON LAS CLASES MOTO Y BICI_____");
        System.out.println("/////////////////////////////////////////////");
        
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
        
        //Hacemos un separador para dejar más claro el output
        System.out.println("/////////////////////////////////////////////");
        System.out.println("_________PRUEBAS CON LA CLASE PERSONA________");
        System.out.println("/////////////////////////////////////////////");
        
        //Creamos una persona sin moto ni bici
        Persona p1 = new Persona("Alejandra", 6);
        
        //Le añadimos DNI
        p1.MeterDni("No tiene DNI");
        
        //Le añadimos descripción
        p1.MeterDescripcion("Niña muy simpática, un poco renegona.");
        
        //Mostramos sus datos
        System.out.println("=================================================");
        p1.MostrarPersona();
        System.out.println("=================================================");
        
        //Creamos una persona con moto
        Persona p2 = new Persona("Eduardo", 39, "Custom", 125);
        
        //Le añadimos DNI
        p2.MeterDni("00000000x");
        
        //Le añadimos descripción
        p2.MeterDescripcion("Fuerte");
        
        //Mostramos sus datos
        p2.MostrarPersona();
        System.out.println("Tienen una moto "+p2.ObtenerMoto().ObtenerMarca());
        System.out.println("de "+p2.ObtenerMoto().ObtenerCc()+" CC");
        System.out.println("=================================================");
        
        //Creamos una persona con bici
        Persona p3 = new Persona("Kenji", 79, "Kawai", 200.0);
        
        //Le añadimos DNI
        p3.MeterDni("j4p0n3sM");
        
        //Le añadimos descripción
        p3.MeterDescripcion("Músico asiático con pelo blanco");
        
        //Mostramos sus datos
        p3.MostrarPersona();
        System.out.println("Tiene una bici modelo "+p3.ObtenerBici().ObtenerModelo());
        System.out.println("Que está valorada en "+p3.ObtenerBici().ObtenerPrecio()+"€");
        System.out.println("=================================================");
        

        
    }
    
}
