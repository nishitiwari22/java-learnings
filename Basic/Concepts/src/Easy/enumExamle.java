public class enumExamle {
    enum Week {
        Monday, Tuesday, Wednesday, Thursady, Friday, Saturday, Sunday
        // these are enum constants
        // public, static and final
        // since its final you can create child enums
        // type is week
    

    Week(){
        System.out.println("Constrctor called for " + this.toString());
    }

    //this is not public or protected, only private or default
    // why? we don't want to create new objects 
    // this is not the enum concept, thats why!

    //internally: public static final week monday = new week();

    //All the snume explicitly extend java.lang.enum.class 
    //Enum can implement as many interface as you want. 

}

    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        System.out.println(Week.valueOf("Monday"));
        for (Week day : Week.values()) {
            System.out.println(day);
        }
        System.out.println(week.ordinal());
}
