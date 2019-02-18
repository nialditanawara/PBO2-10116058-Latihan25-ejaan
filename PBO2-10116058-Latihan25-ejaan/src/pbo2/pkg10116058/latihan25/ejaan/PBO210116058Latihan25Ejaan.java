/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10116058.latihan25.ejaan;

import java.util.Scanner;

/**
 *
 * @author xider
 * NAMA : Alfan Wahyudi 
 * KELAS : PBO3 
 * NIM : 10117118 
 * Deskripsi Program : Program ini berisi program untuk melakukan ejaan nama
 */
public class PBO210116058Latihan25Ejaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nama;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama depan anda untuk di eja : ");
        nama = scanner.next();

        int len = nama.length();
        char[] arrChar = new char[len];

        for (int no = 0; no <= len - 1; no++) {
            arrChar[no] = nama.charAt(no);
            System.out.println("Huruf ke-" + (no + 1) + " : " + arrChar[no]);
        }
    }

}