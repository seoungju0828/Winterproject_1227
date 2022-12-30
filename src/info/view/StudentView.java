package info.view;
//화면에 보여주기 위한 출력 객체

import java.util.*;

import info.vo.*;

public class StudentView {
	
	//view(ArrayList<StudentVO> svoList) : 화면에 출력을 위한 메서드
	public void view(ArrayList<StudentVO> svoList) {
		
		for (StudentVO studentVO : svoList) {
			System.out.println("[학생 정보 출력]");
			System.out.println(" ");
			
			System.out.println("이름 : " + studentVO.getName());
			System.out.println(" ");
			
			System.out.println("학번 : " + studentVO.getStuld());
			System.out.println(" ");
			
			System.out.println("학년 : " + studentVO.getGrade());
			System.out.println(" ");
			
			System.out.println("전공 : " + studentVO.getMajor());
			System.out.println(" ");
			
			System.out.println("연락처 : " + studentVO.getMoblie());
			System.out.println(" ");
		}
		
	}

}
