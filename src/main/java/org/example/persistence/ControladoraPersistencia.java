/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.example.persistence;

import org.example.logica.Duenio;
import org.example.logica.Mascota;

/**
 *
 * @author Cesar
 */
public class ControladoraPersistencia {
    DuenioJpaController dueniojpa = new DuenioJpaController();
    MascotaJpaController mascotajpa = new MascotaJpaController();
    
    public void guardar(Duenio duenio, Mascota masco){
    
        dueniojpa.create(duenio);
        mascotajpa.create(masco);
    }
}
