package main;

public class Avatar {
    
    private String nev;
    private String torzs;
    private String fegyver;
    private int magassag;
    private int eletEro;
    private int sebzes;

    public Avatar(String nev, String torzs, String fegyver, int magassag, int eletEro, int sebzes) {
        this.nev = nev;
        this.torzs = torzs;
        this.fegyver = fegyver;
        this.magassag = magassag;
        this.eletEro = eletEro;
        this.sebzes = sebzes;
    }
    
    public String getNev() {
        return nev;
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
    
    public int getSebzes() {
        return sebzes;
    }

    public void setEletEro(int eletEro) {
        this.eletEro = eletEro >= 0 ? eletEro : 100;
    }

    public void setMagassag(int magassag) {
        this.magassag = magassag >= 0 ? magassag : 270;
    }

    public String allapot() {
        String allapot = "Avatar: " + nev + "\n\tTörzse: " + torzs + "\n\tFegyvere: " + fegyver + "\n\tMagassága: " + magassag + "cm"+ "\n\tÉleterő: "+ eletEro +"\n";
        return allapot;
    }
    
     public boolean egyforma(Avatar masik) {
        return this.nev == masik.nev;
    }
    
    public int harc(Avatar masik){
        return (masik.eletEro - this.sebzes); 
    }

}//class
