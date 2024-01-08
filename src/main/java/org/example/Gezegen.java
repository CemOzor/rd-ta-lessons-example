package org.example;

    public enum Gezegen {
    MERCURY(1, "Merkür", 57.9, 2439.7, 58.6),
    VENUS(2, "Venüs", 108.2, 6051.8, 243),
    EARTH(3, "Dünya", 149.6, 6371, 24),
    MARS(4, "Mars", 227.9, 3389.5, 24.7),
    JUPITER(5, "Jüpiter", 778.3, 69911, 9.9),
    SATURN(6, "Satürn", 1427.0, 58232, 10.7),
    URANUS(7, "Uranüs", 2871.0, 25362, 17.2),
    NEPTUNE(8, "Neptün", 4497.1, 24622, 16.1);

    private final int siraNumarasi;
    private final String isim;
    private final double uzaklik;
    private final double yaricap;
    private final double donmeSuresi;

    Gezegen(int siraNumarasi, String isim, double uzaklik, double yaricap, double donmeSuresi) {
        this.siraNumarasi = siraNumarasi;
        this.isim = isim;
        this.uzaklik = uzaklik;
        this.yaricap = yaricap;
        this.donmeSuresi = donmeSuresi;
    }

    public int getSiraNumarasi() {
        return siraNumarasi;
    }

    public String getIsim() {
        return isim;
    }

    public double getUzaklik() {
        return uzaklik;
    }

    public double getYaricap() {
        return yaricap;
    }

    public double getDonmeSuresi() {
        return donmeSuresi;
    }

}
