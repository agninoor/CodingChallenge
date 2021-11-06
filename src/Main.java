public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();
        ThreadA threadA = new ThreadA(foo);
        ThreadB threadB = new ThreadB(foo);
        ThreadC threadC = new ThreadC(foo);


        try{
            threadA.t.join();
            threadB.t.join();
            threadC.t.join();
        }catch (InterruptedException e){
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main thread terminated");

    }
}
