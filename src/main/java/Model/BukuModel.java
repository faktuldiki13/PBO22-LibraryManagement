/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.BukuEntity;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author faktul diki cahyono
 */
public class BukuModel implements Inmodel{

    Scanner input = new Scanner(System.in);
  
    public ArrayList<BukuEntity> bukuEntityArrayList;

    public BukuModel() {
        bukuEntityArrayList = new ArrayList<BukuEntity>();
    }

    public void insertbuku(BukuEntity buku) {
        bukuEntityArrayList.add(buku);
    }
    
    public ArrayList<BukuEntity> getdaftarbukuarraylist(){
        return bukuEntityArrayList;
    }
    public ArrayList<BukuEntity>alldatabuk(){
        return bukuEntityArrayList;
    }
    
    public int size() {
        return bukuEntityArrayList.size();
    }

    @Override
    public void tampildaftar() {
        int nomor;
        for (BukuEntity bukuEntity : bukuEntityArrayList) {
            nomor = 1 + bukuEntityArrayList.indexOf(bukuEntity);
            System.out.println("========================================");
            System.out.println(nomor);
            System.out.println("Kode buku : " + bukuEntity.getKode());
            System.out.println("Judul buku : " + bukuEntity.getJudul());
            System.out.println("Penerbit buku : " + bukuEntity.getPenerbit());
            System.out.println("========================================");
        }
    } 
    
    public int search (int index)
    {
        if (index < this.bukuEntityArrayList.size())
            return index;
        else
            return -1;
    }


    public void update(int index, int pilih,String data)
    {

        if (search(index)==-1)
        {

            System.out.println("data tidak ditemukan");
        }
        else
        {
//            int pilih = 0;
//            String pilihan;
//            do{
//            System.out.println("Menu Edit");
//            System.out.println("1.Edit Kode Buku");
//            System.out.println("2.Edit Nama Buku");
//            System.out.println("3.Edit Penerbit Buku");
//            System.out.println("4.Exit");
//            System.out.println("Masukkan pilihan : ");
//            pilih = input.nextInt();
//            input.nextLine();
            switch (pilih) {
                case 1:
//                    System.out.print("Masukkan Kode Buku Baru : ");
//                    String kode = input.nextLine();
//                    input.nextLine();
                    bukuEntityArrayList.get(index).setKode(data);
                    break;
                case 2:
//                    System.out.print("Masukkan judul Baru: ");
//                    String judul = input.nextLine();
                    bukuEntityArrayList.get(index).setJudul(data);
                    break;
                case 3:
//                    System.out.print("Masukkan penerbit Baru: ");
//                    String penerbit = input.nextLine();
                    bukuEntityArrayList.get(index).setPenerbit(data);
                    break;
                default:
            }
//            System.out.println("berhasil update");
//            System.out.print("Apakah ingin edit lagi [y/t] : ");
//            pilihan = input.nextLine();
//            }while (pilihan.equals("y"));
        }
    }

    public void delete(int index)
    {
        if (search(index)==-1)
        {
//            System.out.println("data tidak ditemukan");
        }
        if (index == -1)
        {
//            System.out.println("data tidak ditemukan");
        }
        else
        {
            bukuEntityArrayList.remove(index);
//            System.out.println("berhasil dihapus");
        }
    }
}
