
package primerosobjetos;
import java.awt.Color;
/**
 *
 * @author Alumno
 */
public class Triangulo extends FiguraGeometrica {
    private int base, altura;
    private Color color;
    private int x,y;

    
    
   // private String color;
    
    public Triangulo (int base, int altura, Color c,int x,int y) {
        super(x,y,c);
        this.base = base;
        this.altura = altura;
        
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the color
     */
    
 /*   public void moverTriangulo(Canvas miCanvas){
        miCanvas.setColorDeLapiz(getColor());
        Velocidad();
        setX(MoverAleatorio());
        setY(MoverAleatorio());
                for(int i = 0; i < 300; i ++) {
            miCanvas.rellenarTriangulo(getX(),getY(),
                         getBase(),getAltura());
            miCanvas.espera(5);
            miCanvas.borrarTriangulo(getX(),getY(),
                         getBase(),getAltura());
          
            setX(getX()+getVelocidadX());
            setY(getY()+getVelocidadY());
            getX();
            getY();
            getBase();
            getAltura();
           
        }
        // luego de moverlo, rellenarlo para que permanezca visible
                miCanvas.rellenarTriangulo(getX(), getY(),
                         getBase(),getAltura());
    }
*/
   /* public void mover (Canvas c, Integer destX, Integer destY) {
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
            c.rellenarTriangulo(getX(), getY(), altura, base);
            c.espera(50);
            c.borrarTriangulo(getX(), getY(), altura, base);          
            setX(getX()+dx);
            setY(getY()+dy);
        }
        c.rellenarTriangulo(getX(), getY(), altura, base);
        
    } */ 
    @Override
    public void MoverunLugar(Canvas c){

    c.setColorDeLapiz(getColor());
        
            c.borrarTriangulo(getX(), getY(), altura, base);
            ActualizarPosicion();
            c.rellenarTriangulo(getX(), getY(), altura, base);
            
}



}
