/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

/**
 *
 * @author Labing
 */
public class Estudiante {
    private int codEst, codEscu;
    private String nombre, beca;

    public Estudiante(int codEst, int codEscu, String nombre, String beca) {
        this.codEst = codEst;
        this.codEscu = codEscu;
        this.nombre = nombre;
        this.beca = beca;
    }

    public Estudiante() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodEst() {
        return codEst;
    }

    public void setCodEst(int codEst) {
        this.codEst = codEst;
    }

    public int getCodEscu() {
        return codEscu;
    }

    public void setCodEscu(int codEscu) {
        this.codEscu = codEscu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getBeca() {
        return beca;
    }

    public void setBeca(String beca) {
        this.beca = beca;
    }
    
}
