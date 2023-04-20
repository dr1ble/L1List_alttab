//import java.util.Scanner;
//
//public class A29 {
//    public static void main(String[] args) throws Exception {
//        L1List L = new L1List();
//        Scanner in = new Scanner(System.in);
//        int t = 0;
//
//
//        while (true) {
//            String s = in.nextLine();
//
//            if (s.contains("Run ")){
//                L.insert(s.replace("Run ", ""));
//            }
//            if(s.contains("Tab")){
//                t = s.length( )- s.replace("+Tab","").length();
////System.out.println(t);
//                for (int i = 0; i<t/4x; i++){
////System.out.println("1");
//                    try {
//                        L.forward();
//
//                    }
//                    catch (Exception e){
//                        L.toFront();
//                    }
//                    try {
//                        String k = L.after();
//                        L.erase();
//                        L.insert(k);
//                    }
//                    catch (Exception e){
//                        L.toFront();
//                    }
//
//
//
//                }
//
//            }
//            if(s.contains("Delete")){
//                L.erase();
//                continue;
//            }
//            try {
//                System.out.println(L.after());
//            }
//            catch (Exception e){
//                L.toFront();
//                System.out.println(L.after());
//            }
//
//        }
//
//    }
//}
//
