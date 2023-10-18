/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import Model.TaiLieu417;
import java.sql.SQLException;
 
public class TaiLieu417DAO extends DAO{
     
    public TaiLieu417DAO() {
        super();
    }
 
    /**
     * search all rooms in the tblRoom whose name contains the @key
     * @param key
     * @return list of room whose name contains the @key
     */
    public ArrayList<TaiLieu417> timTaiLieu(String key){
        ArrayList<TaiLieu417> result = new ArrayList<>();
        String sql = "SELECT * FROM tblTaiLieu417 WHERE TenTaiLieu LIKE ?";
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + key + "%");
            ResultSet rs = ps.executeQuery();
 
            while(rs.next()){
                TaiLieu417 tl = new TaiLieu417();
                tl.setId(rs.getInt("id"));
                tl.setTenTaiLieu(rs.getString("tenTaiLieu"));
                tl.setTacGia(rs.getString("TacGia"));
                tl.setNamXuatBan(rs.getString("NamXuatBan"));
                tl.setSoLanMuon(rs.getInt("SoLanMuon"));
                tl.setLoaiTaiLieu(rs.getString("LoaiTaiLieu"));
                result.add(tl);
            }
        }catch(SQLException e){
        }   
        return result;
    }
}
