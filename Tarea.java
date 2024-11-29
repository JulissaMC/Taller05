/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.creaciondetareas;

import java.time.LocalDate;

/**
 *
 * @author Pc
 */
public abstract class Tarea {
    private String título;
    private String Detalles;
    private int gradoPrioridad;
    private LocalDate fechaVencimiento;
    private String estádo;

    public Tarea(String título, String Detalles, int gradoPrioridad, LocalDate fechaVencimiento, String estádo) {
        this.título = título;
        this.Detalles = Detalles;
        this.gradoPrioridad = gradoPrioridad;
        this.fechaVencimiento = fechaVencimiento;
        this.estádo = estádo;
    }

    
    
    
    
    
    
    
    
    
    
    
    public int getGradoPrioridad() {
        return gradoPrioridad;
    }

    public void setGradoPrioridad(int gradoPrioridad) {
        this.gradoPrioridad = gradoPrioridad;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDetalles() {
        return Detalles;
    }

    public void setDetalles(String Detalles) {
        this.Detalles = Detalles;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEstádo() {
        return estádo;
    }

    public void setEstádo(String estádo) {
        this.estádo = estádo;
    }
    
    
    
    
}
