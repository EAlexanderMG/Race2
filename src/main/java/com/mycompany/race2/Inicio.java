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
public class Inicio {

    public void comienzo() {

        Deportista D1 = new Deportista("Juan", 0, 1);
        Deportista D2 = new Deportista("Luis", 33, 2);
        Deportista D3 = new Deportista("Albert", 66, 3);
        Deportista D4 = new Deportista("Sergio", 0, 1);
        Deportista D5 = new Deportista("Camilo", 33, 2);
        Deportista D6 = new Deportista("Yesid", 66, 3);
        Deportista D7 = new Deportista("Leo", 0, 1);
        Deportista D8 = new Deportista("Cristian", 33, 2);
        Deportista D9 = new Deportista("Martin", 66, 3);

        HiloDeportista HD1 = new HiloDeportista(D1);
        HiloDeportista HD2 = new HiloDeportista(D2);
        HiloDeportista HD3 = new HiloDeportista(D3);
        HiloDeportista HD4 = new HiloDeportista(D4);
        HiloDeportista HD5 = new HiloDeportista(D5);
        HiloDeportista HD6 = new HiloDeportista(D6);
        HiloDeportista HD7 = new HiloDeportista(D7);
        HiloDeportista HD8 = new HiloDeportista(D8);
        HiloDeportista HD9 = new HiloDeportista(D9);
        
        HD1.start();
        HD2.start();
        HD3.start();
    }

}
