package com.eun1310434.Interfaces;
interface Interface_Default_Super {
	public void M_a();
	public void M_b();
	default public void M_c() {
		// JAVA 8�� �����ϸ鼭 interface�� ���� ���ǰ� �� ���� ����Ǿ���.
		// �������̽��� defaultŰ����� ����Ǹ� �޼ҵ尡 ���� ��
		// ���� �̸� �����ϴ� Ŭ������ default�޼ҵ带 �������̵� ����
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
