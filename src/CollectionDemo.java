import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args){
        String[] things = {"car", "train", "plane", "ship", "motorcycle", "baloon"};
        ArrayList<String> list = new ArrayList<String>();
        for(String x: things){
            list.add(x);
        }
        //List<String> list = Arrays.asList(things);
        System.out.println("The list: ");
        printList(list);
        System.out.println();

        Collections.sort(list);
        System.out.println("The sorted list: ");
        printList(list);
        System.out.println();

        Collections.sort(list, Collections.reverseOrder());
        System.out.println("The reversed list: ");
        printList(list);
        System.out.println();

        String[] a = new String[6];
        List<String> newThings = Arrays.asList(a);
        Collections.copy(newThings, list);
        System.out.println("The copied list: ");
        printList(newThings);
        System.out.println();

        Collections.fill(list, "Yahoo");
        System.out.println("The filled list: ");
        printList(list);
        System.out.println();
    }
    public static void printList(List<String> theList){
        for (String s: theList){
            System.out.print("[" + s + " " + "]");
        }
    }
}
