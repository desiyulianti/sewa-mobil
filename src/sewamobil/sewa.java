/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sewamobil;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class sewa{

      public static void roda4() {
        Scanner input = new Scanner(System.in);// Scanner baru
        //output
        System.out.println("Tempat penyewaan mobil");
        System.out.println("=====================");
        System.out.println("Pilihan mobil :");
        System.out.println("1. Xenia");
        System.out.println("2. Avanza");
        System.out.println("3. Agya");
        System.out.print("Masukkan pilihan anda :");
        int pilihan1 = input.nextInt();
        //percabangan
        switch (pilihan1) {
            case 1:
                sewa Xenia = new sewa();
                System.out.print(pilihan1);
                break;
            case 2:
                sewa Avanza = new sewa();
                System.out.print(pilihan1);
                break;
            case 3:
                sewa Agya = new sewa();
                System.out.print(pilihan1);
                break;
        }
    }

    public static void tampilroda4() {//pesan
        System.out.println("Terimakasih karena telah meyewa mobil di tempat kami");
    }
    
    
}
