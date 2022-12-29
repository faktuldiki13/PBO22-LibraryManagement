/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.AllObject;
import Controller.BukuController;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author faktul diki cahyono
 */
public class BukuGUI {
    private static BukuController Buku = new BukuController();
    JFrame LogReg = new JFrame();
    JLabel tambahbuku, top, admin;
    JTextField textkode,textnomor,textnomorr,textpilih,textbaru, textjudul,textjudulbaru, textpenerbit;
    JLabel labelkode,labelnomor,labelnomorr, labeljudul,labeljudulbaru, labelpenerbit;
    JButton tambah, hapus, edit, exit;
    
    JTable tabelbuku = new JTable();
    JScrollPane scrollstaff = new JScrollPane(tabelbuku);

    public BukuGUI() {
        
        LogReg.setSize(900, 600);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.YELLOW);
        top = new JLabel("PERPUSTAKAAN");
        top.setBounds(260, 30, 500, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);
        
//        admin = new JLabel("ADMIN");
//        admin.setBounds(310, 70, 500, 50);
//        admin.setFont(new Font("Times New Roman", Font.BOLD, 30));
//        LogReg.add(admin);
        scrollstaff.setBounds(270, 180, 370, 200);
        
//Daftar Buku
        tabelbuku.setModel(Buku.daftarbuk());
        LogReg.add(scrollstaff);
        
        tambahbuku = new JLabel("Daftar Buku");
        tambahbuku.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahbuku.setBounds(270, 110, 210, 100);
        LogReg.add(tambahbuku);
        
//Edit Buku       
        tambahbuku = new JLabel("Edit Buku");
        tambahbuku.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahbuku.setBounds(670, 110, 210, 100);
        LogReg.add(tambahbuku);
        
        labelnomorr = new JLabel("Masukkan No : ");
        labelnomorr.setBounds(670, 170, 200, 30);
        LogReg.add(labelnomorr);
        textnomorr = new JTextField();
        textnomorr.setBounds(670, 200, 200, 30);
        LogReg.add(textnomorr);
        
        labelnomorr = new JLabel("Menu Edit : ");
        labelnomorr.setBounds(670, 230, 200, 30);
        LogReg.add(labelnomorr);
        
        labelnomorr = new JLabel("1. Kode Buku     2. Judul Buku");
        labelnomorr.setBounds(670, 250, 200, 30);
        LogReg.add(labelnomorr);
        labelnomorr = new JLabel("3. Penerbit Buku");
        labelnomorr.setBounds(670, 270, 200, 30);
        LogReg.add(labelnomorr);
        
        labelnomorr = new JLabel("Masukkan Pilihan : ");
        labelnomorr.setBounds(670, 295, 200, 30);
        LogReg.add(labelnomorr);
        
        textpilih = new JTextField();
        textpilih.setBounds(670, 330, 200, 30);
        LogReg.add(textpilih);
        
        labelnomorr = new JLabel(" Masukkan Data Baru :");
        labelnomorr.setBounds(670, 360, 200, 30);
        LogReg.add(labelnomorr);
        
        textbaru = new JTextField();
        textbaru.setBounds(670, 390, 200, 30);
        LogReg.add(textbaru);
        
        edit = new JButton("Edit");
        edit.setBounds(670, 420, 100, 30);
        edit.setBackground(Color.RED);
        LogReg.add(edit);
        
//Hapus Buku       
        tambahbuku = new JLabel("Hapus Buku");
        tambahbuku.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahbuku.setBounds(270, 370, 210, 100);
        LogReg.add(tambahbuku);
        
        labelnomor = new JLabel("Masukkan No : ");
        labelnomor.setBounds(270, 430, 200, 30);
        LogReg.add(labelnomor);
        textnomor = new JTextField();
        textnomor.setBounds(270, 460, 200, 30);
        LogReg.add(textnomor);
        
