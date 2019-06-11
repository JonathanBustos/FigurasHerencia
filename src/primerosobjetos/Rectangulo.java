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
  /*  public void MoverRectangulo( Canvas miCanvas){
        Velocidad();
     miCanvas.setColorDeLapiz(getColor());
        
      //  int yPos1=t2.getY();
      //  int xPos1=t2.getX();
                for(int i = 0; i < 300; i ++) {
            miCanvas.rellenarRectangulo(getX(),getY(),
                         getAncho().intValue(), getLargo().intValue());
            miCanvas.espera(VelEspera());
            miCanvas.borrarRectangulo(getX(),getY(),
                         getAncho().intValue(), getLargo().intValue());
          
            setX(getX()+getVelocidadX());
            setY(getY()+getVelocidadY());
            getAncho().intValue();
            getLargo().intValue();
            
      /*      miCanvas.rellenarTriangulo(r2.getX(),r2.getY(), t.getBase(),t.getAltura());
            miCanvas.espera(5);
            miCanvas.borrarTriangulo(r2.getX(),r2.getY(), t.getBase(),t.getAltura());
        }
        // luego de moverlo, rellenarlo para que permanezca visible
                miCanvas.rellenarRectangulo(getX(), getY(),
                         getAncho().intValue(), getLargo().intValue());*/
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
            c.rellenarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());
            c.espera(50);
            c.borrarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());            
            setX(getX()+dx);
            setY(getY()+dy);
        }
        c.rellenarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());
        
    }*/
        @Override
    public void MoverunLugar(Canvas c){
    c.setColorDeLapiz(getColor());
        
            
            c.borrarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());
            ActualizarPosicion();
            c.rellenarRectangulo(getX(), getY(), largo.intValue(), ancho.intValue());
           
}
}
