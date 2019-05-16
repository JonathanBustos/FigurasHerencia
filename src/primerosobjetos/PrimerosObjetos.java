
package primerosobjetos;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.HashSet;
import java.util.ArrayList;
public class PrimerosObjetos {
private Canvas miCanvas;

     public static void main(String[] args) {
         ArrayList<Integer> nrosaleatorios = new ArrayList<>();
         Integer valorX=0;
 /*       Rectangulo r1 = new Rectangulo(10.0, 15.0, "Negro");
        Rectangulo r2 = new Rectangulo(3.5, 4.5, "Rojo");
        
        System.out.println("R1 tiene largo = " + r1.getLargo()
                        + " y ancho = " + r1.getAncho());
        System.out.println("R2 tiene largo = " + r2.getLargo()
                        + " y ancho = " + r2.getAncho());
    
        r1.setLargo(8.0);
        System.out.println("R1 tiene largo = " + r1.getLargo()
                        + " y ancho = " + r1.getAncho());
    
        Double perimetro  = r1.Perimetro();
        Double superficie = r1.Superficie();
        System.out.println("R1 tiene sup. = " + superficie
                + " y per. = " + perimetro);
        
        perimetro  = r2.Perimetro();
        superficie = r2.Superficie();
        System.out.println("R2 tiene sup. = " + superficie
                + " y per. = " + perimetro);*/
 /*       PelotasDemo p;
       p = new PelotasDemo();
      p.rebotar();
        p.demoDibujar();
 */      PrimerosObjetos pantalla=new PrimerosObjetos();
     //    pantalla.GraficarFiguras();
         pantalla.ColeccionFiguras();
         
         
    }
      private void ColeccionFiguras () {
        miCanvas = new Canvas("Figuras Geometricas", 1940, 1280);
        miCanvas.setVisible(true);
        Random Ran= new Random();
        int xPos=Ran.nextInt((300)-100);
        int yPos=Ran.nextInt(800);
        ArrayList<FiguraGeometrica> lista = new ArrayList<>();
        
        Rectangulo r = new Rectangulo(100., 50., Color.red, 300, 300);
        lista.add(r);
        r = new Rectangulo(150., 150., Color.yellow, 500, 500);
        lista.add(r);
        r = new Rectangulo(50., 75., Color.blue, 800, 800);
        lista.add(r);
        
        for (FiguraGeometrica f : lista) {
            try {
                Rectangulo r2 = (Rectangulo) f;
                miCanvas.setColorDeLapiz(r2.getColor());
                for(int i = 0; i < 300; i ++) {
            miCanvas.rellenarRectangulo(xPos,yPos,
                         r2.getAncho().intValue(), r2.getLargo().intValue());
            miCanvas.espera(5);
            miCanvas.borrarRectangulo(xPos,yPos,
                         r2.getAncho().intValue(), r2.getLargo().intValue());
      
            yPos++;
            xPos++;
            r2.getX();
            r2.getY();
            r2.getAncho().intValue();
            r2.getLargo().intValue();
        }
        // luego de moverlo, rellenarlo para que permanezca visible
                miCanvas.rellenarRectangulo(r2.getX(), r2.getY(),
                         r2.getAncho().intValue(), r2.getLargo().intValue());
                System.out.println("Lado1 = " + r2.getAncho() + " lado2 = " + r2.getLargo());
            }
            catch (ClassCastException e) {
            }
        }
//        Triangulo t2 = (Triangulo)f;
        
//        System.out.println("Base = " + t2.getBase() + " altura = " + t2.getAltura());
    }
      
      
      

    private void GraficarFiguras() {
        miCanvas = new Canvas("Figuras Geometricas", 1940, 1280);
       miCanvas.setVisible(true);
       
}

   
}
 /*       miCanvas.setColorDeLapiz(Color.lightGray);
        miCanvas.rellenarRectangulo(300, 300, 100, 50);

        miCanvas.setColorDeLapiz(Color.darkGray);
        miCanvas.rellenarCirculo(100, 100, 100);

        miCanvas.setColorDeLapiz(Color.cyan);
        miCanvas.rellenarTriangulo(400, 0, 100, 200);
 int xPos = 1200;
   int yPos=50;
   miCanvas.setColorDeLapiz(Color.BLUE);
        Rectangle rect = new Rectangle(xPos,yPos, 250, 150);

        // mover el rectangulo dentro de la pantalla
        for(int i = 0; i < 600; i ++) {
            miCanvas.rellenar(rect);
            miCanvas.espera(5);
            miCanvas.borrar(rect);
            xPos--;
            yPos++;
            rect.setLocation(xPos, yPos);
        }
        // luego de moverlo, rellenarlo para que permanezca visible
        miCanvas.rellenar(rect);

 /*       Rectangle rect2 = new Rectangle(10,10, 250, 150);
        miCanvas.setColorDeLapiz(Color.black);
        // mover el rectangulo dentro de la pantalla
        for(int i = 0; i < 800; i ++) {
            miCanvas.rellenar(rect2);
            miCanvas.espera(5);
            miCanvas.borrar(rect2);
            xPos++;
            
            rect2.setLocation(xPos, 10);        
        }
        // luego de moverlo, rellenarlo para que permanezca visible
        miCanvas.rellenar(rect2);
 

        miCanvas.setColorDeLapiz(Color.GREEN);
        Triangulo tri = new Triangulo(300,500,Color.GREEN);
        for(int i = 0; i < 800; i ++) {
            miCanvas.rellenarTriangulo( xPos,  yPos,  tri.getBase(),  tri.getAltura());
            miCanvas.espera(5);
            miCanvas.borrarTriangulo( xPos,  yPos, tri.getBase(),  tri.getAltura());
            yPos--;
            
            tri.getX();
            tri.getY();
            tri.getAltura();
            tri.getBase();
        }
        miCanvas.rellenarTriangulo( xPos,  yPos,  tri.getBase(),  tri.getAltura());
        // luego de moverlo, rellenarlo para que permanezca visible
       
        miCanvas.setColorDeLapiz(Color.MAGENTA);
        Circulo circ= new Circulo(200.0,100.0,Color.MAGENTA);
        for(int i = 0; i < 800; i ++) {
            miCanvas.rellenarCirculo(xPos,yPos,300.0);
            miCanvas.espera(5);
            miCanvas.borrarCirculo( xPos,yPos,300.0);
            xPos++;
            
            circ.getX();
            circ.getY();
            circ.getRadio();
            circ.getDiametro();
        }
        miCanvas.rellenarCirculo(xPos,yPos,300.0);
    }

}
    
 /*    private void Triangulo() {
        miCanvas = new Canvas("Figuras Geometricas", 600, 500);
        miCanvas.setVisible(true);

        miCanvas.setColorDeLapiz(Color.red);
        miCanvas.rellenarRectangulo(300, 300, 100, 50);

        miCanvas.setColorDeLapiz(Color.blue);
        miCanvas.rellenarCirculo(100, 100, 100);

        miCanvas.setColorDeLapiz(Color.green);
        miCanvas.rellenarTriangulo(400, 0, 100, 200);

    
     }
}  */
     
