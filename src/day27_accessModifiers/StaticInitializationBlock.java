package day27_accessModifiers;

public class StaticInitializationBlock {
    public static int a;
    public static double b;
    public static String c;
    //public static ExcelSheet sheet;

    static{ //3-4 lines of code needed to get the Excel file, read the file and get the sheet, so we need static block for this
        //can be called and used by other classes (call by className) but if the values assigned in constructor or main method then
        //it won't be used/called in other class, so we need initialization static block for that
        a=100;
        b=20.5;
        c="Java";
    }



}
