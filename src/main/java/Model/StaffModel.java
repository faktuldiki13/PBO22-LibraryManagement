/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Entity.StaffEntity;
import java.util.ArrayList;

public class StaffModel implements Inmodel{
    public ArrayList<StaffEntity> adminEntityArrayList;
    
    public StaffModel() {
        adminEntityArrayList = new ArrayList<StaffEntity>();
    }
    
    public void insertAdmin(StaffEntity admin) {
        adminEntityArrayList.add(admin);
    }
    
    @Override
    public void tampildaftar() {
        
        for (StaffEntity admin : adminEntityArrayList) {
            System.out.println("========================================");
            System.out.println("Nama : " + admin.getNama());
            System.out.println("Kode Admin : " + admin.getKode());
            System.out.println("========================================");
        }
    } 
    
    public int cekData(String kode, String passwordAdmin) {
        int loop = 0;
        for (StaffEntity adminentity : adminEntityArrayList) {
            if (adminentity.getKode().equals(kode) && adminentity.getPassword().equals(passwordAdmin)) {
                break;
            } else {
                loop++;
            }
        }
        return loop;
    }
    
    public StaffEntity showDataAdmin(int index) {
        return adminEntityArrayList.get(index);
    }
}
