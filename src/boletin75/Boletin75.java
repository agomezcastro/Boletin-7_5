

package boletin75;

/**
 *
 * @author agomezcastro
 */
public class Boletin75 {

    
    public static void main(String[] args) {
        int num1, num2, num3;
        CompararNumeros obx= new CompararNumeros();
        num1= obx.pedirNumEnteiro();
        num2= obx.pedirNumEnteiro();
        num3= obx.pedirNumEnteiro();
        obx.comparar(num1, num2, num3);
    }
    
}
