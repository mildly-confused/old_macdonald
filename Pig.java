/*
* Title of Class: Pig
* Author's Name: Milda Kuciauskas
* Purpose: to be called in order to create a pig object and call accessor methods 
*
* 
*/
public class Pig implements Animal {
private String sound;
private String type;
 public Pig(String sound, String type){
    this.sound = sound;
    this.type = type;
 }
 public String getSound() {
    return sound;
}
public String getType() {
    return type;
}
}
