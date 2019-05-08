/*
* source: http://wouter.coekaerts.be
* */


package de.hawh.ld.denksport;

class A {
    public static void main(String[] args) {
        C.run();
    }
    //to avoid the division by zero by the java.lang.Long compare method
    A Long = this;

    int compare(long a, long b) {
        return 123;
    }
    //inner class B to avoid calling the constructor of class B recursively
    class B {
        B(long i) {
        }
    }
}
//to avoid calling the wrong B constructor in main
class C {
    static void run() {
        new B(0L);
    }
}



class B extends A {
    B(Long i) {
        new B(i/Long.compare(i,i));
        System.out.println("Win");
    }
}












