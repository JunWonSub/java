package check;

public class Child6 extends Parent6{
	private String name;
    
    public Child6(){
    	this("ȫ�浿");
        System.out.println("Child6() call");
    }
    public Child6(String name){
    	this.name = name;
        System.out.println("Child6(String name) call");
    }
}