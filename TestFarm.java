public class TestFarm {
    public static void main (String[] args) {
        Cow randy = new Cow("moo", "big cow");
        System.out.println(randy.getType() + " goes "
         + randy.getSound());
        Chick mandy = new Chick("cheep", "little chick"); //how to randomize??
        System.out.println(mandy.getType() + " goes " + 
        mandy.getSound()); 
        Pig andy = new Pig("oink", "big pig");
        System.out.println(andy.getType() + " goes " + 
        andy.getSound());
    }
}
