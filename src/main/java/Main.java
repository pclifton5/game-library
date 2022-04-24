import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    //Fields for main here
    private static Scanner scan = new Scanner(System.in);
    private static Set<String> libraryList = new HashSet<>();

    public static void main(String[] args){
        //Library intro first
        System.out.println(intro());

        //Options for viewing, editing, or exit

        while(true){
            System.out.println(menu());
            Scanner scan = new Scanner(System.in);
            int input = scan.nextInt();
            switch (input){
                case 1:
                    libraryList();
                    break;
                case 2:
                    addGame();
                    break;
                case 3:
                    System.out.println("Thank for using your Game Library!");
                    System.exit(0);
                default:
                    break;
            }
        }


    }

    public static String menu(){
        return "Please select an option: \n"+
                "1. View Library \n" +
                "2. Edit Library \n" +
                "3. Exit";
    }

    public static String intro(){
        return "Welcome to your Game Library\n";
    }

    //library inventory list method() here
    public static void libraryList(){
        System.out.println(libraryList);
    }

    //Add/Remove/Edit games method() here
    public static void addGame(){
        System.out.println("Please enter game you want to add:");
        String gameName = scan.nextLine();
        scan.nextLine();

        if (libraryList.add(gameName)){
            System.out.println("Game added! \n"+
                    libraryList);
        } else {
            System.out.println("This game is already in your Library. \n"+
                    libraryList);
        }
    }

    // Exit Library method() here
}
