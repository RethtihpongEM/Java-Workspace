import java.util.*;
public class Trigonometry {
    static double pi = 3.14159265359;
    public static float sin(float radian){
        return (float)Math.sin(radian);
        /*
         * calculate sin using radian
         */
    }
    public static float sind(int degree){
        /*
         * calculate sin using degree
         */
        return (float)Math.sin((degree*pi)/180);
    }
    public static float cos(float radian){
        /*
         * calculate cos using radian
         */
        return (float)Math.cos(radian);
    }
    public static float cosd(int degree){
        /*
         * calculate cos using degree
         */
        return (float)Math.cos((degree*pi)/180);
    }
    public static float tan(float radian){
        /*
         * calculate tan using radian
         */
        return (float)Math.tan(radian);
    }
    public static float tand(int degree){
        /*
         * calculate tan using degree
         */
        return (float)Math.tan((degree*pi)/180);
    }
    public static long square2(long x){
        /*
         * calculate power of 2 of int
         */
        return (int)x*x;
    }
    public static double square2(double x){
        /*
         * calculate power of 2 of floating-point
         */
        return (float)x*x;
    }
    public static long square3(long x){
        /*
         * calculate power of 3 of int
         */
        return (int)x*x*x;
    }
    public static double square3(double x){
        /*
         * calculate power of 3 of floating-point
         */
        return (float)x*x*x;
    }
    public static double degree2Radian(int degree){
        /*
         * convert degree to radian
         */
        return (degree*pi)/180;
    }
    public static int radian2degree(double radian){
        /*
         * convert radian to degree
         */
        return (int)((radian*180)/pi);
    }
}
