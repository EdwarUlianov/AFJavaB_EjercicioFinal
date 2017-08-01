package af_ef;


public class AF_EF {


    public static void main(String[] args) {
        
        //Probamos la clase Moto
        
        //Creamos una moto
        Moto m = new Moto("Yamaha", 125);
        
        //Mostramos la marca
        System.out.println("La marca de la moto 1 es " + m.ObtenerMarca());
        
        //Mostramos la cilindrada
        System.out.println("La cilindrada de la moto 1 es de " + m.ObtenerCc());
        

        
    }
    
}
