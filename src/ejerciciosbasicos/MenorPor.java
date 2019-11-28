
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 */
public class MenorPor {
    
    public static void main(String[] args) {
        MenorPor ejercicios=new MenorPor();
        System.out.println(ejercicios.menorPor(1, 7, 11));
        System.out.println(ejercicios.menorPor(1, 7, 10));
        System.out.println(ejercicios.menorPor(11, 1, 7));
        
    }
    
    public boolean menorPor(int a, int b, int c){
        if(a-10>=b || a-10>=c || b-10>=a || b-10>=c || c-10>=a || c-10>=b){
            return true;
        }
        return false;
    } 
}
