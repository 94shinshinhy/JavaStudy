package kr.co.bitcamp.overloading;

class A {
    int data1 = 10;
    int data2 = 20;
}

public class AccumulatorTest {

    public static void main(String[] args) {
        
        Accumulator accm = new Accumulator();
        int iRes = accm.add(10, 50);
        System.out.println("iRes : " + iRes);
        
        long lRes = accm.add(100, 7500L);            // 접미사를 반드시 붙이도록 함
        System.out.println("lRes : " + lRes);
        
        lRes = accm.add(1000L, 10);                  // 접미사를 반드시 붙이도록 함
        System.out.println("lRes : " + lRes);
        
        double dRes = accm.add(107.88, 11.55);
        System.out.println("dRes : " + dRes);
        
        long arrRes = accm.add(new int[] {1,2,3,4,5});
        System.out.println("arrRes : " + arrRes);
        
        int cRes = accm.add(new A());
//        A a = new A();
//        int classRes = accm.add(a);
        System.out.println("cRes : " + cRes);

    }

}
