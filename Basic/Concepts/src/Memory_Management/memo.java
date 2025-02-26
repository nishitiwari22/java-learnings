public class memo {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        int primitiveVariabl1 = 10;
        Person personObj = new Person();
        String stringLiteral = "24";
        MemoryManagement memObj = new MemoryManagement();
        memObj.MemoryManagementTest(personObj);

        // System.out.println("Hello, World!");
    }

    private void MemoryManagementTest(Person personObj) {
        Person personObj2 = personObj;
        String stringLiteral2 = "24";
        String stringLiteral3 = new String("24");

    }

}
