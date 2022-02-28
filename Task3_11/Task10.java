package Task3_11;

public class Task10 {

    public static void main(String[] args) {
        //a and b are sides of first house
        //c and d are sides of second house
        //e and f are sides of land
        double a, b, c, d, e, f;
        a = 5; b = 2;
        c = 2.1; d = 4;
        e = 5.4; f = 3;

        if(f>=(b+d) & e>=a & e>=c)
            System.out.println("Houses can be placed in this land");
        else if(f>=(b+c) & e>=a & e>=d)
            System.out.println("Houses can be placed in this land");
        else if(f>=(a+d) & e>=b & e>=c)
            System.out.println("Houses can be placed in this land");
        else if(f>=(a+c) & e>=b & e>=d)
            System.out.println("Houses can be placed in this land");
        else if(e>=(a+c) & f>=b & f>=d)
            System.out.println("Houses can be placed in this land");
        else if(e>=(a+d) & f>=b & f>=c)
            System.out.println("Houses can be placed in this land");
        else if(e>=(b+c) & f>=a & f>=d)
            System.out.println("Houses can be placed in this land");
        else if(e>=(b+d) & f>=a & f>=c)
            System.out.println("Houses can be placed in this land");
        else
            System.out.println("Houses can't be placed in this land");
    }
}
