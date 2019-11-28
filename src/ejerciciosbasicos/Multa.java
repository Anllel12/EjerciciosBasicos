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
    
    public int multa(int velocidad, boolean cumple){
        if(cumple){
            velocidad-=5;
        }
        if(velocidad<=60){
            return 0;
        }
        if(velocidad>60 || velocidad<=80){
            return 1;
        }
        return 2;
    }
}
