/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;
 
public class NhaCungCap417 implements Serializable{
    private int MaNCC;
    private String Ten;
    private int SoTaiLieuNhap;
    
    public NhaCungCap417(){
        super();
    }

    public NhaCungCap417(String Ten, int SoTaiLieuNhap) {
        super();
        this.Ten = Ten;
        this.SoTaiLieuNhap = SoTaiLieuNhap;
    }

    public int getMaNCC() {
        return MaNCC;
    }

    public void setMaNCC(int MaNCC) {
        this.MaNCC = MaNCC;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getSoTaiLieuNhap() {
        return SoTaiLieuNhap;
    }

    public void setSoTaiLieuNhap(int SoTaiLieuNhap) {
        this.SoTaiLieuNhap = SoTaiLieuNhap;
    } 
    
}
