/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lat6_encapsulation;

/**
 *
 * CREATED 
 */
public class EncapsulationBuah {

    private String namaBuah;
    private String hargaBuah;
    private String warnaBuah;

    public EncapsulationBuah(String namaBuah, String hargaBuah, String warnaBuah) {
        this.namaBuah = namaBuah;
        this.hargaBuah = hargaBuah;
        this.warnaBuah = warnaBuah;
    }

    public void setNamaBuah(String namaBuah) {
        this.namaBuah = namaBuah;
    }

    public void setHargaBuah(String hargaBuah) {
        this.hargaBuah = hargaBuah;
    }

    public void setWarnaBuah(String warnaBuah) {
        this.warnaBuah = warnaBuah;
    }

    public String getNamaBuah() {
        return namaBuah;
    }

    public String getHargaBuah() {
        return hargaBuah;
    }

    public String getWarnaBuah() {
        return warnaBuah;
    }
}

