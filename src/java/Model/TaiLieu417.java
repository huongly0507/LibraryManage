package Model;
import java.io.Serializable;
 
public class TaiLieu417  implements Serializable{
    private int id;
    private String TenTaiLieu;
    private String TacGia;
    private String NamXuatBan;
    private int SoLanMuon;
    private String LoaiTaiLieu;
    
    public TaiLieu417(){
        super();
    }

    public TaiLieu417(String TenTaiLieu, String TacGia, String NamXuatBan, int SoLanMuon, String LoaiTaiLieu) {
        super();
        this.TenTaiLieu = TenTaiLieu;
        this.TacGia = TacGia;
        this.NamXuatBan = NamXuatBan;
        this.SoLanMuon = SoLanMuon;
        this.LoaiTaiLieu = LoaiTaiLieu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenTaiLieu() {
        return TenTaiLieu;
    }

    public void setTenTaiLieu(String TenTaiLieu) {
        this.TenTaiLieu = TenTaiLieu;
    }

    public String getTacGia() {
        return TacGia;
    }

    public void setTacGia(String TacGia) {
        this.TacGia = TacGia;
    }

    public String getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(String NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public int getSoLanMuon() {
        return SoLanMuon;
    }

    public void setSoLanMuon(int SoLanMuon) {
        this.SoLanMuon = SoLanMuon;
    }

    public String getLoaiTaiLieu() {
        return LoaiTaiLieu;
    }

    public void setLoaiTaiLieu(String LoaiTaiLieu) {
        this.LoaiTaiLieu = LoaiTaiLieu;
    }
    
}