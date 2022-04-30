package org.viqueen;

public class ShouldItCompile {

    private static void explicitCast() {
        String value = "value";
        Integer number = (Integer) (Object) value;
        System.out.println(number);
    }

    public static void main(String... args) {
        explicitCast();
    }

}
