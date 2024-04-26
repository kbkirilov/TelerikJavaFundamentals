public class ConcatenatePrimitives {
    public static void main(String[] args){
        byte byteType = 3;
        short shortType = 1;
        int intType = 0;
        float floatType = 2.0f;
        char charH = 72;
        char charW = 119;
        char charR = 114;
        char charD = 100;
        boolean booleanType = true;

        String result = "" + charH +
                byteType +
                shortType +
                shortType +
                intType +
                " " +
                "" + charW +
                intType +
                "" + charR +
                shortType +
                "" + charD +
                " " + floatType +
                " " + booleanType;

        System.out.println(result);
    }
}
