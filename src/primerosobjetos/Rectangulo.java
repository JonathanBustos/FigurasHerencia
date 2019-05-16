/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerosobjetos;
import java.awt.Color;

/**
 *
 * @author Alumno
 */
public class Rectangulo extends FiguraGeometrica{
    private Double largo, ancho;
    
   public Rectangulo (Double l, Double a, Color c) {
        super(c);
        largo = l;
        ancho = a;
    }
    
//    public Rectangulo (Double l, Double a, String c, Integer x, Integer y) {
    public Rectangulo (Double l, Double a, Color c, Integer x, Integer y) {
        super(x, y, c);
        largo = l;
        ancho = a;
    }
  

    public Double getLargo() {
        return largo;
    }

    public void setLargo(Double largo) {
        this.largo = largo;
    }

    public Double getAncho() {
        return ancho;
    }

    public void setAncho(Double ancho) {
        this.ancho = ancho;
    }

    
    
    public Double Perimetro () {
        return 2 * largo + 2 * ancho;
    }

    public Double Superficie () {
        return largo * ancho;
    }
}
