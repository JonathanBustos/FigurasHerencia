
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
    
    public Triangulo (int base, int altura, Color c) {
        super(c);
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
    
    public void moverTriangulo(Canvas miCanvas){
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





}
