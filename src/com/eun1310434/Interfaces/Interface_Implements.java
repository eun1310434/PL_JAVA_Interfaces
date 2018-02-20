/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/

package com.eun1310434.Interfaces;

interface Interface_Implements_Interface_A{
	public void Print_A();
}

interface Interface_Implements_Interface_B{
	public void Print_B();
}

interface Interface_Implements_Interface_C{
	public void Print_C();
}

class Interface_Implements_Sub implements Interface_Implements_Interface_A
                                         ,Interface_Implements_Interface_B
                                         ,Interface_Implements_Interface_C{
	public void Print_A(){System.out.println("Print_A");};
	//�������̽�[Implements_Many_Interface_A]�� 
	//�޼ҵ�[Print_A]�� ����
	
	public void Print_B(){System.out.println("Print_B");};
	//�������̽�[Implements_Many_Interface_B]�� 
	//�޼ҵ�[Print_B]��  ����
	
	public void Print_C(){System.out.println("Print_C");};
	//�������̽�[Implements_Many_Interface_C]�� 
	//�޼ҵ�[Print_C]��  ����
}

public class Interface_Implements {
	public static void main(String[] ar){
		Interface_Implements_Sub a = new Interface_Implements_Sub();
		a.Print_A();
		a.Print_B();
		a.Print_C();
	}

}









