package com.kh.dao;

import com.kh.util.Common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MemberInsertDao {
    public void empInsert() {
        Connection conn = null;
        Statement stmt = null;
        PreparedStatement pstmt = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("회원가입 정보를 입력하세요");
        System.out.print("회원번호 : ");
        int Member_Num = sc.nextInt();
        System.out.print("ID : ");
        String ID = sc.next();
        System.out.print("PASSWORD : ");
        String PASSWORD = sc.next();
        System.out.print("이름 : ");
        String Name = sc.next();
        System.out.print("생일 : ");
        String Birth = sc.next();
        System.out.print("성별 : ");
        String Gender = sc.next();
        System.out.print("이메일주소 : ");
        String Email = sc.next();
        System.out.print("휴대폰 번호 : ");
        String Phone = sc.next();
        System.out.print("추천인 ID : ");
        String Recommender_ID = sc.next();
        System.out.print("가입일 : ");
        String Reg_Date = sc.next();

        String query = "INSERT INTO MEMBER(MEMBER_NUM, ID, PASSWORD, NAME , BIRTH, GENDER, EMAIL, PHONE, RECOMMEND_ID, REG_DATE " + "VALUES (?,?,?,?,?,?,?,?,?,?)";

        try {
            conn = Common.getConnection();
            pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, Member_Num);
            pstmt.setString(2, ID);
            pstmt.setString(3, PASSWORD);
            pstmt.setString(4, Name);
            pstmt.setString(5, Birth);
            pstmt.setString(6, Gender);
            pstmt.setString(7, Email);
            pstmt.setString(8, Phone);
            pstmt.setString(9, Recommender_ID);
            pstmt.setString(10, Reg_Date);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Common.commit(conn);
        Common.close(pstmt);
        Common.close(conn);

    }
}

