package org.example;

public class PrivateAccessOutside {
    private int privateField;

    public int getPrivateField() {
        return privateField;
    }

    public void setPrivateField(int value) {
        privateField = value;
    }
}

 class Automate {
    public static void main(String[] args) {
        PrivateAccessOutside obj = new PrivateAccessOutside();
        obj.setPrivateField(10);
        System.out.println("Initial value of privateField: " + obj.getPrivateField());
        obj.setPrivateField(20);
        System.out.println("Updated value of privateField: " + obj.getPrivateField());
    }
}


