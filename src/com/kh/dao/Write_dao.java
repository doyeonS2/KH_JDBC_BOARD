package com.kh.dao;

import com.kh.util.Common;
import com.kh.vo.WriteVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Write_dao {
    Connection conn = null;
    Statement stmt = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    Scanner sc = new Scanner(System.in);

    public void writeSelect(){
        System.out.print("작성할 계시판을 선택해 주세요");

        System.out.print("공지사항 , 등업게시판 , 자유게시판 , 질문게시판 , 스터디모집 , 구인구직 , 이벤트 : ");
        String name = sc.next();
        while(true){
            if(!name.equals("공지사항") && !name.equals("등업게시판") && !name.equals("자유게시판")
                    && !name.equals("질문게시판") && !name.equals("스터디모집")
                    && !name.equals("구인구직") && !name.equals("이벤트"))
                System.out.print("잘못 입력 하셨습니다. 다시 선택해 주세요");
            else break;
        }
        System.out.print("글 번호를 입력해 주세요 : ");
        int num = sc.nextInt();
        System.out.print("글 제목을 입력해 주세요 : ");
        String title = sc.next();
        System.out.print("글 내용을 입력해 주세요 : ");
        String contents = sc.next();
        System.out.print("작성자 아이디를 입력해 주세요 : ");
        String id = sc.next();


        String sql = "INSERT INTO WRITE (WRITE_NAME, WRITE_NUM ,WRITE_TITLE ,WRITE_CONTENTS ,WRITE_ID)"
                + "VALUES(?,?,?,?,?)";

        try{
            conn = Common.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1,name);
            pstmt.setInt(2,num);
            pstmt.setString(3,title);
            pstmt.setString(4,contents);
            pstmt.setString(5,id);


        }catch (Exception e){
            e.printStackTrace();
        }
        Common.close(pstmt);
        Common.close(conn);
    }
}
