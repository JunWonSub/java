package check;

public class SnowTireExample {
	public static void main(String[] args){
    	SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;
        
        snowTire.run();
//        ����� Ÿ�̾ �������ϴ�.
        tire.run();
//        ����� Ÿ�̾ �������ϴ�.
    }

}