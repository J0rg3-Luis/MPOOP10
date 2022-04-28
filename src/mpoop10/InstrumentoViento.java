/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mpoop10;

/**
 * Clase que construye un InstrumentoViento
 * @author alumno
 */
public class InstrumentoViento extends Object implements InstrumentoMusical{
    
    /**
     * Método que indica que se está afinando el instrumento de viento 
     */
    
    @Override
    public void afinar() {
        System.out.println("Afinando instrumento de viento");
    }
    
    /**
     * Método que indica que se está tocando el instrumento de viento
     */
    
    @Override
    public void tocar() {
        System.out.println("Tocando instrumento de viento");
    }
    
    /**
     * Método que imprime el tipo de instrumento  
     * @return La cadena "Instrumento de viento"
     */
    
    @Override
    public String tipoInstrumento() {
        return "Instrumento de viento";
    }
}
