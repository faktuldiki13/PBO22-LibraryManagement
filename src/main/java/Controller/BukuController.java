/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.BukuEntity;
import javax.swing.table.DefaultTableModel;

public class BukuController {

    public void tambahbuku(String kode, String judul, String penerbit) {
        AllObject.bukumodel.insertbuku(new BukuEntity(kode, judul, penerbit));
    }
    
    public void tampilkan(){
        AllObject.bukumodel.tampildaftar();
    }

    public void editbuku(int index, int pilih ,String data){
        AllObject.bukumodel.update(index-1,pilih,data);
    }
    
    public void hapusbuku(int index){
        AllObject.bukumodel.delete(index-1);
    }
    
    public DefaultTableModel daftarbuk(){
        DefaultTableModel dtmdaftarbuk = new DefaultTableModel();
        Object[] kolom ={"No","Kode Buku","Judul Buku","Penerbit Buku"};
        dtmdaftarbuk.setColumnIdentifiers(kolom);
        int size = AllObject.bukumodel.alldatabuk().size();
        for (int i=0;i<size;i++){
            
        Object [] data = new Object[4];
        data[0] = i+1;
        data[1] = AllObject.bukumodel.alldatabuk().get(i).getKode();
        data[2] = AllObject.bukumodel.alldatabuk().get(i).getJudul();
        data[3] = AllObject.bukumodel.alldatabuk().get(i).getPenerbit();

        dtmdaftarbuk.addRow(data);
        }
    return dtmdaftarbuk;
    }
}
