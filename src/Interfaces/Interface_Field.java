package Interfaces;

interface Interface_Field_Interface{
	String Name = "Interface_Field_Interface";
	//인터페이스에서 선언한 모든 필드는
	//public static final을 갖고 있음
	

	//String Name;
	//ERROR
	//인터페이스에서 모든 필드는 값을 선언해야 함
}


class Interface_Field_Sub implements Interface_Field_Interface{
	
}

public class Interface_Field {
	public static void main(String[] ar){
		Interface_Field_Interface a = new Interface_Field_Sub();
		
		System.out.println(""+a.Name);
		//객체를 통한 접근 가능
		
		System.out.println(Interface_Field_Interface.Name);
		//public static의 기능을 갖고 있기에 
		//인터페이스[Interface_Field_Interface] 에서
		//직접 접근 가능
		
		System.out.println(Interface_Field_Sub.Name);
		//public static의 기능을 갖고 있기에 
		//적용 받은 하위 클래스[Interface_Field_Sub] 에서
		//직접 접근 가능
		
		
		//a.Name = "Can Not Change";
		//ERROR
		//인터페이스에서 선언된 모든 필드는
		//final 특징을 내포하고 있기에
		//값의 변경 불가능
	}
}




