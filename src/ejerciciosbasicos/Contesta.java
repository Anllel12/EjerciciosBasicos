 
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 */
public class Contesta {
    
   public static void main(String[] args) {
        Contesta ejercicios=new Contesta();
        System.out.println(ejercicios.contesta(false, false, false));
        System.out.println(ejercicios.contesta(false, false, true));
        System.out.println(ejercicios.contesta(true, false, true));
        
    }
    
    public boolean contesta(boolean matinal, boolean madre, boolean dormido){
        if(!matinal && !madre && !dormido){
            return true;
        }
        return false;
    } 
}
