package kr.co.bitcamp.variable;

public class Variable02 {

    public static void main(String[] args) {
        
        System.out.println(Byte.BYTES); // 바이트 계산
        System.out.println(Byte.SIZE); // 비트 계산
        System.out.println(Short.BYTES);
        System.out.println(Short.SIZE);
        System.out.println();
        
        // byte, short, int, long
        System.out.println("byte :\t " + Byte.BYTES + "(바이트)" + " --> " + Byte.SIZE + "(비트)\t" + Byte.MAX_VALUE + " ~ " + Byte.MIN_VALUE);
        System.out.println("short :\t " + Short.BYTES + "(바이트)" + " --> " + Short.SIZE + "(비트)\t" + Short.MAX_VALUE + " ~ " + Short.MIN_VALUE);
        System.out.println("int :\t " + Integer.BYTES + "(바이트)" + " --> " + Integer.SIZE + "(비트)\t" + Integer.MAX_VALUE + " ~ " + Integer.MIN_VALUE);
        System.out.println("long :\t " + Long.BYTES + "(바이트)" + " --> " + Long.SIZE + "(비트)\t" + Long.MAX_VALUE + " ~ " + Long.MIN_VALUE);
        System.out.println("char :\t " + Character.BYTES + "(바이트)" + " --> " + Character.SIZE + "(비트)\t" + (int)Character.MAX_VALUE + " ~ " + (int)Character.MIN_VALUE);
        
    }
    
}



















