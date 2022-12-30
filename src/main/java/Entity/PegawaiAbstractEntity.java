/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
public abstract class PegawaiAbstractEntity {
    protected String kode, password, nama;

    public PegawaiAbstractEntity(String kode, String password, String nama) {
        this.kode = kode;
        this.password = password;
        this.nama = nama;
    }

    public abstract String getKode();

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKode(String kode) {
        this.kode = kode;
    }
    
    
}
