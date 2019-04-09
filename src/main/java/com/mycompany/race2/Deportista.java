/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.race2;

/**
 *
 * @author Alexander Martinez
 */
public class Deportista {
     /*
     Esta variable almacena el nemobre del deportista.
     */

    private String nombreDeportista;
    /*
     Esta variable almacena los pasos de cada deportist dentro de la carrera.
     */
    private int pasos;
    /*
     esta variable indica el punto de partida del deportista.
     */
    private int puntoPartida;

    public String getNombreDeportista() {
        return nombreDeportista;
    }

    public void setNombreDeportista(String nombreDeportista) {
        this.nombreDeportista = nombreDeportista;
    }

    public int getPasos() {
        return pasos;
    }

    public void setPasos(int pasos) {
        this.pasos = pasos;
    }

    public int getPuntoPartida() {
        return puntoPartida;
    }

    public void setPuntoPartida(int puntoPartida) {
        this.puntoPartida = puntoPartida;
    }

    public Deportista(String nombreDeportista, int pasos, int puntoPartida) {
        this.nombreDeportista = nombreDeportista;
        this.pasos = pasos;
        this.puntoPartida = puntoPartida;
    }

    
}
