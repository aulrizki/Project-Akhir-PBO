package BACKEND;

/**
 * Class CetakTiket here.
 * @author OP WARNET 
 * @version 1.0 27/12/2020
 * Aulriz (1908107010033)
 * dapss43 (1908107010077)
 * piiss (1908107010078)
 * eddss (1908107010065)
 * Yann (1908107010075)
 * Sirr (1908107010079)
 */
public class CetakTiket
{
    private String nama, kelas, maskapai, tujuan, tglBer, jam;
    private int harga;

    public CetakTiket(String nama, String kelas, String maskapai, String tujuan, String tglBer, String jam, int harga)
    {
        this.nama = nama;
        this.kelas = kelas;
        this.maskapai = maskapai;
        this.tujuan = tujuan;
        this.tglBer = tglBer;
        this.jam = jam;
        this.harga = harga;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public String getNama() 
    {
        return nama;
    }
    public String getKelas() 
    {
        return kelas;
    }
    public String getMaskapai() 
    {
        return maskapai;
    }
    public String getTujuan() 
    {
        return tujuan;
    }
    public String getTglBer() 
    {
        return tglBer;
    }
    public String getJam() 
    {
        return jam;
    }
}