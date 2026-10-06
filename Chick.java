public class Chick implements Animal{
private String sound;
private String type;
private String newSound;


public Chick(String sound, String type) {
   this.sound = sound;
    this.type = type;
}

public String getSound() {
    return sound;
}
public String getType() {
    return type;
}
public void setSound(String newSound) {
    sound = newSound;
}
}
