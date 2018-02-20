/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/

package com.eun1310434.Interfaces;

interface Interface_NestedClass_Interface{
	
	class Interface_NestedClass_Interface_Inner{
	//인터페이스의 모든 중첩클래스는 정적중첩클래스로
	//public static class 을 갖고 있음
		
		public void print(){
			System.out.println("InterfaceInnerClass");
		}
	}
}

class Interface_NestedClass_Sub implements Interface_NestedClass_Interface{
	public void Print(){
		new Interface_NestedClass_Interface
		.Interface_NestedClass_Interface_Inner()
		.print();
		//인터페이스에 중첩클래스의 프린트 기능 활용
	}
}

public class Interface_NestedClass {
	public static void main(String[] ar){
		Interface_NestedClass_Sub a = new Interface_NestedClass_Sub();
		a.Print();
	}
}









