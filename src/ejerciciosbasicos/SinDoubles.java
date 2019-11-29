
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 * 
 */
public class SinDoubles {
    
    public static void main(String[] args) {
        
        SinDoubles ejercicios=new SinDoubles();
        
        System.out.println(ejercicios.sinDoubles(2, 3, true));
        System.out.println(ejercicios.sinDoubles(3, 3, true));
        System.out.println(ejercicios.sinDoubles(3, 3, false));
        System.out.println(ejercicios.sinDoubles(6, 6, true));
    }
    
    int c=0;
    
    public int sinDoubles(int a, int b, boolean noDoubles){
        
        c=a+b;
        
        if(noDoubles==true && a==b){
            return c+1;
        }
        return c;
    } 
}
