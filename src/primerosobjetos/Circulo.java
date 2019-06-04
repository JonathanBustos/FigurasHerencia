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
/*public void mover (Canvas c, Integer destX, Integer destY) {
        Integer dx = 0, dy = 0;
        if (destX > getX()) {
            dx = 1;
        }
        if (destX < getX()) {
            dx = -1;
        }
        if (destY > getY()) {
            dy = 1;
        }
        if (destY < getY()) {
            dy = -1;
        }
        
        c.setColorDeLapiz(getColor());
        for (Integer i = 0; i < 50; i = i+1) {
            c.rellenarCirculo(getX(), getY(), diametro.intValue());
            c.espera(50);
            c.borrarCirculo(getX(), getY(), diametro.intValue());
            setX(getX()+dx);
            setY(getY()+dy);
        }
        c.rellenarCirculo(getX(), getY(), diametro.intValue());
        
    }*/
        @Override
    public void MoverunLugar(Canvas c){
    c.setColorDeLapiz(getColor());
        
            c.rellenarCirculo(getX(), getY(), diametro);
            c.espera(20);
            c.rellenarCirculo(getX(), getY(), diametro);
            setX(getX()+getDestinoX().intValue());
            setY(getY()+getDestinoY().intValue());
}
}