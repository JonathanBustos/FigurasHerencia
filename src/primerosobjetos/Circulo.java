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
public class Circulo extends FiguraGeometrica{
    private Double radio,diametro;
    
    public Circulo(Double r, Double d, Color c){
    super(c);
    radio=r;
    diametro=d;
}
   

    public Double getDiametro() {
        return diametro;
    }

    public void setDiametro(Double diametro) {
        this.diametro = diametro;
    }
    
    
    



public Double getRadio(){
    return radio;
}

public Double Superficie(){
    return (3.14*radio *radio);
}

public Double Perimetro(){
    return 3.14 * diametro;
}
}