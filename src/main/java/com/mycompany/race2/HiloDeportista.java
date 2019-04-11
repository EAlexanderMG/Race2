/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.race2;

import static java.lang.Thread.currentThread;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexander Martinez
 */
public class HiloDeportista extends Thread {

    private Deportista deportista;

    private int pasost;

    public HiloDeportista(Deportista deportista) {
        this.deportista = deportista;
    }

    public Deportista getDeportista() {
        return deportista;
    }

    public void setDeportista(Deportista deportista) {
        this.deportista = deportista;
    }

    public int getPasost() {
        return pasost;
    }

    public void setPasost(int pasost) {
        this.pasost = pasost;
    }

    @Override
     public void run() {

        while (pasost < 100) {

            if (deportista.getPasos() > pasost) {
                synchronized (deportista) {
                    try {
                        System.out.println("El jugador " + deportista.getNombreDeportista() + " esperando");
                        deportista.wait();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Deportista.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            if (deportista.getPuntoPartida() == 1) {

                while (deportista.getPasos() < 33 && pasost < 33) {
                    Utilitarios uti = new Utilitarios();

                    int numero = uti.random();
                    deportista.setPasos(deportista.getPasos() + numero);
                    setPasost(pasost + numero);

                    if (deportista.getPasos() >= 33) {
                        deportista.setPasos(33);
                    }
                    System.out.println("El jugador " + deportista.getNombreDeportista() + " va en la posicion" + deportista.getPasos());

                }
                synchronized (deportista) {
                    deportista.notifyAll();
                }

            }

        }
        if (deportista.getPasos() >= pasost) {
            synchronized (deportista) {
                try {
                    System.out.println("El jugador " + deportista.getNombreDeportista() + " esperando");
                    deportista.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Deportista.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        if (deportista.getPuntoPartida() == 2 && pasost < 66) {

            while (deportista.getPasos() < 66) {
                Utilitarios uti = new Utilitarios();
                synchronized (deportista) {
                    int numero = uti.random();
                    deportista.setPasos(deportista.getPasos() + numero);
                    pasost = pasost + numero;

                    if (deportista.getPasos() >= 66) {
                        deportista.setPasos(66);
                    }
                    System.out.println("El jugador " + deportista.getNombreDeportista() + " va en la posicion" + deportista.getPasos());
                    deportista.notifyAll();
                }

            }

        }
        if (deportista.getPasos() > pasost) {
            synchronized (deportista) {
                try {
                    System.out.println("El jugador " + deportista.getNombreDeportista() + " esperando");
                    deportista.wait();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Deportista.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (deportista.getPuntoPartida() == 3 && pasost >= 66 && pasost < 100) {

                while (deportista.getPasos() < 100) {
                    Utilitarios uti = new Utilitarios();
                    synchronized (deportista) {
                        int numero = uti.random();
                        deportista.setPasos(deportista.getPasos() + numero);
                        pasost = pasost + numero;
                        if (deportista.getPasos() >= 100) {
                            deportista.setPasos(100);
                        }
                        System.out.println("El jugador " + deportista.getNombreDeportista() + " va en la posicion" + deportista.getPasos());
                        deportista.notifyAll();
                    }
                }

            }

        }

        System.out.println("termino el jugador" + deportista.getNombreDeportista());
    }
}




