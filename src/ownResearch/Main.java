package ownResearch;

public class Main {

    int i = 5;

    public static void main(String[] args) throws Exception{
        Main main = new Main();
        main.method();
    }

    void method() {
        Inner inner = new Inner();
        inner.method2();
        System.out.println(inner.k);
    }

    class Inner {
        private int k = 6;
        void method2(){
            System.out.println(i);
        }
    }

}
