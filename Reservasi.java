package BACKEND 

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
/**
 * Class Reservasi here.
 * @author OP WARNET 
 * @version 1.0 27/12/2020
 * Aulriz (1908107010033)
 * dapss43 (1908107010077)
 * piiss (1908107010078)
 * eddss (1908107010065)
 * Yann (1908107010075)
 * Sirr (1908107010079)
 */

public class Reservasi
{
    ArrayList<CetakTiket> tiket;
    Scanner in = new Scanner(System.in);
    int harga = 0;
    String nama,kelas,maskapai,tujuan,tglBer,jam;
    
    public Reservasi()
    {
        tiket = new ArrayList<CetakTiket>();
    }
    
    public ArrayList<CetakTiket> Tiket(){
        return tiket;
    }

    public String TampilNoPenerbangan(String kelas, String maskapai, String tujuan){
        String nomorPenerbangan="";
        if(kelas.equals("Ekonomi")){
            if(maskapai.equals("Garuda Indonesia")){
                if(tujuan.equals("Banda Aceh-Jakarta")){
                    nomorPenerbangan = "GA01";
                    harga = 2400000;
                }
                else if(tujuan.equals("Banda Aceh-Medan")){
                    nomorPenerbangan = "GA02";
                    harga = 1100000;
                }
            }
            else if(maskapai.equals("Lion Air")){
                if(tujuan.equals("Banda Aceh-Jakarta")){
                    nomorPenerbangan = "JT12";
                    harga = 1200000;
                }
                else if(tujuan.equals("Medan-Padang")){
                    nomorPenerbangan = "JT09";
                    harga = 800000;
                }
            }
            if(maskapai.equals("Sriwijaya Air")){
                if(tujuan.equals("Padang-Bandung")){
                    nomorPenerbangan = "SJ22";
                    harga = 1100000;
                }
                else if(tujuan.equals("Medan-Padang")){
                    nomorPenerbangan = "SJ06";
                    harga = 1300000;
                }
            }
            if(maskapai.equals("Batik Air")){
                if(tujuan.equals("Banda Aceh-Surabaya")){
                    nomorPenerbangan = "BT71";
                    harga = 1600000;
                }
                else if(tujuan.equals("Medan-Malang")){
                    nomorPenerbangan = "BT25";
                    harga = 1000000;
                }
            }
            if(maskapai.equals("Spruce Goose")){
                if(tujuan.equals("Banda Aceh-Sabang")){
                    nomorPenerbangan = "SG69";
                    harga = 1300000;
                }
                else if(tujuan.equals("Lhokseumawe-Banda Aceh")){
                    nomorPenerbangan = "SG69";
                    harga = 300000;
                }
            }
        }
        else if(kelas.equals("Bisnis")){
            if(maskapai.equals("Garuda Indonesia")){
                if(tujuan.equals("Banda Aceh-Jakarta")){
                    nomorPenerbangan = "GA01";
                    harga = 3400000;
                }
                else if(tujuan.equals("Banda Aceh-Medan")){
                    nomorPenerbangan = "GA02";
                    harga = 1600000;
                }
            }
            else if(maskapai.equals("Lion Air")){
                if(tujuan.equals("Banda Aceh-Jakarta")){
                    nomorPenerbangan = "JT12";
                    harga = 1700000;
                }
                else if(tujuan.equals("Medan-Padang")){
                    nomorPenerbangan = "JT09";
                    harga = 1300000;
                }
            }
            if(maskapai.equals("Sriwijaya Air")){
                if(tujuan.equals("Padang-Bandung")){
                    nomorPenerbangan = "SJ22";
                    harga = 1600000;
                }
                else if(tujuan.equals("Medan-Padang")){
                    nomorPenerbangan = "SJ06";
                    harga = 1800000;
                }
            }
            if(maskapai.equals("Batik Air")){
                if(tujuan.equals("Banda Aceh-Surabaya")){
                    nomorPenerbangan = "BT71";
                    harga = 2100000;
                }
                else if(tujuan.equals("Medan-Malang")){
                    nomorPenerbangan = "BT25";
                    harga = 1500000;
                }
            }
            if(maskapai.equals("Spruce Goose")){
                if(tujuan.equals("Banda Aceh-Sabang")){
                    nomorPenerbangan = "SG69";
                    harga = 750000;
                }
                else if(tujuan.equals("Lhokseumawe-Banda Aceh")){
                    nomorPenerbangan = "SG69";
                    harga = 800000;
                }
            }
        }
        return nomorPenerbangan;
    }
    
