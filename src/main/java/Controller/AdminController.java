/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Entity.AdminEntity;

public class AdminController implements Incontroller{
    int indexLogin = 0;
    
    public AdminController() {    
    }
    
    @Override
    public void dataAdmin() {
        String kodeStaff[] = {"01", "02"};
        String passwordAdmin[] = {"01", "02"};
        String namaAdmin[] = {"Jecky", "Sincan"};
        for(int i = 0; i < kodeStaff.length; i++) {
            AllObject.adminmodel.insertAdmin(new AdminEntity(kodeStaff[i], passwordAdmin[i], namaAdmin[i]));
        }
    }
    
    public void login(String kodeStaff, String passwordAdmin) {
        indexLogin = AllObject.adminmodel.cekData(kodeStaff, passwordAdmin);
    }

    public AdminEntity adminEntity() {
        return AllObject.adminmodel.showDataAdmin(indexLogin);
    }

}
