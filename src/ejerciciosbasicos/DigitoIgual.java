
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 */
public class DigitoIgual {
    
    public static void main(String[] args) {
        DigitoIgual ejercicios=new DigitoIgual();
        System.out.println(ejercicios.digitoIgual(12, 23));
        System.out.println(ejercicios.digitoIgual(12, 43));
        System.out.println(ejercicios.digitoIgual(12, 44));
        
    }
    
    public boolean digitoIgual(int a, int b){
        if(a/10==b/10 || a/10==b%10 || b/10==a/10 || b/10==a%10 || a%10==b%10 || b%10==a%10){
            return true;
        }
        return false;
    } 
}
