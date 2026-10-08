/*
* Title of Class: TestFarm
* Author's Name: Milda Kuciauskas
* Purpose: to be called in order to create a TestFarm object and call accessor methods 
*
* 
*/
public class TestFarm { //replace with stick note code
    public static void main (String[] args) {
      /*   Cow randy = new Cow("moo", "big cow");
        System.out.println(randy.getType() + " goes "
         + randy.getSound());
        Chick mandy = new Chick("cheep", "little chick"); 
        if (Math.random() > 0.5) {
            mandy.setSound("cluck");
        }
        System.out.println(mandy.getType() + " goes " + 
        mandy.getSound()); 
        Pig andy = new Pig("oink", "big pig");
        System.out.println(andy.getType() + " goes " + 
        andy.getSound());
        */
       Farm bigfarm = new Farm();
       bigfarm.animalSounds();
    }
}
