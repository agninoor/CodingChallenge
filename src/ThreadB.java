public class ThreadB implements Runnable{
     Foo foo;
     Thread t;
    ThreadB(Foo foo){
        this.foo = foo;
        t = new Thread(this, "Thread B");
        t.start();;

    }

    public void run(){

                foo.second();
    }
}
