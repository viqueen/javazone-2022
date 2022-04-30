package org.viqueen;

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

    public static void main(String... args) {
        redundantCast();
        explicitCast();
    }

}
