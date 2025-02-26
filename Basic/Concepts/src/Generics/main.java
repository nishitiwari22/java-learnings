package Generics;

public class main {
    public static void main(String[] args) {
        // ArrayList list = new ArrayList();
        // list.add("Hello");
        // list.add(123);
        // list.add(3.14);

        // String str = (String) list.get(0);
        // String integer = (String) list.get(1);

        // Type is not safe above and we have to manual cast it and no compile time
        // checking

        // Now Generics got introduced
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String s = list.get(0);
        String s1 = list.get(1);

        Box<Intger> box = new Box<>();
        // Box box = new Box();
        box.setValue(1);
        int i = (Integer) box.getValue();
        System.out.println(i);

    }

}
