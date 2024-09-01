import java.util.ArrayList;
import java.util.Scanner;

class MobilePhone{
    String brand, model ;
    int price, storageCapacity;

    MobilePhone(String brand, String model, int storageCapacity, int price){
        this.brand = brand;
        this.model = model;
        this.storageCapacity = storageCapacity;
        this.price = price;

    }
}
class MobileShop{
    ArrayList<MobilePhone> mobiles = new ArrayList<>();

    void add(MobilePhone obj){
        mobiles.add(obj);
    }
    void details(){
        for (MobilePhone mobile : mobiles){
            System.out.println("Brand: "+mobile.brand);
            System.out.println("Model: "+mobile.model);
            System.out.println("Storage: "+mobile.storageCapacity+"gb");
            System.out.println("Price: "+mobile.price);
        }
    }
    void highStorage(){
        int storage = 0;
        for (MobilePhone mobile : mobiles){
           if (mobile.storageCapacity>storage){
               storage=mobile.storageCapacity;
           }
        }
        for (MobilePhone mobile : mobiles){
            if (storage==mobile.storageCapacity){
                System.out.println("Brand: "+mobile.brand);
                System.out.println("Model: "+mobile.model);
                System.out.println("Storage: "+mobile.storageCapacity+"gb");
                System.out.println("Price: "+mobile.price);
            }
        }
    }
    void compare(MobilePhone obj1, MobilePhone obj2){
        if (obj1.price>obj2.price){
            System.out.println("Greater Price");
            System.out.println("Brand: "+obj1.brand);
            System.out.println("Model: "+obj1.model);
            System.out.println("Storage: "+obj1.storageCapacity+"gb");
            System.out.println("Price: "+obj1.price);
            System.out.println("Lower Price");
            System.out.println("Brand: "+obj2.brand);
            System.out.println("Model: "+obj2.model);
            System.out.println("Storage: "+obj2.storageCapacity+"gb");
            System.out.println("Price: "+obj2.price);
        } else if (obj1.price<obj2.price) {
            System.out.println("Greater Price");
            System.out.println("Brand: "+obj2.brand);
            System.out.println("Model: "+obj2.model);
            System.out.println("Storage: "+obj2.storageCapacity+"gb");
            System.out.println("Price: "+obj2.price);
            System.out.println("Lower Price");
            System.out.println("Brand: "+obj1.brand);
            System.out.println("Model: "+obj1.model);
            System.out.println("Storage: "+obj1.storageCapacity+"gb");
            System.out.println("Price: "+obj1.price);
        }else {
            System.out.println("Price Equal");
        }
    }
    void storage(int storage){
        for (MobilePhone mobile : mobiles){
            if (mobile.storageCapacity==storage){
                System.out.println("Brand: "+mobile.brand);
                System.out.println("Model: "+mobile.model);
                System.out.println("Storage: "+mobile.storageCapacity+"gb");
                System.out.println("Price: "+mobile.price);
                return;
            }
        }
        System.out.println("Storage not match");
    }
}

public class MobileInformation {
    public static void main(String[] args) {
        System.out.println("Mobile Shop");
        MobileShop mobileshop = new MobileShop();
        Scanner useend = new Scanner(System.in);
        String end;
        do {
            System.out.println("Select Option: ");
            System.out.println("a) Add Mobile");
            System.out.println("b) Mobiles Details");
            System.out.println("c) Mobile (High Storage)");
            System.out.println("d) Compare Mobile prizes");
            System.out.println("e) Give Storage and match mobile");
            System.out.print("a/b/c/d/e ? ");
            Scanner user = new Scanner(System.in);
            String userchoose = user.next().toLowerCase();

            switch (userchoose){
                case "a":
                    Scanner userDetails = new Scanner(System.in);
                    System.out.print("Brand: ");
                    String userbrand = userDetails.nextLine();
                    System.out.print("Model: ");
                    String usermodel = userDetails.nextLine();
                    System.out.print("Storage Capacity: ");
                    int availableStorage = userDetails.nextInt();
                    System.out.print("Price: ");
                    int userprice = userDetails.nextInt();
                    MobilePhone mobile = new MobilePhone(userbrand,usermodel,availableStorage,userprice);
                    mobileshop.add(mobile);
                    break;
                case "b":
                    mobileshop.details();
                    break;
                case "c":
                    mobileshop.highStorage();
                    break;
                case "d":
                    Scanner userDetails1 = new Scanner(System.in);
                    System.out.print("Brand: ");
                    String userbrand1 = userDetails1.nextLine();
                    System.out.print("Model: ");
                    String usermodel1 = userDetails1.nextLine();
                    System.out.print("Storage Capacity: ");
                    int availableStorage1 = userDetails1.nextInt();
                    System.out.print("Price: ");
                    int userprice1 = userDetails1.nextInt();
                    MobilePhone mobile1 = new MobilePhone(userbrand1,usermodel1,availableStorage1,userprice1);
                    Scanner userDetails2 = new Scanner(System.in);
                    System.out.print("Brand: ");
                    String userbrand2 = userDetails2.nextLine();
                    System.out.print("Model: ");
                    String usermodel2 = userDetails2.nextLine();
                    System.out.print("Storage Capacity: ");
                    int availableStorage2 = userDetails2.nextInt();
                    System.out.print("Price: ");
                    int userprice2 = userDetails2.nextInt();
                    MobilePhone mobile2 = new MobilePhone(userbrand2,usermodel2,availableStorage2,userprice2);
                    mobileshop.compare(mobile1,mobile2);
                    break;
                case "e":
                    Scanner userdatails3 = new Scanner(System.in);
                    System.out.print("Storage: ");
                    int storageuser = userdatails3.nextInt();
                    mobileshop.storage(storageuser);
                    break;
                default:
                    System.out.println("Invalid Command");
            }
            System.out.print("want to continue (y or n): ");
            end = useend.nextLine();

        }while (end.equals("y"));

    }
}
