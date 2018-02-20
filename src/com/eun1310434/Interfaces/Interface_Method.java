/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/

package com.eun1310434.Interfaces;

import java.util.Random;

interface Interface_Method_Interface{
	
	public void Print(int i);
	//인페이스에서 선언된 모든 메소드는 추상 메소드이기에
	//public abstract 가 생략 된 것이며 
	//적용받는 하위클래스에서 구현부를 작성	
}

class Interface_Method_Sub_A implements Interface_Method_Interface{
	public void Print(int i){
		System.out.println(i+" - sub_A");
	}
}

class Interface_Method_Sub_B implements Interface_Method_Interface{
	public void Print(int i){
		System.out.println(i+" - sub_B");
	}
}

public class Interface_Method {
	public static void main(String[] ar){
		Interface_Method_Interface[] a = new Interface_Method_Interface[10];

		//렌덤선언
		for(int i = 0 ; i < a.length; i++){
			int randomNum = new Random().nextInt(2);			
			if(0 == randomNum){
				a[i] = new Interface_Method_Sub_A();
				//인터페이스를 활용하여
				//다형성으로 선언된 객체"Interface A = new Sub()"는
				//상속받은 하위클래스(Sub_A, Sub_B....) 중 어떻한 것으로 
				//선언을 하여도 문제가 발생되지 않음
				
			}else if(1 == randomNum){
				a[i] = new Interface_Method_Sub_B();
				//인터페이스를 활용하여
				//다형성으로 선언된 객체"Interface A = new Sub()"는
				//상속받은 하위클래스(Sub_A, Sub_B....) 중 어떻한 것으로 
				//선언을 하여도 문제가 발생되지 않음
				
			}else{

				//a[i] = new Interface_Method_Interface();
				//ERROR
				//인터페이스는 객체가 될수 없음(인스턴스화X)
				//직접 접근은 불가능
			}
		}

		//출력
		for(int i = 0 ; i < a.length; i++){
			System.out.println("-----------------------------");
			
			//인터페이스를 활용한 다형성 - 구현된 된 메소드 접근 : O
			a[i].Print(i);
			//추상클래스 활용한 다형성으로 선언된 
			//객체 "Interface A = new Sub()"는
			//인터페이스의 추상메소드 print(int)를 결코 호출 못하며,
			//하위클래스(Sub)에 구현된 print(int)가 호출
		}
	}
}






