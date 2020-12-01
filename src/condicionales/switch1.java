/*
 menu
1. circulo
2. rectangulo
3. triangulo
4. trapecio
5. salir
seleccione la opcion:
 */
package condicionales;
import java.util.Scanner;
import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.System.out;
import java.util.Scanner;
/**
 *
 * @author pablo
 */
public class switch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        System.out.println("Menu Areas");
        System.out.println("1. Círculo");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Trapecio");
        System.out.println("5. Salir");
        System.out.println("Seleccione la opción:");
        opcion=input.nextInt();
        switch(opcion){
            case 1:
                System:out.println("area del circulo");
                float radio;
                double area;
                System.out.println("Ingrese el radio:");
                radio=input.nextFloat();
                area=PI*pow(radio,2);
                System.out.println("Area="+area);
                break;
            case 2:
                System.out.println("Área del reactángulo");
                break;
            case 3:
                System.out.println("Área del triángulo");
                break;
            case 4:
                System.out.println("Área del trapecio");
                break;
            case 5: 
                System.out.println("Salida...");
                break;
            default:
                System.out.println("Opcion equivocada...");
                
                    
                   
        
        
    }
    }
    
    
    
}
