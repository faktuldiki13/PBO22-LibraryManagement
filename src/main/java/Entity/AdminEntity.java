/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author faktul diki cahyono
 */
public class AdminEntity {
    
    private String kodeStaff;
    private String passwordAdmin;
    private String namaAdmin;

    public AdminEntity() {
    }

    public AdminEntity(String kodeStaff, String passwordAdmin, String namaAdmin) {
        this.kodeStaff = kodeStaff;
        this.passwordAdmin = passwordAdmin;
        this.namaAdmin = namaAdmin;
    }

    public String getKodeStaff() {
        return kodeStaff;
    }

    public void setKodeStaff(String kodeStaff) {
        this.kodeStaff = kodeStaff;
    }

    public String getPasswordAdmin() {
        return passwordAdmin;
    }

    public void setPasswordAdmin(String passwordAdmin) {
        this.passwordAdmin = passwordAdmin;
    }

    public String getNamaAdmin() {
        return namaAdmin;
    }

    public void setNamaAdmin(String namaAdmin) {
        this.namaAdmin = namaAdmin;
    }

}