    public int TampilHarga(String kelas, String maskapai, String tujuan){
        String nomorPenerbangan;
        if(kelas.equals("Ekonomi")){
            if(maskapai.equals("Garuda Indonesia")){
                if(tujuan.equals("Banda Aceh-Jakarta")){
                    nomorPenerbangan = "GA01";
                    harga = 2400000;
                }
                else if(tujuan.equals("Banda Aceh-Medan")){
                    nomorPenerbangan = "GA02";
                    harga = 1100000;
                }
            }
            else if(maskapai.equals("Lion Air")){
                if(tujuan.equals("Banda Aceh-Jakarta")){
                    nomorPenerbangan = "JT12";
                    harga = 1200000;
                }
                else if(tujuan.equals("Medan-Padang")){
                    nomorPenerbangan = "JT09";
                    harga = 800000;
                }
            }
            if(maskapai.equals("Sriwijaya Air")){
                if(tujuan.equals("Padang-Bandung")){
                    nomorPenerbangan = "SJ22";
                    harga = 1100000;
                }
                else if(tujuan.equals("Medan-Padang")){
                    nomorPenerbangan = "SJ06";
                    harga = 1300000;
                }
            }
            if(maskapai.equals("Batik Air")){
                if(tujuan.equals("Banda Aceh-Surabaya")){
                    nomorPenerbangan = "BT71";
                    harga = 1600000;
                }
                else if(tujuan.equals("Medan-Malang")){
                    nomorPenerbangan = "BT25";
                    harga = 1000000;
                }
            }
            if(maskapai.equals("Spruce Goose")){
                if(tujuan.equals("Banda Aceh-Sabang")){
                    nomorPenerbangan = "SG69";
                    harga = 1300000;
                }
                else if(tujuan.equals("Lhokseumawe-Banda Aceh")){
                    nomorPenerbangan = "SG69";
                    harga = 300000;
                }
            }
        }
        else if(kelas.equals("Bisnis")){
            if(maskapai.equals("Garuda Indonesia")){
                if(tujuan.equals("Banda Aceh-Jakarta")){
                    nomorPenerbangan = "GA01";
                    harga = 3400000;
                }
                else if(tujuan.equals("Banda Aceh-Medan")){
                    nomorPenerbangan = "GA02";
                    harga = 1600000;
                }
            }
            else if(maskapai.equals("Lion Air")){
                if(tujuan.equals("Banda Aceh-Jakarta")){
                    nomorPenerbangan = "JT12";
                    harga = 1700000;
                }
                else if(tujuan.equals("Medan-Padang")){
                    nomorPenerbangan = "JT09";
                    harga = 1300000;
                }
            }
            if(maskapai.equals("Sriwijaya Air")){
                if(tujuan.equals("Padang-Bandung")){
                    nomorPenerbangan = "SJ22";
                    harga = 1600000;
                }
                else if(tujuan.equals("Medan-Padang")){
                    nomorPenerbangan = "SJ06";
                    harga = 1800000;
                }
            }
            if(maskapai.equals("Batik Air")){
                if(tujuan.equals("Banda Aceh-Surabaya")){
                    nomorPenerbangan = "BT71";
                    harga = 2100000;
                }
                else if(tujuan.equals("Medan-Malang")){
                    nomorPenerbangan = "BT25";
                    harga = 1500000;
                }
            }
            if(maskapai.equals("Spruce Goose")){
                if(tujuan.equals("Banda Aceh-Sabang")){
                    nomorPenerbangan = "SG69";
                    harga = 750000;
                }
                else if(tujuan.equals("Lhokseumawe-Banda Aceh")){
                    nomorPenerbangan = "SG69";
                    harga = 800000;
                }
            }
        }
        return harga;
    }
    
    