/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

/**
 *
 * @author faktul diki cahyono
 */
public class StaffEntity extends PegawaiAbstractEntity{
    

    public StaffEntity(String kode, String password, String nama) {
        super(kode, password, nama);
    }
    
    @Override
    public String getKode() {
        return kode;
    }


    

}
