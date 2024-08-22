
package parcial1g1;

import java.net.SocketTimeoutException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        
        try {
            Scanner en = new Scanner(System.in);
            
            int CANTIDAD_VEICULOS = 0 ;
            int CANTIDAD_METROS_VEICULO = 0 ;
            float COMBUSTIBLE_X_VEICULO = 0 ,  COMBUSTIBLE_TOTAL = 0 , COMVERSION_X_VEICULO = 0 , SUMA_DISTANCIA = 0 ;


            System.out.println("CUANTOS VEICULOS PARTICIPARON : ");
            CANTIDAD_VEICULOS = en.nextInt();

           //CICLO

            for(int i = 1 ; i <= CANTIDAD_VEICULOS ; i++){
                
                System.out.println("INGRESE CUANTOS METROS RECORRIDOS POR EL VEICULO #" + i);
                CANTIDAD_METROS_VEICULO = en.nextInt();
                
                COMVERSION_X_VEICULO = (float) (CANTIDAD_METROS_VEICULO / 1000) ;
                
                COMBUSTIBLE_X_VEICULO = (calcularConsumoGasolina ( COMVERSION_X_VEICULO));

                System.out.println("");
                
                System.out.println("VEICULO #" + i +  " KM -->  " + COMVERSION_X_VEICULO + "    LITROS DE COMBUSTIBLE : " +  COMBUSTIBLE_X_VEICULO);
                
                System.out.println("");

                
                SUMA_DISTANCIA = SUMA_DISTANCIA + COMVERSION_X_VEICULO ;
                COMBUSTIBLE_TOTAL = COMBUSTIBLE_TOTAL + COMBUSTIBLE_X_VEICULO; 

                
               

           }

           System.out.println("");
           System.out.println("LA DISTANCIAS TOTAL DE TODOS LO VEICULOS ES DE : " + SUMA_DISTANCIA +" KM");
           System.out.println("");
           System.out.println("EL COMBUSTIBLE TOTAL DE CADA VEICULO ES DE : " + COMBUSTIBLE_TOTAL + " LITROS");
            
           
           
            
        } catch (Exception e) {
            System.out.println("ERROR DEL PROGRAMA" + e);
        }
        
    }

    /*  Implemente una funcion llamada calcularConsumoGasolina que cumpla con las siguientes caracteristicas
        * Recibe: 
            - Un float representando los km recorridos
        * Retorna:
            - Un float representando los litros de gasolina consumidos
    */
    //------------------------------------------------------------------
    //Implemente la funcion en este espacio
    public static float calcularConsumoGasolina(float COMVERSION_X_VEICULO){
        try {
            
            return ((COMVERSION_X_VEICULO * 55) / 750);
        
        } catch (Exception e) {
            return -1;
        }
       
       
    }
    //------------------------------------------------------------------

}
