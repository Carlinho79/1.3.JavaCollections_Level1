package Level1.Exercise2.Model;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListManager {
    private List<Integer> list1;
    private List<Integer> list2;

    public ListManager() {
    }


    public void listCreator() {
        //Creating the first list and filling it with given random numbers
        list1 = new ArrayList<>();
        list1.add(100);
        list1.add(27);
        list1.add(3);
        list1.add(49);
        list1.add(586);

        //Printing the original list
        System.out.println("\n📋 ORIGINAL LIST");
        System.out.println("----------------");
        for (int num : list1) {
            System.out.println("• " + num);
        }


        //Creating the second list, void at the beginning
        list2 = new ArrayList<>();


        //Creating a ListIterator that starts at the end of the first list
        ListIterator<Integer> iterator = list1.listIterator(list1.size());

        //Iterate through the first list in reverse order and add each element to the second list
        while (iterator.hasPrevious()) {
            list2.add(iterator.previous());
        }

        //Printing the reversed list
        System.out.println("\n🔁 REVERSED LIST");
        System.out.println("----------------");
        for (int num : list2) {
            System.out.println("• " + num);
        }

        System.out.println("\n✅ Process completed successfully.");
    }
}
