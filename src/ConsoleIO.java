import java.util.*;
public class ConsoleIO {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the name.");
        System.out.print(">> ");
        String name = sc1.nextLine();

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter the Birthday.(YYYYMMDD)");
        System.out.print(">> ");
        String birth = sc2.nextLine();
        StringBuffer buf = new StringBuffer(birth);
        buf.insert(4, "-");
        buf.insert(7, "-");

        System.out.printf("NAME: %s\nBIRTHDAY: %s", name, buf);
    }
}
