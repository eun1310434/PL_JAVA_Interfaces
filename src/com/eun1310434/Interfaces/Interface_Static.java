/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * 참고) 쉽게 배우는 소프트웨어 공학, Java Documentation, 헬로 자바 프로그래밍
*/
package com.eun1310434.Interfaces;
interface Interface_Static_Super {
	public void M_a();
	public void M_b();
	public static void M_c() {
		// JAVA 8이 등장하면서 interface에 대한 정의가 몇 가지 변경되었다.
		// 인터페이스에 static 메소드를 선언
		// 인터페이스를 이용하여 간단한 기능을 가지는 유틸리티성 인터페이스를 만들 수 있게 됨
		System.out.println("Interface_Default_Super : M_c - static");
	}
}
class Interface_Static_Child implements Interface_Static_Super {
	public void M_a() { }
	public void M_b() { }
	
	public void M_c() {
		// TODO Auto-generated method stub
		System.out.println("Interface_Static_Child : M_c - @Override");
	}
	
}
public class Interface_Static {
	public static void main(String[] ar) {
		Interface_Static_Super.M_c();
		
		Interface_Static_Child a = new Interface_Static_Child();
		a.M_c();
	}
}
