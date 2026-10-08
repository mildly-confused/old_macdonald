/*
* Title of Class: Cow
* Author's Name: Milda Kuciauskas
* Purpose: to be called in order to create a cow object and call accessor methods 
*
* 
*/
public class Cow implements Animal {
    public String sound;
    public String type;
    public Cow(String sound, String type) {
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
