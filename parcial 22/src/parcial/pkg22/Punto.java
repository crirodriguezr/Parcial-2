/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.pkg22;

/**
 *
 * @author Estudiantes
 */
public class Punto {
    
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        if (x<0){
            System.out.println("Asegurate que los puntos se encuentren en el primer cuadrante");
        }
        return x;
    }

    public int getY() {
        if (y<0){
         System.out.println("Asegurate que los puntos se encuentren en el primer cuadrante");
        }
        return y;
    }
    
    
}
