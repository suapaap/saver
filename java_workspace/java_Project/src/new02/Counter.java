package new02;

class SingletonCounter{
   // 싱글톤 패턴으로 객체생성
   public static SingletonCounter instance;
   private int count;
   
   //private 생성자
   private SingletonCounter() {}
   // getInstance()
   public static SingletonCounter getInstance() {
      if(instance == null) {
         instance = new SingletonCounter();
      }
      return instance;
   }
   // count()
   public int countMathod() {
      count++;
      return count;
   }
}
//단 하나의 객체를 보장하기 위한 패턴
// 상속 허용x
public class Counter {

   public static void main(String[] args) {
      SingletonCounter c1 = SingletonCounter.getInstance();
      SingletonCounter c2 = SingletonCounter.getInstance();
      c1.countMathod();
      System.out.println(c1.countMathod());
      c2.countMathod();
      System.out.println(c2.countMathod());
   }
}