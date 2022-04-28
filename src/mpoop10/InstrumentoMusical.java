/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mpoop10;

/**
 * Interfaz que construye un instrumentoMusical 
 * @author alumno
 */
public interface InstrumentoMusical {
    //Por defecto todos los métodos definidos dentro de una interfaz son públicos y abstractos
    
    /**
     * Método que indica que se está afinando el instrumento musical (No devuelve nada)
     */
    
    void afinar();

    /**
     * Método que indica que se está tocando el instrumento musical (No devuelve nada)
     */
    
    void tocar();
    
    /**
     * Método que imprime el tipo de instrumento  
     * @return (No devuelve nada)
     */
    
    String tipoInstrumento();    
}
