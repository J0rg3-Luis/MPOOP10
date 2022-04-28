/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mpoop10;

/**
 *
 * @author alumno
 */
public class MPOOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Flauta flauta = new Flauta();
        System.out.println(flauta.tipoInstrumento());
        
        InstrumentoMusical instrumento = flauta;
        instrumento.tocar();
        instrumento.afinar();
        
        double pi = Math.PI;
        double e = Math.E;
        System.out.println(pi);
        System.out.println(e);
        System.out.println(Math.abs(-100));
        
        System.out.println("El mes "+Meses.DOCE+" corresponde a: ");
        System.out.println(Meses.NOMBRE_MESES[Meses.DOCE]);
    }
}
