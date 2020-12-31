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
    
    public void isiMenu()
    {
        //CetakTiket cetakTiket = new CetakTiket(nama, kelas, maskapai, tujuan, tglBer, jam);
        System.out.println("Menu : ");
        System.out.println("1. Informasi Penerbangan");
        System.out.println("2. Pemesanan Tiket");
        System.out.println("3. Exit");
        System.out.print("Pilih Menu : ");
        int menu = in.nextInt();
        in.nextLine();
        
        if(menu == 1){
            System.out.println("Garuda Indonesia:");
            System.out.println("GA01 (Banda Aceh-Jakarta)");
            System.out.println("GA02 (Medan-Banda Aceh)");
            System.out.println();
            System.out.println("Lion Air");
            System.out.println("JT12 (Banda Aceh-Jakarta");
            System.out.println("JT09 (Medan-Padang");
            System.out.println();
            System.out.println("Sriwijaya Air");
            System.out.println("SJ22 (Padang-Bandung");
            System.out.println("SJ06 (Yogyakarta-Wamena");
            System.out.println();
            System.out.println("Batik Air");
            System.out.println("BT71 (Banda Aceh-Surabaya)");
            System.out.println("BT25 (Medan-Malang)");
            System.out.println();
            System.out.println("Spruce Goose :");
            System.out.println("SG69 (Banda Aceh-Sabang)");
            System.out.println("SG11 (Lhokseumawe-Banda Aceh)");
            System.out.println();
            System.out.print("Kembali Ke Menu? (y/n)");
            String pilih = in.next();
            if(pilih.equalsIgnoreCase("y")){
                isiMenu();
            }
        }else if(menu == 2){
            System.out.print("Nama :");
            nama = in.nextLine();
            System.out.print("Kelas :");
            kelas = in.nextLine();
            System.out.print("Maskapai :");
            maskapai = in.nextLine();
            System.out.print("Tujuan :");
            tujuan = in.nextLine();
            System.out.print("Tanggal Berangkat :");
            tglBer = in.nextLine();
            System.out.print("Jam Berangkat :");
            jam = in.nextLine();
            CetakTiket cetak1 = new CetakTiket(nama, kelas, maskapai, tujuan, tglBer, jam, harga);
            cetak(cetak1);
            
            if(tiket.get(0).getKelas().equalsIgnoreCase("Ekonomi")){
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Garuda")){
                    if(tiket.get(0).getTujuan().equalsIgnoreCase("Banda Aceh-Jakarta")){
                        System.out.println("No Penerbangan : GA01");
                        System.out.println("Harga : 2.400.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 2400000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                    }
                    if(tiket.get(0).getTujuan().equalsIgnoreCase("Medan-Banda Aceh")){
                        System.out.println("No Penerbangan : GA02");
                        System.out.println("Harga : 1.100.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa =  harga - 1100000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                    }
                }
                
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Lion Air")){
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Banda Aceh-Jakarta")){
                        System.out.println("No Penerbangan : JT12");
                        System.out.println("Harga : 1.200.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1200000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                   
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Medan-Padang")){
                        System.out.println("No Penerbangan : JT09");
                        System.out.println("Harga : 800.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 800000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                }
                
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Sriwijaya Air")){
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Padang-Bandung")){
                        System.out.println("No Penerbangan : SJ22");
                        System.out.println("Harga : 1.100.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1100000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                   
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Yogyakarta-Wamena")){
                        System.out.println("No Penerbangan : SJ06");
                        System.out.println("Harga : 1.300.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1300000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                }
                
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Batik Air")){
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Banda Aceh-Surabaya")){
                        System.out.println("No Penerbangan : BT71");
                        System.out.println("Harga : 1.600.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1600000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                   
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Medan-Malang")){
                        System.out.println("No Penerbangan : BT25");
                        System.out.println("Harga : 1.000.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1000000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                }
                
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Spruce Goose")){
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Banda Aceh-Sabang")){
                        System.out.println("No Penerbangan : SG69");
                        System.out.println("Harga : 250.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 250000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                   
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Lhokseumawe-Banda Aceh")){
                        System.out.println("No Penerbangan : SG11");
                        System.out.println("Harga : 300.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 300000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                }
            }else if(tiket.get(0).getKelas().equalsIgnoreCase("Bisnis")){
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Garuda")){
                    if(tiket.get(0).getTujuan().equalsIgnoreCase("Banda Aceh-Jakarta")){
                        System.out.println("No Penerbangan : GA01");
                        System.out.println("Harga : 3.400.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 3400000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                    }
                    
                    if(tiket.get(0).getTujuan().equalsIgnoreCase("Medan-Banda Aceh")){
                        System.out.println("No Penerbangan : GA02");
                        System.out.println("Harga : 1.600.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1600000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                    }
                }
                
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Lion Air")){
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Banda Aceh-Jakarta")){
                        System.out.println("No Penerbangan : JT12");
                        System.out.println("Harga : 1.700.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1700000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                   
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Medan-Padang")){
                        System.out.println("No Penerbangan : JT09");
                        System.out.println("Harga : 1.300.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1300000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                }
                
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Sriwijaya Air")){
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Padang-Bandung")){
                        System.out.println("No Penerbangan : SJ22");
                        System.out.println("Harga : 1.600.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1600000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                   
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Yogyakarta-Wamena")){
                        System.out.println("No Penerbangan : SJ06");
                        System.out.println("Harga : 1.800.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1800000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                }
                
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Batik Air")){
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Banda Aceh-Surabaya")){
                        System.out.println("No Penerbangan : BT71");
                        System.out.println("Harga : 2.100.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 2100000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                   
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Medan-Malang")){
                        System.out.println("No Penerbangan : BT25");
                        System.out.println("Harga : 1.500.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 1500000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                }
                
                if(tiket.get(0).getMaskapai().equalsIgnoreCase("Spruce Goose")){
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Banda Aceh-Sabang")){
                        System.out.println("No Penerbangan : SG69");
                        System.out.println("Harga : 750.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 750000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                   
                   if(tiket.get(0).getTujuan().equalsIgnoreCase("Lhokseumawe-Banda Aceh")){
                        System.out.println("No Penerbangan : SG11");
                        System.out.println("Harga : 800.000");
                        System.out.print("Input Harga : ");
                        int harga = in.nextInt();
                        int sisa = harga - 800000;
                        System.out.println();
                        if(sisa > 0){
                            System.out.println("Kembalian Anda : " + sisa);
                            System.out.println();
                        }
                   }
                }
            }
         
            System.out.println("Nama              : " + tiket.get(0).getNama());
            System.out.println("Kelas             : " + tiket.get(0).getKelas());
            System.out.println("Maskapai          : " + tiket.get(0).getMaskapai());
            System.out.println("Tujuan            : " + tiket.get(0).getTujuan());
            System.out.println("Tanggal Berangkat : " + tiket.get(0).getTglBer());
            System.out.println("Jam               : " + tiket.get(0).getJam());
        }else if(menu==3){
            System.exit(0);
        }
    }

    public void cetak(CetakTiket cetakTiket){
        tiket.add(cetakTiket);
    }
}
