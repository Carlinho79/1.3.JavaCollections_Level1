package Level1.Exercise1.App;

import java.util.*;
import Level1.Exercise1.Model.Month;

public class Main {
    public static void main(String[] args) {

        System.out.println("DEMO WITH ARRAYLIST (keep order but allows duplication):");
        System.out.println("-------------------------------");

        // Create an ArrayList with 11 months (without "August")
        List<Month> months = new ArrayList<>();
        months.add(new Month("January"));
        months.add(new Month("February"));
        months.add(new Month("March"));
        months.add(new Month("April"));
        months.add(new Month("May"));
        months.add(new Month("June"));
        months.add(new Month("July"));
        months.add(new Month("September"));
        months.add(new Month("October"));
        months.add(new Month("November"));
        months.add(new Month("December"));

        System.out.println("Months without August (iteration with iterator):");
        Iterator<Month> it = months.iterator();
        while (it.hasNext()) {
            System.out.println(it.next().getName());
        }

        // Insert "August" at the correct position and add a duplicate
        months.add(7, new Month("August")); // Index 7 = position 8
        months.add(7, new Month("August")); // Duplicate for demonstration

        System.out.println("\nMonths with August in right position and duplicated:");
        for (Month month : months) {
            System.out.println(month.getName());
        }

        // Convert the list to different Set types to demonstrate their behaviors
        System.out.println("\n--- DEMO WITH DIFFERENT SET TYPES ---");
        showSet(new HashSet<>(months), "HashSet (unordered, no duplicates)");
        showSet(new LinkedHashSet<>(months), "LinkedHashSet (keeps insertion order)");
        showSet(new TreeSet<>(months), "TreeSet (sorted alphabetically)");

        System.out.println("\nEXTRA DEMO: REMOVING DUPLICATED ELEMENTS WITH ITERATOR (in ArrayList):");
        System.out.println("-------------------------------");

        // Remove duplicates using an iterator
        Iterator<Month> i = months.iterator();
        List<String> seen = new ArrayList<>();

        while (i.hasNext()) {
            Month m = i.next();
            if (seen.contains(m.getName())) {
                i.remove(); // Remove duplicate safely
            } else {
                seen.add(m.getName());
            }
        }

        System.out.println("Final list complete and without duplication:");
        months.forEach(m -> System.out.println(m.getName()));
    }

    // Helper method to show different Set behaviors
    private static void showSet(Set<Month> set, String description) {
        System.out.println("\n" + description + ":");
        set.forEach(m -> System.out.println(m.getName()));
    }
}
