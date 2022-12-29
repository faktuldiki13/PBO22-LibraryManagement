/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class LoginGUI {
    
    JFrame LogReg = new JFrame();
    JLabel login,top;
    JTextField textkodeadminlogin;
    JLabel labelkodeadminlogin, labelpasswordlogin;
    JButton masuk;
    JPasswordField passwordlogin;

    public LoginGUI() {
        
        LogReg.setSize(500, 500);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(Color.YELLOW);
        top = new JLabel("PERPUSTAKAAN");
        top.setBounds(90, 50, 500, 50);
        top.setFont(new Font("Times New Roman", Font.BOLD, 40));
        LogReg.add(top);
        login = new JLabel("LOGIN");
        login.setBounds(190, 130, 500, 50);
        login.setFont(new Font("Times New Roman", Font.BOLD, 30));
        LogReg.add(login);

   
        labelkodeadminlogin = new JLabel("Kode Admin");
        labelkodeadminlogin.setBounds(200, 188, 300, 30);
        labelkodeadminlogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
        LogReg.add(labelkodeadminlogin);
        
        textkodeadminlogin = new JTextField();
        textkodeadminlogin.setBounds(105, 210, 280, 30);
        LogReg.add(textkodeadminlogin);
        
        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(215, 255, 100, 30);
        labelpasswordlogin.setFont(new Font("Times New Roman", Font.BOLD, 15));
        LogReg.add(labelpasswordlogin);
        
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(105, 279, 280, 30);
        LogReg.add(passwordlogin);
        
        masuk = new JButton("MASUK");
        masuk.setBounds(200, 320, 80, 30);
        masuk.setBackground(Color.RED);
        LogReg.add(masuk);
        
        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);
        
        masuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                        Allobjcontrl.admin.dataAdmin();
                        Allobjcontrl.admin.login(textkodeadminlogin.getText(), passwordlogin.getText());
                        String nama = Allobjcontrl.admin.adminEntity().getNamaAdmin();
                        JOptionPane.showMessageDialog(null, "selamat datang " + nama, "information", JOptionPane.INFORMATION_MESSAGE);
                        BukuGUI bugui = new BukuGUI();
                        LogReg.dispose();
                    } catch (Exception exception) {
                        JOptionPane.showMessageDialog(
                                null, "Kode atau password salah", "information", JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                    }
            }
        });
    }
    
    void kosong() {

        textkodeadminlogin.setText(null);
        passwordlogin.setText(null);
    }
    
}

