package com.eun1310434.Interfaces;
import java.util.Arrays;
import java.util.function.Supplier;

//Ŭ�����̸�::static�޼���
//��ü�̸�::����޼���
//Ŭ�������̸�::�޼���
//Ŭ�����̸�::new

interface LambdaMethod_I{
	public void set(String key);
	public void print();
}

class Interface_Lambda3_a implements LambdaMethod_I{
	private String key;
	@Override
	public void set(String key) {
		this.key = key;
	}
	@Override
	public void print() {
		System.out.println("Interface_Lambda3_a : "+key);
	}
}

class Interface_Lambda3_b implements LambdaMethod_I{
	private String key;
	@Override
	public void set(String key) {
		this.key = key;
	}
	@Override
	public void print() {
		System.out.println("Interface_Lambda3_b : "+key);
	}
	
	public void printB() {
		System.out.println("Interface_Lambda3_b : printB : "+key);
	}
}

class MethodReference {
	public static <T extends LambdaMethod_I> T get(String str, Supplier<T> factory) {
		T obj = factory.get();
		obj.set(str);
		return obj;
	}
}
public class Interface_Lambda3 {
	public static void main(String[] ar) {
		LambdaMethod_I i1 = MethodReference.get("�����", Interface_Lambda3_a::new);
		Interface_Lambda3_b i2 = MethodReference.get("�ڽ���", Interface_Lambda3_b::new);
		i1.print();
		//i2.print();
		i2.printB();
		System.out.println();
		
		String[] strings = new String[]{"D", "B", "A", "C"};
		Arrays.sort(strings, String::compareToIgnoreCase);
		//���� -> int java.lang.String.compareToIgnoreCase(String str)
		
		for(String s: strings) {System.out.print(s + "\t");}
	}
}
