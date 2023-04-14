import java.util.Scanner;

public class Custumer extends Order{

    private String namE;
    private String addresStreet;


    Scanner scanner = new Scanner(System.in);

    public void serchOrders() {
        System.out.println("Enter name orders");
        namE = scanner.nextLine();
        System.out.println("Enter address street and home number");
        addresStreet = scanner.nextLine();

        if (namE.equals(getName())) {
            if (addresStreet.equals(getStreet())){
                System.out.println("Enter home number");
                int numbHome = scanner.nextInt();
                if (numbHome == getHomeNumber()){
                    System.out.println("customer found");
                    System.out.println(getName());
                    System.out.println(getWeight());
                    System.out.println(getStreet() + " " + getHomeNumber());
                }else {
                    System.out.println("customer not found");
                    System.exit(2);
                }
            }else {
                System.out.println("customer not found");
                System.exit(2);
            }
        } else {
            System.out.println("customer not found");
            System.exit(2);
        }


    }

}
