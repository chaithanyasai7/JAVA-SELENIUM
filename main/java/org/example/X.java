package org.example;

class X {
    void search() {
        System.out.println("Parent's search method");
    }
}
class Y extends X {
    void search2()
    {
        search();
    }
    public static void main(String[] args) {
        Y y = new Y();
        y.search2();
    }
}



