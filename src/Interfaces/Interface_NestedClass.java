package Interfaces;

interface Interface_NestedClass_Interface{
	
	class Interface_NestedClass_Interface_Inner{
	//�������̽��� ��� ��øŬ������ ������øŬ������
	//public static class �� ���� ����
		
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
		//�������̽��� ��øŬ������ ����Ʈ ��� Ȱ��
	}
}

public class Interface_NestedClass {
	public static void main(String[] ar){
		Interface_NestedClass_Sub a = new Interface_NestedClass_Sub();
		a.Print();
	}
}









