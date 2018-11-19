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
public class Profesor {
    private int codProfe;
    private String nombre, apellido;

    public Profesor(int codProfe, String nombre, String apellido) {
        this.codProfe = codProfe;
        this.nombre = nombre;
        this.apellido = apellido;
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

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
}
