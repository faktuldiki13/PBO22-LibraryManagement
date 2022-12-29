/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;
public abstract class KodeAbstractEntity {
    protected String kode;

    public KodeAbstractEntity(String kode) {
        this.kode = kode;
    }
    
    public abstract String getKode();
}
