package part15.task57;

class A {
    synchronized void foo (B b) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "   A.foo()");
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            System.out.println("Exception at A");
        }
        System.out.println(name + "    SecondClass.last()");
        b.last();
    }

    synchronized void last() {
        System.out.println("  A.last()");
    }
}

class B {
    synchronized void bar (C c) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "  B.bar()");
        try{
            Thread.sleep(1000);
        }catch (Exception e) {
            System.out.println(" B");
        }
        System.out.println(name + "  C.last()");
        c.last();
    }
    synchronized void last() {
        System.out.println("   B.last()");
    }
}

class C {
    synchronized void baz (A a) {
        String name = Thread.currentThread().getName();
        System.out.println(name + "  C.baz()");
        try{
            Thread.sleep(1000);
        }catch (Exception e) {
            System.out.println("  Exception at C");
        }
        System.out.println(name + "  A.last()");
        a.last();
    }
    synchronized void last() {
        System.out.println("  C.last()");
    }
}

class Deadlock implements Runnable {
    A a = new A();
    B b = new B();
    C c = new C();

    Deadlock() {
        Thread.currentThread().setName(" ");
        Thread t  =new Thread(this, " ");
        t.start();
        a.foo(b);
        b.bar(c);
    }
    public void run() {
        b.bar(c);
        c.baz(a);
    }

    public static void main(String[] args) {
        new Deadlock();
    }
}