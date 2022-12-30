package info.controller;
//콘솔창에서 입력받은 학생 정보를 사용하여 StudentVO객체를 생성하고 
//생성 된 StudentVo객체를 StudentDAO객체의 ArrayList에 저장한다 (insert() 사용))

import java.util.*;

import info.view.StudentView;
import info.vo.StudentDAO;
import info.vo.StudentVO;

public class StudentController {
	
	public static final int CONTINUE = 1;
	public static final int BREAK = 2;
	
	ArrayList<String> names = new ArrayList<String>();
	ArrayList<Integer> stulds = new ArrayList<Integer>();
	ArrayList<Integer> grades = new ArrayList<Integer>();
	ArrayList<String> majors = new ArrayList<String>();
	ArrayList<String> mobiles = new ArrayList<String>();
	
	public void consoleToList() {
		
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		//사용자가 원하는 만큼 학생 정보를 입력받기 위해서 사용 (우선 처음 1번은 무조건 입력받아야하니 초기화를 continue로 준다
		int flag = CONTINUE;
		
		while (true) {
			if (flag == CONTINUE) {
				
				System.out.println("[학생 정보 입력]");
				System.out.println(" ");
				
				System.out.print("이름 : ");
				names.add(s1.nextLine());
				System.out.println(" ");
				
				System.out.print("학번 : ");
				stulds.add(s2.nextInt());
				System.out.println(" ");
				
				System.out.print("학년 : ");
				grades.add(s2.nextInt());
				System.out.println(" ");
				
				System.out.print("전공 : ");
				majors.add(s1.nextLine());
				System.out.println(" ");
				
				System.out.print("연락처 : ");
				mobiles.add(s1.nextLine());
				System.out.println(" ");
				
			}
			else if (flag == BREAK) {
				break;
			}
			System.out.println(" ");
			System.out.println("더 많은 학생 정보를 입력하시겠습니까?");
			System.out.println("입력 : 1 | 중단 : 2");
			System.out.print("선택 : ");
			flag = s2.nextInt();
		}
		
		s1.close();
		s2.close();
	}
	
	public void voToDAO(StudentDAO dao) {
		
		for (int i=0; i<names.size(); i++) {
			StudentVO svo = new StudentVO(names.get(i), stulds.get(i), grades.get(i), majors.get(i), mobiles.get(i));
			dao.insert(svo);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentController controller = new StudentController();
		
		//콘솔창에서 입력 받은 값을 각각의 정보를 저장하는 ArrayList에 저장하는 메서드
		controller.consoleToList();
		
		//입력받은 값들을 사용하여 StudentVO객체를 생성하여 DAO의 ArrayList에 저장하는 메서드
		StudentDAO dao = new StudentDAO();
		controller.voToDAO(dao);
		
		//화면에 출력
		StudentView sView = new StudentView();
		sView.view(dao.select());
		
	}

}
