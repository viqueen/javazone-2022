package org.viqueen;

import java.util.UUID;

public class ShouldItCompile {

    private static void redundantCast() {
        String value = "value";
        String data = (String) value;
        System.out.println(data);
    }

    private static void explicitCast() {
        String value = "value";
        Integer number = (Integer) (Object) value;
        System.out.println(number);
    }

    private static Object erasedReturnType() {
        return UUID.randomUUID().toString();
    }

    private static void uncheckedCast() {
        Integer number = (Integer) erasedReturnType();
        System.out.println(number);
    }

    public static void main(String... args) {
        redundantCast();
        explicitCast();
        uncheckedCast();
    }

}
