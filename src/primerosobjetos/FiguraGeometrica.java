/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primerosobjetos;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Alumno
 */
public class FiguraGeometrica {
    private Integer x, y,Al,col1,col2,col3,col4,col5;
    private Color color,colorAl,Re;

    public FiguraGeometrica (Color color) {
        this.x = 0;
        this.y = 0;
        this.color = color;
    }
    
    public FiguraGeometrica (Integer x, Integer y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }
    
    /**
     * @return the x
     */
    public Integer getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public Integer getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * @return the color
     */
    public Color getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(Color color) {
        this.color = color;
    }
    public Integer MoverAleatorio(){
          Random Ran =new Random();
       
          setAl((Integer) Ran.nextInt((1200)-300));
          return getAl();
      }

    /**
     * @return the Al
     */
    public Integer getAl() {
        return Al;
    }

    /**
     * @param Al the Al to set
     */
    public void setAl(Integer Al) {
        this.Al = Al;
    }
    public Color ColorAleatorio(){
        Random Ran1 = new Random();
        col1=Ran1.nextInt((1)+1);
        if (col1==1){
      //      col1=Re;
        }
       
        
       return Re;
        
        
    }

}

