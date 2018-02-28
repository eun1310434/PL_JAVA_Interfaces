/**
 * 28.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
*/
package com.eun1310434.Interfaces;
interface Interface_Static_Super {
	public void M_a();
	public void M_b();
	public static void M_c() {
		// JAVA 8�� �����ϸ鼭 interface�� ���� ���ǰ� �� ���� ����Ǿ���.
		// �������̽��� static �޼ҵ带 ����
		// �������̽��� �̿��Ͽ� ������ ����� ������ ��ƿ��Ƽ�� �������̽��� ���� �� �ְ� ��
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
