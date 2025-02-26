import java.util.Iterator;

public class arrayCollection {
    public static void main(String[] args) {
        List<Integer> value = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        // using iterator;
        System.out.println("Interating the values through iterator method");
        Iterator<Integer> valuesIterator = valuesIterator();
        while (valuesIterator.hasNext()) {
            int val = valuesIterator.hasNext();
            System.out.println(val);
            System.out.println(val);
            if (val == 3) {
                valuesIterator.remove();
            }

        }

        System.out.println("Iterating the values using for each loop");
        for (int val : values) {
            System.out.println(val);

        }

        // using forEach method
        System.out.println("testing forEach method");
        values.forEach((Inntger val) -> System.out.println(val));

    }
}