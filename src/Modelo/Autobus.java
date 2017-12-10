
package Modelo;//Hola

public class Autobus extends Vehiculo{
    private String numeroPlazas;

    public Autobus() {
    }

    public Autobus(String numeroPlazas, String matricula, String modelo, String potenciaCV) {
        super(matricula, modelo, potenciaCV);
        this.numeroPlazas = numeroPlazas;
    }

    public String getNumeroPlazas() {
        return numeroPlazas;
    }

    public void setNumeroPlazas(String numeroPlazas) {
        this.numeroPlazas = numeroPlazas;
    }
    
    
    @Override
    public void consumo() {

    }

    @Override
    public String toString() {
        return super.toString()+"\n"+"Este es bus"; 
    }
    
    
}
