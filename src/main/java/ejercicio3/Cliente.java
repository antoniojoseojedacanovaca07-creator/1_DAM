/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Cliente {

    private String nombre;
    private String email;
    private ArrayList<String> telefonos;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
        this.telefonos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void addTelefono(String nuevcTelefono) {
        if (!this.telefonos.contains(nuevcTelefono)) {
            this.telefonos.add(nuevcTelefono);
        }
    }

    public String getTelefono(int indice) {
        if (indice < 0 || indice >= telefonos.size()) {
            return "";
        } else {
            return telefonos.get(indice);
        }
    }

    public ArrayList<String> buscarTelefono(String cadena) {
        // Aqui creamos la lista vacia que guarda coincidencias
        ArrayList<String> telefonosEncontrados = new ArrayList<>();

        for (String t : this.telefonos) {
            if (t.contains(cadena)) {
                telefonosEncontrados.add(t);
            }
        }
        return telefonosEncontrados;
    }
}
