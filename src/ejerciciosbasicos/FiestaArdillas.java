
package ejerciciosbasicos;

/**
 *
 * @author Angel Esquinas
 */
public class FiestaArdillas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FiestaArdillas ejercicios=new FiestaArdillas();
        System.out.println(ejercicios.fiestaArdillas(30, false));
        System.out.println(ejercicios.fiestaArdillas(50, false));
        System.out.println(ejercicios.fiestaArdillas(70, true));
        
    }
    
    public boolean fiestaArdillas(int numBellotas, boolean finSemana){
        if(numBellotas>=40 && numBellotas<=60){
            return true;
        } 
        if(finSemana==true){
            return true;
        }
        return false;
    }
}
