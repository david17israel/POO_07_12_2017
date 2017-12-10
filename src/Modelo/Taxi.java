

package Modelo;

import javax.swing.JOptionPane;

public class Taxi extends Vehiculo{
    private int numeroLicencia;

    public Taxi() {
    }

    public Taxi(int numeroLicencia, String matricula, String modelo, String potenciaCV) {
        super(matricula, modelo, potenciaCV);
        this.numeroLicencia = numeroLicencia;
    }

    public int getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }
    
    @Override
    public void consumo() {
        JOptionPane.showMessageDialog(null, "Los taxis consumen 12 Galones de Gasolina Extra");
    }

    @Override
    public String toString() {
        return super.toString()+ "\n" + "Este es un taxi";
    }
    
}
