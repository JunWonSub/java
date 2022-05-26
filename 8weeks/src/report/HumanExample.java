package report;

public class HumanExample {
	public static void main(String[] args) {
		Human human1 = new Human("길동", 170, 60);
		Human human2 = new Human("철수", 166, 72);
		human1.gainWeight(3);
		human2.reduceWeight(5);
		
		System.out.println("이름: " + human1.getName());
		System.out.println("신장: " + human1.getHeight() + "cm");
		System.out.println("몸무게: " + human1.getWeight() + "kg");
		System.out.println();
		
		System.out.println("이름: " + human2.getName());
		System.out.println("신장: " + human2.getHeight() + "cm");
		System.out.println("몸무게: " + human2.getWeight() + "kg");
		
		
	}
}
