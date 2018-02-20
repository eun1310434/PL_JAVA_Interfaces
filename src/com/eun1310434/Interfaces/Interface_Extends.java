/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/

package com.eun1310434.Interfaces;

interface Interface_Extends_Interface_A{
	public void Print_A();
}

interface Interface_Extends_Interface_B{
	public void Print_B();
}

interface Interface_Extends_Interface_C extends Interface_Extends_Interface_A
                                               ,Interface_Extends_Interface_B{
	public void Print_C();
}

class Interface_Extends_Sub implements Interface_Extends_Interface_C{

	public void Print_A(){System.out.println("Print_A");};
	//인터페이스[Interface_Extends_Interface_C]가 상속받은 
	//인터패이스[Interface_Extends_Interface_A]의 
	//메소드[Print_A] 를 구현
	
	public void Print_B(){System.out.println("Print_B");};
	//인터페이스[Interface_Extends_Interface_C]가 상속받은 
	//인터패이스[Interface_Extends_Interface_B]의 
	//메소드[Print_AB] 를 구현
	
	public void Print_C(){System.out.println("Print_C");};
	//인터패이스[Interface_Extends_Interface_C]의 
	//메소드[Print_C] 를 구현
}

public class Interface_Extends {
	public static void main(String[] ar){
		Interface_Extends_Sub a = new Interface_Extends_Sub();
		a.Print_A();
		a.Print_B();
		a.Print_C();
	}
}





