package Interfaces;

interface Interface_Field_Interface{
	String Name = "Interface_Field_Interface";
	//�������̽����� ������ ��� �ʵ��
	//public static final�� ���� ����
	

	//String Name;
	//ERROR
	//�������̽����� ��� �ʵ�� ���� �����ؾ� ��
}


class Interface_Field_Sub implements Interface_Field_Interface{
	
}

public class Interface_Field {
	public static void main(String[] ar){
		Interface_Field_Interface a = new Interface_Field_Sub();
		
		System.out.println(""+a.Name);
		//��ü�� ���� ���� ����
		
		System.out.println(Interface_Field_Interface.Name);
		//public static�� ����� ���� �ֱ⿡ 
		//�������̽�[Interface_Field_Interface] ����
		//���� ���� ����
		
		System.out.println(Interface_Field_Sub.Name);
		//public static�� ����� ���� �ֱ⿡ 
		//���� ���� ���� Ŭ����[Interface_Field_Sub] ����
		//���� ���� ����
		
		
		//a.Name = "Can Not Change";
		//ERROR
		//�������̽����� ����� ��� �ʵ��
		//final Ư¡�� �����ϰ� �ֱ⿡
		//���� ���� �Ұ���
	}
}




