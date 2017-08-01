package af_ef;


public class Moto {
    
    //Atributos
    private String marca;
    private int cc;
    
    //Constructor
    public Moto (String m, int c){
    
        marca = m;  //Asigno marca
        cc = c;     //Asigno cc
    }
    
    //Método para obtener la Marca
    public String ObtenerMarca(){
    
        return marca;
        
    }
    
    //Método para obtener la cilindrada
    public int ObtenerCc(){
    
        return cc;
        
    }
}
