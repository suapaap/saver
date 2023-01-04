package new02;

public class Singleton {

      // 싱글톤 패턴 : 소프트웨어 디자인 패턴 중 하나
      // 객체를 공유하고자 할 때 사용
      // 단 1개만 존재해야 객체의 인스턴스, static으로 선언
      private static Singleton instance;
      private int count;
      // 생성자를 이용하여 객체 생성
      private Singleton() {}
      
      // getInstance를 사용한 instance 반환
      public static Singleton getInstance() {
         //null 일 떄만 생성, 이미 생성되어 있다면 기존 instance 반환
         if(instance == null) {
            instance = new Singleton();
         }
         return instance;
      }  
}