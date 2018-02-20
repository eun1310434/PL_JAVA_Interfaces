/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
 * ����) ���� ���� ����Ʈ���� ����, Java Documentation, ��� �ڹ� ���α׷���
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
	//�������̽�[Interface_Extends_Interface_C]�� ��ӹ��� 
	//�������̽�[Interface_Extends_Interface_A]�� 
	//�޼ҵ�[Print_A] �� ����
	
	public void Print_B(){System.out.println("Print_B");};
	//�������̽�[Interface_Extends_Interface_C]�� ��ӹ��� 
	//�������̽�[Interface_Extends_Interface_B]�� 
	//�޼ҵ�[Print_AB] �� ����
	
	public void Print_C(){System.out.println("Print_C");};
	//�������̽�[Interface_Extends_Interface_C]�� 
	//�޼ҵ�[Print_C] �� ����
}

public class Interface_Extends {
	public static void main(String[] ar){
		Interface_Extends_Sub a = new Interface_Extends_Sub();
		a.Print_A();
		a.Print_B();
		a.Print_C();
	}
}





