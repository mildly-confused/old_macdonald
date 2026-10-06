public class TestFarm {
    public static void main (String[] args) {
        Cow randy = new Cow("moo", "big cow");
        System.out.println(randy.getType() + " goes "
         + randy.getSound());
        Chick mandy = new Chick("cheep", "little chick"); 
        if (Math.random() > 0.5) {
            //Chick mandy = new Chick("cluck", "old chick");
            mandy.setSound("cluck");
        }
        System.out.println(mandy.getType() + " goes " + 
        mandy.getSound()); 
        Pig andy = new Pig("oink", "big pig");
        System.out.println(andy.getType() + " goes " + 
        andy.getSound());
    }
}
