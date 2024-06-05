package domain.user;

import domain.DBConnect;

import java.util.Scanner;

public class Login {

	public Login(){
		
		String id;
		String ps;
	}

	
	
	public static void check(String id, String ps) {
		
		
		System.out.println("로그인을 해주세요");
		System.out.println("pw:");
		check(id, ps);
		
		DBConnect dao = new DBConnect();
        int result = 1;
        result = dao.idCheck(id, ps);
        if(result == 1){
            System.out.println("로그인 성공");
        }else{
            System.out.println("일치하지 않습니다.");
        }
	}

}