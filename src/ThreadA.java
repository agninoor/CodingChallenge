public class ThreadA implements  Runnable{
    Foo foo;
    Thread t;

    ThreadA(Foo foo){
        this.foo = foo;
        t = new Thread(this, "Thread A");
        t.start();
    }

    public  void run(){
            foo.first();
    }
}
