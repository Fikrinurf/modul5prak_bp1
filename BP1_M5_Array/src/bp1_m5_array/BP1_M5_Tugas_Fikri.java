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
public class BP1_M5_Tugas_Fikri {
    public static void main(String[] args) {
        System.out.println("============DATA KARYAWAN============");
        Scanner input = new Scanner(System.in);
        String dataKaryawan[][];
        
        int jmlData;
        System.out.print("Masukan berapa data yang anda inputkan: ");
        jmlData = Integer.parseInt(input.nextLine());
        dataKaryawan = new String[jmlData][30];
        
        //menginput data dari user
        for (int i = 0; i < jmlData; i++) {
            System.out.println("Data Karyawan ke- " + (i + 1));
            System.out.print("Masukan NIK karyawan ke-" + (i+1) + " : ");
            dataKaryawan[i][0] = input.nextLine();
            System.out.print("Masukan Nama karyawan ke-" + (i+1) + " : ");
            dataKaryawan[i][1] = input.nextLine();
            System.out.print("Masukan Alamat Karyawan ke-" + (i+1) + " : ");
            dataKaryawan[i][2] = input.nextLine();
            System.out.print("Masukan nominal Gaji karyawan ke-" + (i+1) + " : ");
            dataKaryawan[i][5] = input.nextLine();
            System.out.println("\n\n");
            System.out.println("====================================");
        }
        
        System.out.println("\n\n\n");
        
        //untuk menentukan golongan dan jabatan karyawan dengan kondisi sesuai inputan gaji dengan menggunakan looping dan didalamnya juga berisikan kondisi if else
        for (int i = 0; i < jmlData; i++) {
            if(dataKaryawan[i][5].equals("2000000") || dataKaryawan[i][5].equals("3000000")){
                dataKaryawan[i][3] = "1";
                dataKaryawan[i][4] = "Ass. Manager";
            }else if (dataKaryawan[i][5].equals("3500000") || dataKaryawan[i][5].equals("4500000")){
                dataKaryawan[i][3] = "2";
                dataKaryawan[i][4] = "Manager";
            }
        }
        System.out.println("============Data Slip Gaji Karyawan===============");
        //menyusun data yang telah diinputkan menjadi berbentuk tabel
        System.out.print("\nNIK\t\tNama\t\tAlamat\t\tGolongan\t\tJabatan\t\tGaji\n");
        for (int i = 0; i < jmlData; i++){
            System.out.println(dataKaryawan[i][0] + "\t\t" + dataKaryawan[i][1] + "\t\t" + dataKaryawan[i][2] + "\t\t" + dataKaryawan[i][3] + "\t\t" + dataKaryawan[i][4] + "\t\t" 
            + dataKaryawan[i][5]);
        }
        
    }
    
}
