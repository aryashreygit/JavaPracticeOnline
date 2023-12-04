package PavanClasses.PavanYTAssignments;

public class SwapNumbers01 {
    public static void main (String[] args){
        int a=10;
        int b=20;
        int c;

        c=((b+a)/2 + (b-a)/2);
        b=((b+a)/2 - (b-a)/2);

        a=c;

        System.out.println(a);
        System.out.println(b);

    }
}
