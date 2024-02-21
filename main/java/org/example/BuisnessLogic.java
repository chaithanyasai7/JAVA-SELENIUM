
package org.example;
abstract class BusinessLogic {

    public abstract void performOperation();
}


class BusinessLogicImplementation1 extends BusinessLogic {
    @Override
    public void performOperation() {

        System.out.println("Performing operation for subclass 1");
    }
}


class BusinessLogicImplementation2 extends BusinessLogic {
    @Override
    public void performOperation() {

        System.out.println("Performing operation for subclass 2");
    }



    public static void main(String[] args) {

        BusinessLogicImplementation1 implementation1 = new BusinessLogicImplementation1();
        BusinessLogicImplementation2 implementation2 = new BusinessLogicImplementation2();
        implementation1.performOperation();
        implementation2.performOperation();
    }
}

