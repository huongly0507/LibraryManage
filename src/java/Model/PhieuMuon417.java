/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;
 
public class PhieuMuon417  implements Serializable{
    private int MaPhieuMuon;
    private String NgayIn;
    private String NgayMuon;
    private String NgayTra;
    private String TrangThai;
    
    public PhieuMuon417(){
        super();
    }

    public PhieuMuon417(String NgayIn, String NgayMuon, String NgayTra, String TrangThai) {
        super();
        this.NgayIn = NgayIn;
        this.NgayMuon = NgayMuon;
        this.NgayTra = NgayTra;
        this.TrangThai = TrangThai;
    }

    public int getMaPhieuMuon() {
        return MaPhieuMuon;
    }

    public void setMaPhieuMuon(int MaPhieuMuon) {
        this.MaPhieuMuon = MaPhieuMuon;
    }

    public String getNgayIn() {
        return NgayIn;
    }

    public void setNgayIn(String NgayIn) {
        this.NgayIn = NgayIn;
    }

    public String getNgayMuon() {
        return NgayMuon;
    }

    public void setNgayMuon(String NgayMuon) {
        this.NgayMuon = NgayMuon;
    }

    public String getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(String NgayTra) {
        this.NgayTra = NgayTra;
    }

    public String getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(String TrangThai) {
        this.TrangThai = TrangThai;
    }
    
    
    
  
}
