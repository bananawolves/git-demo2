package it.heima.Test4;

public class Test {
    public static void main(String[] args) {
        Fork fork=new Fork();
        new infant("0",fork).start();
        new infant("1",fork).start();
        new infant("2",fork).start();
        new infant("3",fork).start();
        new infant("4",fork).start();
    }
}
