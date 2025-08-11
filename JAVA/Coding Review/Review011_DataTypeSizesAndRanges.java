public class Review011_DataTypeSizesAndRanges {
    public static void main(String[] args){
        short number = 32767;

        System.out.println("ALl Primitive Data Types");
        System.out.println("byte:    " + Byte.SIZE + " bits   | " + (Byte.SIZE / 8) + " bytes | " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("char:   " + Character.SIZE + " bits   | " + (Character.SIZE / 8) + " bytes | " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        System.out.println("short:  " + Short.SIZE + " bits   | " + (Short.SIZE / 8) + " bytes | " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("float:  " + Float.SIZE + " bits   | " + (Float.SIZE / 8) + " bytes | " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("int:    " + Integer.SIZE + " bits   | " + (Integer.SIZE / 8) + " bytes | " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("double: " + Double.SIZE + " bits   | " + (Double.SIZE / 8) + " bytes | " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("long:   " + Long.SIZE + " bits   | " + (Long.SIZE / 8) + " bytes | " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
    }
}
