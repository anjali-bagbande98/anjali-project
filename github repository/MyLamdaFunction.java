package lamdafunction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyLamdaFunction {
	
	public int addNum(int x, int y) {
		return x + y;
	}
	
	public int areaRect(int x, int y) {
		return x*y;
	}
	
	public void findArea() {
		int area = areaRect(10, 5);
		System.out.println("area="+area);
		rectArea rectAreaObj = (int x, int y) -> {return x*y;};
			// l = 20 and b = 30
		int area_of_rect = rectAreaObj.areaRect(20,30);
		System.out.println("area_of_rect="+area_of_rect);
	}
	
	public void numSeq() {
		ArrayList <Integer> numSeq = new ArrayList<Integer>();
		numSeq.add(11);numSeq.add(12);numSeq.add(13);
		
		for(int i = 0; i < numSeq.size(); i++) {
			numSeq.get(i);
		}
		
		
		List<Integer> intSeq = Arrays.asList(21,22,23);
		intSeq.forEach(a -> System.out.println(a));
		
		List <String> str = Arrays.asList(" red","green ","orange ","blue");
		str.forEach(b -> System.out.println(b));
	}
	
	public static void main(String[] args) {
		MyLamdaFunction m = new MyLamdaFunction();
		m.findArea();
		m.numSeq();
		int sum = m.addNum(5, 10);
		System.out.println("sum="+sum);
		addNum a = (int x, int y) -> { return x + y;};
		// add 70 and 30
		int add = a.addNo(70, 30);
		System.out.println("add="+add);
	}
}

interface addNum{
	int addNo(int x, int y);
}

interface rectArea{
	int areaRect(int x, int y);
}








//(expression) -> {body;};








