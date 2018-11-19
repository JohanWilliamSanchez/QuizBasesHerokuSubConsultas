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
public class Curso {
    private int cod, codProfe;
    private String nombre;

    public Curso(int cod, int codProfe, String nombre) {
        this.cod = cod;
        this.codProfe = codProfe;
        this.nombre = nombre;
    }

    public Curso() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public int getCodProfe() {
        return codProfe;
    }

    public void setCodProfe(int codProfe) {
        this.codProfe = codProfe;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
