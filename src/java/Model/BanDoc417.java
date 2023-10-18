/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;
 
public class BanDoc417 implements Serializable{
    private int MaDocGia;
    private String TenDocGia;
    private int SoTheDocGia;
    private String SoDienThoai;
    private int SoLanMuon;
    private String GhiChu;
    
    public BanDoc417(){
        super();
    }

    public BanDoc417(String TenDocGia, int SoTheDocGia, String SoDienThoai, int SoLanMuon, String GhiChu) {
        super();
        this.TenDocGia = TenDocGia;
        this.SoTheDocGia = SoTheDocGia;
        this.SoDienThoai = SoDienThoai;
        this.SoLanMuon = SoLanMuon;
        this.GhiChu = GhiChu;
    }

    public int getMaDocGia() {
        return MaDocGia;
    }

    public void setMaDocGia(int MaDocGia) {
        this.MaDocGia = MaDocGia;
    }

    public String getTenDocGia() {
        return TenDocGia;
    }

    public void setTenDocGia(String TenDocGia) {
        this.TenDocGia = TenDocGia;
    }

    public int getSoTheDocGia() {
        return SoTheDocGia;
    }

    public void setSoTheDocGia(int SoTheDocGia) {
        this.SoTheDocGia = SoTheDocGia;
    }

    public String getSoDienThoai() {
        return SoDienThoai;
    }

    public void setSoDienThoai(String SoDienThoai) {
        this.SoDienThoai = SoDienThoai;
    }

    public int getSoLanMuon() {
        return SoLanMuon;
    }

    public void setSoLanMuon(int SoLanMuon) {
        this.SoLanMuon = SoLanMuon;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }
    
    

}