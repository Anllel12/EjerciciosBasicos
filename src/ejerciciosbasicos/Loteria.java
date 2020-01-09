
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 * 
 */
public class Loteria {
    
    public static void main(String[] args) {
        Loteria ejercicios=new Loteria();
        System.out.println(ejercicios.loteria(2, 2, 2));
        System.out.println(ejercicios.loteria(2, 2, 1));
        System.out.println(ejercicios.loteria(0, 0, 0));
        
    }
    
    public int loteria(int a, int b, int c){
        if(a==b && b==c && a==2){
            return 10;   
        }
        if(a==b && b==c){
           return 5;             
        }
        if(a!=b && a!=c){
           return 1;             
        }
       return 0;
    } 
}
