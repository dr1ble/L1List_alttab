import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        L1List l = new L1List();
        boolean exit = false;
        while (true) {
            String com = sc.nextLine().strip();
            String[] command = com.split(" ");
            String[] command2 = com.split("\\+");
            if(command[0].equals("Run")){
                for(int i = 1; i < command.length; i++){
                    if(command.length == 2)
                        l.insert(command[i]);
                    else
                        l.insert(command[i] + " " + command[++i]);
                }
            }
            else if (command2[0].equals("Alt") && command2[1].equals("Tab")) {
                int count = command2.length - 1;
                for (int i = 0; i < count; i++) {
                    try {
                        l.forward();
                    } catch (Exception e) {
                        l.toFront();
                    }
                }
                try{
                    String m = l.after();
                    l.erase();
                    l.toFront();
                    l.insert(m);
                }
                catch (Exception e){
                    l.toFront();
                }
            }
            else if (command2[0].equals("Alt") && command2[1].equals("Delete")) {
                int count = command2.length - 1;
                for (int i = 0; i < count; i++)
                    try {
                        l.erase();
                    }
                    catch (Exception e ){
                        System.out.println("You already deleted all apps");
                    }
            }
            else if(command[0].equals("q"))
                break;
            try {
                System.out.println(l.after());
            }
            catch (Exception e){
                l.toFront();
                try {
                    System.out.println(l.after());
                }
                catch (Exception f){
                    System.out.println("App list is null");
                }
            }
        }
        System.out.println("\nList of active apps:");
        for(int i = 0; i < l.size(); i++){
            while(!l.empty()) {
                try {
                    System.out.println(l.after());
                    l.erase();
                    l.toFront();
                } catch (Exception e) {
                    l.toFront();
                }
            }
        }
    }
}
