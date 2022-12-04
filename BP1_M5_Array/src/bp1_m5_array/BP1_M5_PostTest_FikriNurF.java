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
public class BP1_M5_PostTest_FikriNurF {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String mahasiswa[][];
       
        int jumlah;
        
        System.out.println("DATA NILAI MAHASISWA");
        System.out.println("SISTEM INFORMASI");
        System.out.println("FKOM - UNIKU");
        System.out.print("\nMasukan batas nilai : ");
        jumlah = Integer.parseInt(input.nextLine());
        mahasiswa = new String[jumlah][20];
        
        
        //deklarasi variaber array
        float rata2[] = new float[jumlah];
        double nAkhir[] = new double[jumlah];
        float n1[] = new float[jumlah];
        float n2[] = new float[jumlah];
        float n3[] = new float[jumlah];
        float tk[] = new float[jumlah];
        float uts[] = new float[jumlah];
        float quiz[] = new float[jumlah];
        float uas[] = new float[jumlah];
        
        
        //menginput data dari user
        for (int i = 0; i < jumlah; i++) {
            
            System.out.println("Data Mahasiswa ke- " + (i + 1));
            System.out.print("NIM : ");
            mahasiswa[i][0] = input.nextLine();
            System.out.print("Nama : ");
            mahasiswa[i][1] = input.nextLine();
            System.out.print("Jurusan : ");
            mahasiswa[i][2] = input.nextLine();
            System.out.print("Kelas : ");
            mahasiswa[i][3] = input.nextLine();
            System.out.print("Mata Kuliah : ");
            mahasiswa[i][4] = input.nextLine();
            System.out.print("Nilai Tugas Individu 1: ");
            n1[i] = Float.parseFloat(mahasiswa[i][5] = input.nextLine());
            System.out.print("Nilai Tugas Individu 2 : ");
            n2[i] = Float.parseFloat(mahasiswa[i][6] = input.nextLine());
            System.out.print("Nilai Tugas Individu 3 : ");
            n3[i] = Float.parseFloat(mahasiswa[i][7] = input.nextLine());
            System.out.print("Nilai Tugas Kelompok : ");
            tk[i] = Float.parseFloat(mahasiswa[i][8] = input.nextLine());
            System.out.print("Nilai Quiz : ");
            quiz[i] = Float.parseFloat(mahasiswa[i][9] = input.nextLine());
            System.out.print("Nilai UTS : ");
            uts[i] = Float.parseFloat(mahasiswa[i][10] = input.nextLine());
            System.out.print("Nilai UAS : ");
            uas[i] = Float.parseFloat(mahasiswa[i][11] = input.nextLine());
            
            
        }
        System.out.println("");
        System.out.println("");
        
        // menghitung rata rata dan nilai akhir
        for (int i = 0; i < jumlah; i++) {
            rata2[i] = (n1[i] + n2[i] + n3[i]) / 3;
            nAkhir[i] = ((rata2[i] + tk[i] + (2.5 * uts[i]) + (3.5 * uas[i]))/8);
        }
        
        
        //membuat tabel
        System.out.print("\nNo.\tNIM\t\t\tNama\t\t\tJurusan\t\t\tKelas\t\t\tMatkul\t\t\tNilai Akhit\n");
        for (int i = 0; i < jumlah; i++) {
            System.out.println((i + 1) + "\t" + mahasiswa[i][0] + "\t\t\t" + mahasiswa[i][1] + "\t\t\t" + 
            mahasiswa[i][2] + "\t\t\t" + mahasiswa[i][3] + "\t\t\t" + mahasiswa[i][4] + "\t\t\t" + nAkhir[i]);
        }
        
        
        //menampilkan nilai rata rata dari tugasmatakuliahh
        System.out.println("");
        for (int i = 0; i < jumlah; i++){
            System.out.println("Rata rata nilai matkul " + mahasiswa[i][4] + " Dari Mahasiswa Bernama "+ mahasiswa[i][1] + " adalah: " +rata2[i]);
            //System.out.println("Nilai Akhir dari mahasiswa ke " + (i + 1) + "adalah : " + nAkhir[i]);
            
        }
        
        }
    }
    

