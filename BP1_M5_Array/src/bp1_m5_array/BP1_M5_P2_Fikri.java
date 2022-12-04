/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bp1_m5_array;

import java.util.Scanner;

/**
 *
 * @author fikri
 */
public class BP1_M5_P2_Fikri {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mahasiswa[][];
        int jumlah;
        System.out.println("DATA NILAI MAHASISWA");
        System.out.println("TEKNIK INFORMATIKA");
        System.out.println("FKOM - UNIKU");
        System.out.print("\nMasukan batas nilai : ");
        jumlah = Integer.parseInt(input.nextLine());
        mahasiswa = new String[jumlah][6];
        for (int i = 0; i < jumlah; i++) {
            
            System.out.println("Data Mahasiswa ke- " + (i + 1));
            System.out.print("NIK : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.print("Nama : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.print("Nilai : ");
            mahasiswa[i][2] = input.nextLine();
        }
        
        System.out.print("\nNo.\tNIK\t\tNama\t\t\tNilai\n");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t" + mahasiswa[i][0] + "\t\t" + mahasiswa[i][1] + "\t\t\t" + mahasiswa[i][2]);
        }
    }
}
