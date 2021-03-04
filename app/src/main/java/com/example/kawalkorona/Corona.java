package com.example.kawalkorona;

import java.io.Serializable;

public class Corona implements Serializable {
    private int FID;
    private int Kode_Provi;
    private String Provinsi;
    private int Kasus_Posi;
    private int Kasus_Semb;
    private int Kasus_Meni;

    public Corona(int FID, int kode_Provi, String provinsi, int kasus_Posi, int kasus_Semb, int kasus_Meni) {
        this.FID = FID;
        Kode_Provi = kode_Provi;
        Provinsi = provinsi;
        Kasus_Posi = kasus_Posi;
        Kasus_Semb = kasus_Semb;
        Kasus_Meni = kasus_Meni;
    }

    public int getFID() {
        return FID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public int getKode_Provi() {
        return Kode_Provi;
    }

    public void setKode_Provi(int kode_Provi) {
        Kode_Provi = kode_Provi;
    }

    public String getProvinsi() {
        return Provinsi;
    }

    public void setProvinsi(String provinsi) {
        Provinsi = provinsi;
    }

    public int getKasus_Posi() {
        return Kasus_Posi;
    }

    public void setKasus_Posi(int kasus_Posi) {
        Kasus_Posi = kasus_Posi;
    }

    public int getKasus_Semb() {
        return Kasus_Semb;
    }

    public void setKasus_Semb(int kasus_Semb) {
        Kasus_Semb = kasus_Semb;
    }

    public int getKasus_Meni() {
        return Kasus_Meni;
    }

    public void setKasus_Meni(int kasus_Meni) {
        Kasus_Meni = kasus_Meni;
    }
}
