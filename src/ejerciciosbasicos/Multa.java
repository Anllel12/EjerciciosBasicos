
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 */
public class Multa {
    
    public static void main(String[] args) {
        Multa ejercicios=new Multa();
        System.out.println(ejercicios.multa(60, false));
        System.out.println(ejercicios.multa(65, false));
        System.out.println(ejercicios.multa(65, true));
        
    }
    
    public boolean multa(int numBellotas, boolean finSemana){
        if(numBellotas>=40 && numBellotas<=60){
            return true;
        } 
        if(finSemana==true){
            return true;
        }
        return false;
    }
}
