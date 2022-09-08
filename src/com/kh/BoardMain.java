package com.kh;
import com.kh.dao.MemberInsertDao;
import com.kh.dao.MemberSelectDao;
import com.kh.dao.Write_dao;
import com.kh.vo.MemberVO;

import java.util.List;
import java.util.Scanner;

// 다들 즐거운 추석되세요 껄껄
// 회원가입 완료
// 글쓰기 완료

public class BoardMain {
    public static void main(String[] args) {
        MemberSelect();
    }

    public static void MemberSelect() {
        Scanner sc = new Scanner(System.in);
            System.out.println("========[MEMBER Table 조회]==========");
            System.out.println("메뉴를 선택하세요");
            System.out.println("[1] 회원가입 [2] 회원정보 [3] 글쓰기 [4] 글보기 [5] 게시판나가기");
            int sel = sc.nextInt();

            switch (sel) {
                case 1:
                    MemberInsertDao insert = new MemberInsertDao();
                    insert.empInsert();
                    break;
                case 2:
                    MemberSelectDao select = new MemberSelectDao();
                    List<MemberVO> list = select.listMember();
                    select.printEmpSelect(list);
                    break;

                case 3:
                    Write_dao insert2 = new Write_dao();
                    insert2.writeSelect();
                    break;
                case 5:
                    System.out.println("게시판을 나갑니다! 안녕히가십시오");
                    return;


        }
    }
}
