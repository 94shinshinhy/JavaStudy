package kr.co.bitcamp.overriding01;

public class HddTest {

    public static void main(String[] args) {
        
        HddDisk hddDisk = new HddDisk(500, 7200);
        System.out.println("HDD 상세");
        System.out.println(hddDisk.status());
        
        System.out.println("USB 상세");
        UsbMemory usb = new UsbMemory(30, 100);
        System.out.println(usb.status());
        
        System.out.println(usb.status(777));
        
    }

}
