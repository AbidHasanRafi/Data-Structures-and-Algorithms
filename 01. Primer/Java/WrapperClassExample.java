public class WrapperClassExample {
    public static void main(String[] args) {
        // boolean
        Boolean booleanObj = new Boolean(true);
        System.out.println("Boolean value: " + booleanObj.booleanValue());

        // char
        Character charObj = new Character('Z');
        System.out.println("Character value: " + charObj.charValue());

        // byte
        Byte byteObj = new Byte((byte) 34);
        System.out.println("Byte value: " + byteObj.byteValue());

        // short
        Short shortObj = new Short((short) 100);
        System.out.println("Short value: " + shortObj.shortValue());

        // int
        Integer intObj = new Integer(1045);
        System.out.println("Integer value: " + intObj.intValue());

        // long
        Long longObj = new Long(10849L);
        System.out.println("Long value: " + longObj.longValue());

        // float
        Float floatObj = new Float(3.934F);
        System.out.println("Float value: " + floatObj.floatValue());

        // double
        Double doubleObj = new Double(3.934);
        System.out.println("Double value: " + doubleObj.doubleValue());
    }
}