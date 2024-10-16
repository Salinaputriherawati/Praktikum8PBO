/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum.pkg8;

/**
 *
 * @author 62898
 */
import java.util.Scanner;

public class TokoSerbaAda {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] kodeBarang = {"001", "002", "003", "004", "005"};
        String[] namaBarang = {"Pulpen", "Buku", "Pensil", "Spidol", "Penghapus"};
        int[] hargaBarang = {5000, 7000, 4000, 10000, 2000};

        int[] jumlahBeli = new int[5];
        int[] jumlahBayar = new int[5];

        System.out.println("TOKO SERBA ADA");
        System.out.println("**************");

        System.out.print("Masukkan Item Barang : ");
        int jumlahItem = input.nextInt(); 

        for (int i = 0; i < jumlahItem; i++) {
            System.out.println("Data ke " + (i + 1));

            System.out.print("Masukkan Kode Barang: ");
            String kode = input.next();
            
            System.out.print("Masukkan jumlah Beli : ");
            int beli = input.nextInt();
            
            for (int j = 0; j < kodeBarang.length; j++) {
                if (kodeBarang[j].equals(kode)) {
                    jumlahBeli[j] = beli;
                    jumlahBayar[j] = hargaBarang[j] * beli;
                }
            }
        }

        System.out.println("\nTOKO SERBA ADA");
        System.out.println("****************");
        System.out.println("No  Kode Barang   Nama Barang  Harga  Jumlah Beli  Jumlah Bayar");
        System.out.println("===============================================================");
        
        int totalBayar = 0;
        int no = 1;
        for (int i = 0; i < kodeBarang.length; i++) {
            if (jumlahBeli[i] > 0) {
                System.out.printf("%-6d%-13s%-12s%-11d%-13d%-14d\n", 
                        no, kodeBarang[i], namaBarang[i], hargaBarang[i], jumlahBeli[i], jumlahBayar[i]);
                no++;
                totalBayar += jumlahBayar[i];
            }
        }
        
        System.out.println("===============================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t" + totalBayar);
        System.out.println("===============================================================");
    }
}