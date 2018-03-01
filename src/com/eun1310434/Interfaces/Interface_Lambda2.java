/**
 * 01.03.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���, https://programmers.co.kr
*/
package com.eun1310434.Interfaces;
interface Interface_Lambda2_I_a {
	void print();
}

interface Interface_Lambda2_I_b {
	void print(int x);
}

interface Interface_Lambda2_I_c {
	void print(Integer key, String value);
}

public class Interface_Lambda2 {
	public static void main(String[] ar) {
		System.out.println("Part A --------------------------");
		Interface_Lambda2_I_a a 
		= () -> System.out.println("print");
		//() : void
		a.print();

		
		System.out.println("Part B --------------------------");
		Interface_Lambda2_I_b b 
		= x -> System.out.println("print - x = " + x);
		//x : Integer
		b.print(100);
		
		
		System.out.println("Part C --------------------------");
		Interface_Lambda2_I_c c 
		= (k, v) -> {
			//k : Integer
			//v : String
			System.out.println("print - key = " + k);
			System.out.println("print - value = " + v);
			return;
		};
		c.print(1, "�����");
		
	}
}
