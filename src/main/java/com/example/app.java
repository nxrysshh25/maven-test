package main.java.com.example;

public class app {
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        app obj = new app();
        System.out.println(obj.add(2, 3));
    }
}