        hapus = new JButton("Hapus");
        hapus.setBounds(490, 460, 100, 30);
        hapus.setBackground(Color.RED);
        LogReg.add(hapus);
        
        exit = new JButton("Keluar");
        exit.setBounds(370, 510, 100, 30);
        exit.setBackground(Color.RED);
        LogReg.add(exit);
        
//Tambah Buku
        tambahbuku = new JLabel("Tambah Buku");
        tambahbuku.setFont(new Font("Times New Roman", Font.BOLD, 20));
        tambahbuku.setBounds(30, 110, 210, 100);
        LogReg.add(tambahbuku);
        
        labelkode = new JLabel("Kode Buku");
        labelkode.setBounds(30, 170, 200, 30);
        LogReg.add(labelkode);
        textkode = new JTextField();
        textkode.setBounds(30, 200, 200, 30);
        LogReg.add(textkode);
        
        labeljudul = new JLabel("Judul Buku");
        labeljudul.setBounds(30, 230, 200, 30);
        LogReg.add(labeljudul);
        textjudul = new JTextField();
        textjudul.setBounds(30, 260, 200, 30);
        LogReg.add(textjudul);
        
        labelpenerbit = new JLabel("Penerbit Buku");
        labelpenerbit.setBounds(30, 290, 200, 30);
        LogReg.add(labelpenerbit);
        textpenerbit = new JTextField();
        textpenerbit.setBounds(30, 320, 200, 30);
        LogReg.add(textpenerbit);
        
        tambah = new JButton("Tambah");
        tambah.setBounds(30, 360, 100, 30);
        tambah.setBackground(Color.RED);
        LogReg.add(tambah);
        
        
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        tambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    String kode = textkode.getText();
                    String judul = textjudul.getText();
                    String penerbit = textpenerbit.getText();
                    Allobjcontrl.buku.tambahbuku(kode, judul, penerbit);
                    tabelbuku.setModel(Buku.daftarbuk());
                    JOptionPane.showMessageDialog(null, "Tambah Buku Sukses ", "information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format Penulisan Salah", "Tambah Buku Gagal", JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
        
        edit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    
                    String kode = textbaru.getText();
                    String judul = textbaru.getText();
                    String penerbit = textbaru.getText();
//                //int index = AllObjectModel07220.daftarprakModel.cekData(npm, pass);
//                Allobjctrl07220.admin.updateIsVerified(index, Allobjctrl07220.Praktikan.showDaftarprak(index).getPraktikan());
                        int nomorr = Integer.parseInt(textnomorr.getText());
                        String data = textbaru.getText();
                        int pilih = Integer.parseInt(textpilih.getText());
                        switch (pilih) {
                            case 1:
                                Allobjcontrl.buku.editbuku(nomorr,1, data);
                                break;
                            case 2:
                                Allobjcontrl.buku.editbuku(nomorr,2, data);
                                break;
                            case 3:
                                Allobjcontrl.buku.editbuku(nomorr,3, data);
                                break;
                            default:
                        }

                        JOptionPane.showMessageDialog(null, " Data Berhasil Diedit ", "information", JOptionPane.INFORMATION_MESSAGE);
                        BukuGUI bugui = new BukuGUI();  
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(
                                null, "Nomor Tidak Ada", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
            }
            
        });
        
        hapus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                        int nomor = Integer.parseInt(textnomor.getText());
                        Allobjcontrl.buku.hapusbuku(nomor);

                        JOptionPane.showMessageDialog(null, " Data Berhasil Dihapus ", "information", JOptionPane.INFORMATION_MESSAGE);
                        BukuGUI bugui = new BukuGUI();  
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(
                                null, "Nomor Tidak Ada", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
            }
            
        });
        
        exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LogReg.dispose();
            }
        });
    }
    
    
    
    void kosong() {

        textkode.setText(null);
        textjudul.setText(null);
        textpenerbit.setText(null);
    }
    
}

