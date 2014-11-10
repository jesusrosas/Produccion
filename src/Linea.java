
import java.io.IOException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jesusrosas
 */
public class Linea {
    //Atributos
    public String nombre;
    public int totalProd;
    public int totalFail;
    public int totalFinal;
    Calzado tipo1 = new Calzado("Tipo1");
    Calzado tipo2 = new Calzado("Tipo2");
    Calzado tipo3 = new Calzado("Tipo3");
    
    //Métodos
    public Linea(String nom){ //Este constructor le asigna nombre a la linea
        nombre=nom;
    }
    
    public Linea(){
        
    }
    public void Leer() throws IOException{
        System.out.println("Leyendo datos de: "+nombre);
        tipo1.Leer();
        tipo2.Leer();
        tipo3.Leer();
        
    }
    
    public void Muestra(){
        System.out.println("=====================================");
        System.out.println("Se Monstrarán los datos de: "+nombre);
        //tipo1.Muestra();
        //tipo2.Muestra();
        //tipo3.Muestra();
        Total();
        System.out.println("Total Producción: "+totalProd);
        System.out.println("Total Defectos: "+totalFail);
        System.out.println("Total Final: "+totalFinal);
    }
    
    public void Total(){
        totalProd=tipo1.prod+tipo2.prod+tipo3.prod;
        totalFail=tipo1.fail+tipo2.fail+tipo3.fail;
        totalFinal=totalProd-totalFail;
    }
    
}
