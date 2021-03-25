package kr.co.bitcamp.inheritance01;

public class MountainBicycle extends Bicycle {
    
    // 멤버 개수 : 5개
    String frame;
    int gear;
    int price;
    String sector;
    
    public void print() {
        System.out.println("id : " + this.id);
        System.out.println("brand : " + this.brand);
        System.out.println("frame : " + this.frame);
        System.out.println("gear: " + this.gear);
        System.out.println("price : " + this.price);
    }
    
    public static void main(String[] args) {
        MountainBicycle mBicycls = new MountainBicycle();
        mBicycls.id = 1111;
        mBicycls.brand = "LESPO";
        mBicycls.frame = "알루미늄";
        mBicycls.gear = 33;
        mBicycls.price = 300000;
        mBicycls.owner = "이방원";
        
        mBicycls.print();
        
    }

}
