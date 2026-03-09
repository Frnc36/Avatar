package main;

import java.util.Random;

public class Avatar {
    
    private String nev;
    private String torzs;
    private String fegyver;
    private int magassag;
    private int eletEro;

    public Avatar(String nev, String torzs, String fegyver, int magassag, int eletEro) {
        this.nev = nev;
        this.torzs = torzs;
        this.fegyver = fegyver;
        this.magassag = magassag;
        this.eletEro = eletEro;
    }

    public String getTorzs() {
        return torzs;
    }

    public String getFegyver() {
        return fegyver;
    }

    public int getMagassag() {
        return magassag;
    }

    public int getEletEro() {
        return eletEro;
    }

    public void setEletEro(int eletEro) {
        this.eletEro = eletEro >= 0 ? eletEro : 10;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag >= 0 ? magassag : 270;
    }

    public String allapot() {
        String allapot = "Az Avatarod: " + nev + "\nTörzse: " + torzs + "\nFegyvere: " + fegyver + "\nMagassága: " + magassag + "cm";
        return allapot;
    }

}//class
