package check;

public class Child5 extends Parent5{
	private int studentNo;
    
    public Child5(String name, int studentNo){
//		부모 클래스가 명시적 생성자를 선언해 놓았기 때문에 명시적으로 부모 객체를 생성해야 한다.
        super(name);
        this.studentNo = studentNo;
    }
}