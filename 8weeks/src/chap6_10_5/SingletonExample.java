package chap6_10_5;

public class SingletonExample {
    public static void main(String[] args) {
        /* 생성자 호출 -> 객체 생성
        Singleton obj1 = new Singleton();  //컴파일 에러 (private때문에 클래스 외부에서 new 생성자로 호출 X)
        Singleton obj2 = new Singleton();  //컴파일 에러 (싱글톤은 하나의 객체이고, 생성자를 호출한만큼 객체가 생성 되므로 X)
        */
        
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        
        if(obj1 == obj2) {
            System.out.println("같은 Singleton 객체 입니다.");
        } else {
            System.out.println("다른 Singleton 객체 입니다.");
        }
    }
}
