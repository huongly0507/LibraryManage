/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Model.NhanVien417;
import java.sql.SQLException;
 
public class NhanVienDAO extends DAO{
     
    public NhanVienDAO() {
        super();
    }
     
    public boolean checkLogin(NhanVien417 nv) {
        boolean result = false;
        String sql = "SELECT VaiTro FROM tblNhanVien417 WHERE TenDangNhap = ? AND MatKhau = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nv.getTenDangNhap());
            ps.setString(2, nv.getMatKhau());
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                nv.setHoTen(rs.getString("HoTen"));
                nv.setVaiTro(rs.getString("VaiTro"));
                result = true;
            }
        }catch(SQLException e) {
        }
        return result;
    }
}