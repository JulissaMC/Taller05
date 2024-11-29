/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tallerpatrones5;

import java.util.List;

/**
 *
 * @author Ayman El Salous Mnz
 */
public class CentroDeControlNotis { //como lo dice el nombre, es unc entro de control, por ende suscribirse y desuscribirse no rompe srp?
    private List<Suscritos> usuarios;
    private Tarea tarea;

    public CentroDeControlNotif(List<Suscritos> usuarios, Tarea tarea) {
        usuarios = usuarios;
        tarea = tarea;
    }

    public void notificar(List<Suscritos> usuario, Tarea tarea) {
        for (usuario suscriptor : usuarios) {
            suscriptor.actualizar(tarea);
        }
    }

    public void suscribirse(Suscritos usuario) {
        usuarios.add(usuario);
    }

    public void desuscribirse(Suscritos usuario) {
        usuarios.remove(usuario);
    }
   
}
