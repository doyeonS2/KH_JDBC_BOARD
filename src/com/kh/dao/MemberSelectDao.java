package com.kh.dao;

import com.kh.util.Common;
import com.kh.vo.MemberVO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MemberSelectDao {
    public List<MemberVO> listMember() {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        List<MemberVO> list = new ArrayList<>();
        try {
            conn = Common.getConnection();
            stmt = conn.createStatement();
            String query = "SELECT * FROM MEMBER";
            rs = stmt.executeQuery(query);

            while (rs.next()) {
                int Member_Num = rs.getInt("Member_Num");
                String ID = rs.getString("ID");
                String PASSWORD = rs.getString("PASSWORD");
                String Name = rs.getString("NAME");
                String Birth = rs.getString("BIRTH");
                String Gender = rs.getString("GENDER");
                String Email = rs.getString("EMAIL");
                String Phone = rs.getString("PHONE");
                String Recommender_ID = rs.getString("RECOMMENDER_ID");
                String Reg_Date = rs.getString("REG_DATE");

                MemberVO vo = new MemberVO();
                vo.setMemeber_Num(Member_Num);
                vo.setID(ID);
                vo.setPASSWORD(PASSWORD);
                vo.setName(Name);
                vo.setBirth(Birth);
                vo.setGender(Gender);
                vo.setEmail(Email);
                vo.setPhone(Phone);
                vo.setRecommender_ID(Recommender_ID);
                vo.setReg_Date(Reg_Date);

                list.add(vo);

            }
            Common.close(rs);
            Common.close(stmt);
            Common.close(conn);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public void printEmpSelect(List<MemberVO> list) {
        for (MemberVO e : list) {
            System.out.print(e.getMemeber_Num() + " ");
            System.out.print(e.getID() + " ");
            System.out.print(e.getPASSWORD() + " ");
            System.out.print(e.getName() + " ");
            System.out.print(e.getBirth() + " ");
            System.out.print(e.getGender() + " ");
            System.out.print(e.getEmail() + " ");
            System.out.print(e.getPhone() + " ");
            System.out.print(e.getRecommender_ID() + " ");
            System.out.print(e.getReg_Date() + " ");
            System.out.println();
        }
    }
}