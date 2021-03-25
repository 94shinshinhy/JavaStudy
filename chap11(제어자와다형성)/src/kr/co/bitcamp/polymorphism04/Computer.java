package kr.co.bitcamp.polymorphism04;

public class Computer extends Product {
    
    public Computer() {
        super(200);
    }
    
    @Override
    public String toString() {
        return "Computer";
    }
}
