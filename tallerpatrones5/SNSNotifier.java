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
public class SNSNotifier extends CentroDeControlNotis {
    
    public SNSNotifier(List<Suscritos> usuarios, Tarea tarea) {
        super(usuarios, tarea);
    }
    @Override
    public void notificar(List<Suscritos> usuarios, Tarea tarea) {
        if(tarea.getEstado()== "Completa" || tarea.getEstado == "A completar"){
             //logica del mensaje
            System.out.println("Por SNS")://etc..

        }// o 0 siendo a completar y 1 completa, depende como pongan la parte de tarea
    }
}
