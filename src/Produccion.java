
import java.io.IOException;


/** 
 * @author jesusrosas
 * jesusrosas@gmail.com
 * www.jesusrosas.com.mx
 */
public class Produccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int TotalDefectosTipo1;
        int TotalDefectosTipo2;
        int TotalDefectosTipo3;
      
        //Creamos las instancias de la clase linea.
        Linea linA = new Linea("Linea A");
        Linea linB = new Linea("Linea B");
        Linea linC = new Linea("Linea C");
        Linea linD = new Linea("Linea D");
        Linea linE = new Linea("Linea E");
        Linea arreglo[]=new Linea[5];
        Calzado arrCalzado[]=new Calzado[3];
        
        //Leemos cada linea
        linA.Leer();
        linB.Leer();
        linC.Leer();
        linD.Leer();
        linE.Leer();
        
        //Mostramos Total Produccion
        linA.Muestra();
        linB.Muestra();
        linC.Muestra();
        linD.Muestra();
        linE.Muestra();
        
        //Generalmos Total de defectos por tipo
        TotalDefectosTipo1=linA.tipo1.fail+linB.tipo1.fail+linC.tipo1.fail+linD.tipo1.fail+linE.tipo1.fail;
        TotalDefectosTipo2=linA.tipo2.fail+linB.tipo2.fail+linC.tipo2.fail+linD.tipo2.fail+linE.tipo2.fail;
        TotalDefectosTipo3=linA.tipo3.fail+linB.tipo3.fail+linC.tipo3.fail+linD.tipo3.fail+linE.tipo3.fail;
        System.out.println("Total Defectos Tipo1: "+TotalDefectosTipo1);
        System.out.println("Total Defectos Tipo2: "+TotalDefectosTipo2);
        System.out.println("Total Defectos Tipo3: "+TotalDefectosTipo3);
        
        //Creamos los objetos temporales para ordenar los productos
        Calzado Cal1=new Calzado();
        Calzado Cal2=new Calzado();
        Calzado Cal3=new Calzado();
        
        //Asignamos los valores generados
        Cal1.nombre="Tipo1";
        Cal1.fail=TotalDefectosTipo1;
        Cal2.nombre="Tipo2";
        Cal2.fail=TotalDefectosTipo2;
        Cal3.nombre="Tipo3";
        Cal3.fail=TotalDefectosTipo3;
        
         //preparamos el arreglo de instancias de calzado para el ordenamiento
        arrCalzado[0]=Cal1;
        arrCalzado[1]=Cal2;
        arrCalzado[2]=Cal3;
        
        //preparamos el arreglo de instancias de Linea para el ordenamiento
        arreglo[0]=linA;
        arreglo[1]=linB;
        arreglo[2]=linC;
        arreglo[3]=linD;
        arreglo[4]=linE;
        
        //Ordenamos el arreglo de instancia de Lineas
        Seleccion(arreglo);
        
        SeleccionProducto(arrCalzado);
        
        //imprimimos el Arreglo de instancia de Lineas ordenado por Mayor produccion.
        System.out.print("Lineas en Orden de Mayor produccion: ");
        for(int i=0; i < arreglo.length; i++){
            System.out.print(arreglo[i].nombre+" ");
        }
        
        System.out.println("");
         //imprimimos el Arreglo de instancia de Calzado ordenado por mayor fallas
        System.out.print("Productos con más fallas: ");
        for(int i=0; i < arrCalzado.length; i++){
            System.out.print(arrCalzado[i].nombre+" ");
        }
        
        
    }
    
    /**
     *
     * @param arreglo
     */
    public static void Seleccion(Linea arreglo[]){
        int i, j, pos;
        Linea mayor =new Linea();
        Linea temp =new Linea();
        
        for(i=0; i < arreglo.length-1;i++){
            mayor=arreglo[i];
            pos=i;
            for(j=i+1; j < arreglo.length; j++){
                if(arreglo[j].totalFinal > mayor.totalFinal){
                    mayor = arreglo[j];
                    pos=j;
                }
            }
            if(pos != i){
                temp=arreglo[i];
                arreglo[i]=arreglo[pos];
                arreglo[pos]=temp;
            }
        }
        
    }
    
    public static void SeleccionProducto(Calzado arrCalzado[]){
        int i, j, pos;
        Calzado mayor =new Calzado();
        Calzado temp =new Calzado();
        
for(i=0; i < arrCalzado.length-1;i++){
            mayor=arrCalzado[i];
            pos=i;
            for(j=i+1; j < arrCalzado.length; j++){
                if(arrCalzado[j].fail > mayor.fail){
                    mayor = arrCalzado[j];
                    pos=j;
                }
            }
            if(pos != i){
                temp=arrCalzado[i];
                arrCalzado[i]=arrCalzado[pos];
                arrCalzado[pos]=temp;
            }
        }
    }
}
