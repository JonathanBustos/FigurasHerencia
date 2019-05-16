
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
    
}
