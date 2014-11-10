
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesusrosas
 */
public class Calzado {
    public String nombre;
    public int prod;
    public int fail;
    
    public Calzado(String nom){
        nombre=nom;
    }
    
    public Calzado(){
        
    }
    
    public void Leer() throws IOException{
        System.out.print(nombre+" Cantidad de Producción? ");
        prod=Leer.datoInt();
        System.out.print(nombre +" Cantidad de Defectos? ");
        fail=Leer.datoInt();  
    }
    
    public void Muestra(){
        System.out.println(nombre+" Produccion: "+prod);
        System.out.println(nombre+" Defectos: "+fail);
    }
    
    
}
