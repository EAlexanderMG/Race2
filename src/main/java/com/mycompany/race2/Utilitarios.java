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
public class Utilitarios {

    public int numero;

    public int random() {

        numero = (int) (Math.random() * 3) + 1;
        return numero;
    }
}
