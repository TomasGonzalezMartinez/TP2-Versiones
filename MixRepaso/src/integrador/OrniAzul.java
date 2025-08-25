
package integrador;

/**
 *
 * @author Grupo 2
 */
public class OrniAzul extends Castor{
    private Integer propulsion;

    public OrniAzul(String nombre, double longitudCola, int velocidad, int propulsion) {
        super(nombre, longitudCola, velocidad);
        this.propulsion = propulsion;
    }

    public Integer getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(int propulsion) {
        this.propulsion = propulsion;
    }


    
    @Override
    public void nadar(){
        double velocidadTotal = velocidad + propulsion;
        System.out.println(nombre + "Nadando a " + velocidadTotal + "km/h [Velocidad Base: " + velocidad + " + Propulsion: " + propulsion + "]");
    }

    
    
}
