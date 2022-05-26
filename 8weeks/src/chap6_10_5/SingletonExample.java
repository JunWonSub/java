package chap6_10_5;

public class SingletonExample {
    public static void main(String[] args) {
        /* ������ ȣ�� -> ��ü ����
        Singleton obj1 = new Singleton();  //������ ���� (private������ Ŭ���� �ܺο��� new �����ڷ� ȣ�� X)
        Singleton obj2 = new Singleton();  //������ ���� (�̱����� �ϳ��� ��ü�̰�, �����ڸ� ȣ���Ѹ�ŭ ��ü�� ���� �ǹǷ� X)
        */
        
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        
        if(obj1 == obj2) {
            System.out.println("���� Singleton ��ü �Դϴ�.");
        } else {
            System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
        }
    }
}
