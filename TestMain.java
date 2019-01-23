public class TestMain {
  public static void main(String[] args) {
    System.out.println("modify");
    System.out.println("add");
    //just do nothing
    TestFun testFun = new TestFun();
    testFun.fun();
    //add 555
    testFun.fun();
    //add 2
    testFun.fun();
  }
}