
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 */
public class Menos20 {
  
    public static void main(String[] args) {
        Menos20 ejercicios=new Menos20();
        System.out.println(ejercicios.menos20(18));
        System.out.println(ejercicios.menos20(19));
        System.out.println(ejercicios.menos20(20));
        
    }
    
    public boolean menos20(int a){
        if((a+1)%20==0){
            return true;   
        }
        if((a+2)%20==0){
           return true;             
        }
       return false;
    } 
}
