package kr.co.bitcamp.classs;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionTest {

    public static void main(String[] args) throws Exception {
        
        Class class1 = Class.forName("java.lang.String");
        
        System.out.println("[생성자 정보]");
        Constructor[] constructors = class1.getDeclaredConstructors();
        
        for(Constructor constructor : constructors) {
            System.out.print(constructor.getName() + "(");
            // 생성자의 매개변수의 타입정보 얻기
            Class[] param = constructor.getParameterTypes();
            for(int i=0; i<param.length; i++) {
                System.out.print(param[i].getSimpleName());
                if(i<(param.length-1)) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
        
        System.out.println();
        
        // 필드를 표시        
        System.out.println("[필드 정보]");
        Field[] fields = class1.getDeclaredFields();
        for(Field field : fields) {
            System.out.println(field.getType().getSimpleName() + " " + field.getName());
        }
        
        System.out.println();
        
        // 메서드 정보        
        System.out.println("[메서드 정보]");
        Method[] methods = class1.getDeclaredMethods();
        for(Method method : methods) {
            System.out.print(method.getReturnType().getSimpleName() + " ");
            System.out.print(method.getName() + "(");
            Class[] class2 = method.getParameterTypes();
            for(int i=0; i<class2.length; i++) {
                System.out.print(class2[i].getSimpleName());
                if(i<(class2.length-1)) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }       

    }
}



















