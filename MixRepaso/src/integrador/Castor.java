
package integrador;

/**
 *
 * @author Cetera Evelyn
 */
public class Castor {
    protected String nombre;
    protected double longitudCola;
    protected int velocidad;

    public Castor(String nombre, double longitudCola, int velocidad) {
        this.nombre = nombre;
        this.longitudCola = longitudCola;
        this.velocidad = velocidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public double getLongitudCola() {
        return longitudCola;
    }

    public void setLongitudCola(double longitudCola) {
        this.longitudCola = longitudCola;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    
    public void nadar(){
        System.out.println("Nadando a la velocidad de: " + 
                velocidad);
    }
    
    public void tocarGuitarra(){
        for (int i = 0; i < 3; i++) {
            int random = (int)(Math.random()* 6) + 1;
            System.out.println("Toca cuerda: " + random);
        }
    }
    
}
