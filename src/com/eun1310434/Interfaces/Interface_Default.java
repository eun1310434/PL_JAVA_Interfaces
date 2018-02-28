package com.eun1310434.Interfaces;
interface Interface_Default_Super {
	public void M_a();
	public void M_b();
	default public void M_c() {
		// JAVA 8이 등장하면서 interface에 대한 정의가 몇 가지 변경되었다.
		// 인터페이스가 default키워드로 선언되면 메소드가 구현 됨
		// 또한 이를 구현하는 클래스는 default메소드를 오버라이딩 가능
		System.out.println("Interface_Default_Super : M_c - aasdfasdfas");
	}
}
class Interface_Default_Child_a implements Interface_Default_Super {
	public void M_a() { }
	public void M_b() { }
}
class Interface_Default_Child_b implements Interface_Default_Super {
	public void M_a() { }
	public void M_b() { }
	@Override
	public void M_c() {
		// TODO Auto-generated method stub
		System.out.println("Child_b : M_c - Overriding");

	}
}
public class Interface_Default {
	public static void main(String[] ar) {
		Interface_Default_Child_a a = new Interface_Default_Child_a();
		a.M_c();
		
		Interface_Default_Child_b b = new Interface_Default_Child_b();
		b.M_c();
		
	}
}
