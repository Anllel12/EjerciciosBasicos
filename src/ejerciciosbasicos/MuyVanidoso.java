
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 */
public class MuyVanidoso {
    
    public static void main(String[] args) {
        MuyVanidoso ejercicios=new MuyVanidoso();
        System.out.println(ejercicios.muyVanidoso(22));
        System.out.println(ejercicios.muyVanidoso(23));
        System.out.println(ejercicios.muyVanidoso(24));
        
    }
    
    public boolean muyVanidoso(int vanidad){
        if(vanidad%11==0 || vanidad%11==1){
            return true;
        }
        return false;
    }
}
