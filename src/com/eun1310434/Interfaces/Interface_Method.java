/**
 * 20.02.2018
 * eun1310434@naver.com
 * https://blog.naver.com/eun1310434
*/

package com.eun1310434.Interfaces;

import java.util.Random;

interface Interface_Method_Interface{
	
	public void Print(int i);
	//�����̽����� ����� ��� �޼ҵ�� �߻� �޼ҵ��̱⿡
	//public abstract �� ���� �� ���̸� 
	//����޴� ����Ŭ�������� �����θ� �ۼ�	
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

		//��������
		for(int i = 0 ; i < a.length; i++){
			int randomNum = new Random().nextInt(2);			
			if(0 == randomNum){
				a[i] = new Interface_Method_Sub_A();
				//�������̽��� Ȱ���Ͽ�
				//���������� ����� ��ü"Interface A = new Sub()"��
				//��ӹ��� ����Ŭ����(Sub_A, Sub_B....) �� ��� ������ 
				//������ �Ͽ��� ������ �߻����� ����
				
			}else if(1 == randomNum){
				a[i] = new Interface_Method_Sub_B();
				//�������̽��� Ȱ���Ͽ�
				//���������� ����� ��ü"Interface A = new Sub()"��
				//��ӹ��� ����Ŭ����(Sub_A, Sub_B....) �� ��� ������ 
				//������ �Ͽ��� ������ �߻����� ����
				
			}else{

				//a[i] = new Interface_Method_Interface();
				//ERROR
				//�������̽��� ��ü�� �ɼ� ����(�ν��Ͻ�ȭX)
				//���� ������ �Ұ���
			}
		}

		//���
		for(int i = 0 ; i < a.length; i++){
			System.out.println("-----------------------------");
			
			//�������̽��� Ȱ���� ������ - ������ �� �޼ҵ� ���� : O
			a[i].Print(i);
			//�߻�Ŭ���� Ȱ���� ���������� ����� 
			//��ü "Interface A = new Sub()"��
			//�������̽��� �߻�޼ҵ� print(int)�� ���� ȣ�� ���ϸ�,
			//����Ŭ����(Sub)�� ������ print(int)�� ȣ��
		}
	}
}






