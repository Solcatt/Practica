package Ejercicio;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.print("Ingrese precio de camisa: ");
        float camisa = Float.parseFloat(teclado.next());
        System.out.print("Ingrese unidades de camisa(s): ");
        float unidades = Float.parseFloat(teclado.next());
        
        float imporcompra = calcuCompra(camisa, unidades);
        float descuento1 = calcuDescuento1(imporcompra);
        float restante = calcuRest(imporcompra, descuento1);
        float descuento2 = calcuDescuento2(restante);
        float descuentoT = calcuDescuentoT(descuento1, descuento2);
        float pagar = TotalPagar(imporcompra, descuentoT);
        
        Resultados(descuento1, descuento2, descuentoT, pagar);
    }
    
    public static float calcuCompra(float camisa, float unidades){
        return camisa * unidades;
    }
    
    public static float calcuDescuento1(float imporcompra){
        return imporcompra * 7 / 100;
    }
    
    public static float calcuRest(float imporcompra, float descuento1){
        return imporcompra - descuento1;
    }
    
    public static float calcuDescuento2( float restante){
        return restante * 7 / 100;
    }
    
    public static float calcuDescuentoT(float descuento1, float descuento2){
        return descuento1 + descuento2;
    }
    
    public static float TotalPagar(float imporcompra, float descuentoT){
        return imporcompra - descuentoT;
    }
    
    public static void Resultados(float descuento1, float descuento2, float descuentoT, float pagar){
        System.out.println("El descuento 1 es: " + descuento1);
        System.out.println("El descuento 2 es: " + descuento2);
        System.out.println("El descuento total es: " + descuentoT);
        System.out.println("El total a pagar es: " + pagar);
    }
}
