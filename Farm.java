/*
* Title of Class: Farm
* Author's Name: Milda Kuciauskas
* Purpose: to be called in order to create a farm object and call the constructors
*
* Resources:
* Mrs. R's code from the overleaf template
* https://www.w3schools.com/java/java_comments.asp
*/
public class Farm {
 private Animal[] a = new Animal[3];
 Farm() {
  a[0] = new NamedCow("moo", "cow", "charlotte");
  a[1] = new Chick("chick","cluck", "cheep");
  a[2] = new Pig("oink", "pig");
 }
 public void animalSounds() {
   for (int i = 0; i < a.length; i++) {
    System.out.println(a[i].getType() + " goes " + a[i].getSound());
  }
  System.out.println("the cow is known as " +((NamedCow)a[0]).getName());

 }
}
