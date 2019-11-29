
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 * 
 */
public class MultiploMultiple {
    
    public static void main(String[] args) {
        MultiploMultiple ejercicios=new MultiploMultiple();
        System.out.println(ejercicios.multiploMultiple(3));
        System.out.println(ejercicios.multiploMultiple(10));
        System.out.println(ejercicios.multiploMultiple(15));
        
    }
    
    public boolean multiploMultiple(int a){
        
        if(a%3==0  &&  a%5==0){
            return false;
        }
        if(a%3==0){
            return true;
        }
        if(a%5==0){
            return true;
        }
        return false;
    } 
}
