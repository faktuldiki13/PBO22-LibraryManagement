/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.AdminEntity;
import java.util.ArrayList;

public class AdminModel implements Inmodel{
    public ArrayList<AdminEntity> adminEntityArrayList;
    
    public AdminModel() {
        adminEntityArrayList = new ArrayList<AdminEntity>();
    }
    
    public void insertAdmin(AdminEntity admin) {
        adminEntityArrayList.add(admin);
    }
    
    @Override
    public void tampildaftar() {
        
        for (AdminEntity admin : adminEntityArrayList) {
            System.out.println("========================================");
            System.out.println("Nama : " + admin.getNama());
            System.out.println("Kode Admin : " + admin.getKode());
            System.out.println("========================================");
        }
    } 
    
    public int cekData(String kode, String passwordAdmin) {
        int loop = 0;
        for (AdminEntity adminentity : adminEntityArrayList) {
            if (adminentity.getKode().equals(kode) && adminentity.getPassword().equals(passwordAdmin)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public AdminEntity showDataAdmin(int index) {
        return adminEntityArrayList.get(index);
    }
}
