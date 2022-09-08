package com.kh;
import com.kh.dao.MemberInsertDao;
import com.kh.dao.MemberSelectDao;
import com.kh.vo.MemberVO;

import java.util.List;
import java.util.Scanner;
//test chanho
//12:27
//test 숩
// 12:33
// 12:39 도연 test
// test 윤정
// soon 점심시간~~~~ 은종
// 정찬호 12:38
// test 민형
// test 승렬
// test 정운
// ~~ 3조 전원 성공 ~~~~~~~~~~~~~~~~~~~~~~~~~~!!

public class BoardMain {
    public static void main(String[] args) {
        MemberSelect();
    }

    public static void MemberSelect() {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("========[MEMBER Table 조회]==========");
            System.out.println("메뉴를 선택하세요");
            System.out.println("[1] 회원가입 [2] 회원정보 [3] 글쓰기");
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
            }
        }
    }
}
