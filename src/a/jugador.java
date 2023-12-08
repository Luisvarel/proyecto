/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.io.Serializable;

/**
 *
 * @author Luis Andres Varela
 */
public class jugador implements Serializable {

    private String Usuario;
    private String contrasena;
    private boolean[] noche = {false, false, false, false};
    private static final long SerialVersionUID = 555L;

    public jugador(String Usuario, String contrasena) {
        this.Usuario = Usuario;
        this.contrasena = contrasena;
    }

    public boolean[] getNoche() {
        return noche;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

}
