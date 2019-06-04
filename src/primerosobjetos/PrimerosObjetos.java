
package primerosobjetos;
import java.util.Random;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.HashSet;
import java.util.ArrayList;
public class PrimerosObjetos {
private Canvas miCanvas;

     public static void main(String[] args) {
    //     ArrayList<Integer> nrosaleatorios = new ArrayList<>();
     //    Integer valorX=0;
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
        // pantalla.ColeccionFiguras();
        pantalla.MoverFiguras();
         
         
    }
      private void ColeccionFiguras () {
        miCanvas = new Canvas("Figuras Geometricas", 1940, 1280);
        miCanvas.setVisible(true);
       
        ArrayList<FiguraGeometrica> lista = new ArrayList<>();
        
        Rectangulo r = new Rectangulo(300., 300., Color.red,500,500);
        lista.add(r);
        r = new Rectangulo(150., 150., Color.DARK_GRAY, r.MoverAleatorio(), r.MoverAleatorio());
        lista.add(r);
        r = new Rectangulo(75., 75., Color.blue, r.MoverAleatorio(), r.MoverAleatorio());
        lista.add(r);
        r= new Rectangulo (190.,190.,Color.CYAN,r.MoverAleatorio(),r.MoverAleatorio());
        lista.add(r);
        Triangulo t = new Triangulo(200,300,Color.GREEN);
        lista.add(t);
        t = new Triangulo(100,50,Color.pink);
        lista.add(t);
      }
      private void MoverFiguras () {
        miCanvas = new Canvas("Figuras Geometricas", 600, 500);
        miCanvas.setVisible(true);
        ArrayList<FiguraGeometrica> lista = new ArrayList<>();
        Random valor = new Random();
        
        Rectangulo r = new Rectangulo(100., 50., Color.red, 300, 300);
        lista.add(r);
        Triangulo t = new Triangulo( 100, 200, Color.green);
        lista.add(t);
        t = new Triangulo(150,80,Color.pink);
        lista.add(t);
        t = new Triangulo(180,120,Color.black);
        lista.add(t);
        r = new Rectangulo(150., 150., Color.yellow, 200, 200);
        lista.add(r);
        r = new Rectangulo(50., 75., Color.blue, 100, 100);
        lista.add(r);
        
        for (FiguraGeometrica f : lista) {
            for(int i=0;i>,i++){
                
           
            f.MoverunLugar(miCanvas);
        }}
      }
        
        
        
  //      for (FiguraGeometrica f : lista) {
            
            
  //         try {
  //              Rectangulo r2 = (Rectangulo) f;
  //              r2.MoverRectangulo( miCanvas);
       //         Triangulo t2 = (Triangulo)f;
  /*              miCanvas.setColorDeLapiz(r2.getColor());
        int yPos=r2.getY();
        int xPos=r2.getX();
      //  int yPos1=t2.getY();
      //  int xPos1=t2.getX();
                for(int i = 0; i < 150; i ++) {
            miCanvas.rellenarRectangulo(yPos,xPos,
                         r2.getAncho().intValue(), r2.getLargo().intValue());
            miCanvas.espera(5);
            miCanvas.borrarRectangulo(yPos,xPos,
                         r2.getAncho().intValue(), r2.getLargo().intValue());
          
            yPos++;
            xPos++;
            r2.getX();
            r2.getY();
            r2.getAncho().intValue();
            r2.getLargo().intValue();
      /*      miCanvas.rellenarTriangulo(r2.getX(),r2.getY(), t.getBase(),t.getAltura());
            miCanvas.espera(5);
            miCanvas.borrarTriangulo(r2.getX(),r2.getY(), t.getBase(),t.getAltura());*/
        
        // luego de moverlo, rellenarlo para que permanezca visible
   //             miCanvas.rellenarRectangulo(xPos, yPos,
   //                      r2.getAncho().intValue(), r2.getLargo().intValue());
    //            System.out.println("Lado1 = " + r2.getAncho() + " lado2 = " + r2.getLargo());
            
   //         catch (ClassCastException e) {
                
     //       }
    //    }
      

        
    //    for (FiguraGeometrica f : lista) {
    //        try {
                
  //              Triangulo t2 = (Triangulo)f;
   //             t2.moverTriangulo(miCanvas);
   /*             miCanvas.setColorDeLapiz(t2.getColor());
        int yPos=t2.MoverAleatorio();
        int xPos=t2.MoverAleatorio();
                for(int i = 0; i < 300; i ++) {
            miCanvas.rellenarTriangulo(yPos,xPos,
                         t2.getBase(),t2.getAltura());
            miCanvas.espera(5);
            miCanvas.borrarTriangulo(yPos,xPos,
                         t2.getBase(),t2.getAltura());
          
            yPos++;
            xPos++;
            t2.getX();
            t2.getY();
            t2.getBase();
            t2.getAltura();
           
        }
        // luego de moverlo, rellenarlo para que permanezca visible
                miCanvas.rellenarTriangulo(xPos, yPos,
                         t2.getBase(),t2.getAltura());
            //    System.out.println("Lado1 = " + r2.getAncho() + " lado2 = " + r2.getLargo());
            }
               
   //   */    
   //         catch (ClassCastException e) {
    //        }
        
//        Triangulo t2 = (Triangulo)f;
        
//        System.out.println("Base = " + t2.getBase() + " altura = " + t2.getAltura());
    }

      



/*    private void GraficarFiguras() {
        miCanvas = new Canvas("Figuras Geometricas", 1940, 1280);
       miCanvas.setVisible(true);
       
}*/

   

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
     
