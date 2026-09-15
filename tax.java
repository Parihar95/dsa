import java.util.Scanner;

public class tax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you to get gst");
        float num=sc.nextInt();
        float gst=(float)num+(0.18f*num);
        System.out.println("final price is calculated " + gst);
    }
    
}