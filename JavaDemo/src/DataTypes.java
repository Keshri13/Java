public class DataTypes {

    boolean booleanVar;

    char charVar;

    double doubleVar;
    float floatVar;

    long longVar;
    int intVar;
    short shortVar;
    byte byteVar;

    public DataTypes() {
        System.out.println("Boolean default : " + booleanVar );

        System.out.println("Char default : " + charVar);

        System.out.println("Double default : " + doubleVar);
        System.out.println("Float default : " + floatVar);

        System.out.println("Long default : " + longVar);
        System.out.println("Int default : " + intVar);
        System.out.println("Short default : " + shortVar);
        System.out.println("Byte default : " + byteVar);
    }

    public DataTypes(boolean booleanVar, char charVar, double doubleVar, float floatVar, long longVar, int intVar,
            short shortVar, byte byteVar) {
        this.booleanVar = booleanVar;
        this.charVar = charVar;
        this.doubleVar = doubleVar;
        this.floatVar = floatVar;
        this.longVar = longVar;
        this.intVar = intVar;
        this.shortVar = shortVar;
        this.byteVar = byteVar;
    }

    public static void printX() {
        System.out.println("Keshri Nandan staring again fresh with ASCII Values");
        for (int i = 0; i <= 255; i++) {
            //System.out.println(" The ASCII value of " + (char) i + "  =  " + i);
        }

        int inta = 0b101;
        int intb = 0x7E;
        int intc = 1_00_00_000;
        double d = 10e10 ;
        
        System.out.println("System.out.println(\"int inta = 0b101;   \"+ inta);   "+ inta);
        System.out.println("System.out.println(\"int intb = 0x7E;    \"+ intb);    "+ intb);
        System.out.println("System.out.println(\"int intc = 1_00_00_000;   \"+ intc);   "+ intc);
        System.out.println("System.out.println(\"double d = 10e10;   \"+ d);   "+ d);

    }



}