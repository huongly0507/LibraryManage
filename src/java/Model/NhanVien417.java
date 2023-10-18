/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.io.Serializable;
 
public class NhanVien417 implements Serializable{
    private int id;
    private String HoTen;
    private String TenDangNhap;
    private String MatKhau;
    private String VaiTro;
    private String GhiChu;
    
    public NhanVien417(){
        super();
    }

    public NhanVien417(String HoTen, String TenDangNhap, String MatKhau, String VaiTro, String GhiChu) {
        super();
        this.HoTen = HoTen;
        this.TenDangNhap = TenDangNhap;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
        this.GhiChu = GhiChu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getTenDangNhap() {
        return TenDangNhap;
    }

    public void setTenDangNhap(String TenDangNhap) {
        this.TenDangNhap = TenDangNhap;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }  
}
