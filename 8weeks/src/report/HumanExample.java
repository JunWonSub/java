package report;

public class HumanExample {
	public static void main(String[] args) {
		Human human1 = new Human("�浿", 170, 60);
		Human human2 = new Human("ö��", 166, 72);
		human1.gainWeight(3);
		human2.reduceWeight(5);
		
		System.out.println("�̸�: " + human1.getName());
		System.out.println("����: " + human1.getHeight() + "cm");
		System.out.println("������: " + human1.getWeight() + "kg");
		System.out.println();
		
		System.out.println("�̸�: " + human2.getName());
		System.out.println("����: " + human2.getHeight() + "cm");
		System.out.println("������: " + human2.getWeight() + "kg");
		
		
	}
}
