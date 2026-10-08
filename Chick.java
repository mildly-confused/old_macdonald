
/*
* Title of Class: Chick
* Author's Name: Milda Kuciauskas
* Purpose: to be called in order to create a chick object and call accessor methods 
*
* 
*/
public class Chick implements Animal{
private String sound;
private String type;
private String sound2;
private String sound1;


public Chick(String type, String sound1, String sound2) { //pass two sounds, do random method to set
    this.sound1 = sound1;
    this.sound2 = sound2;
   this.type = type;
}

public String getSound() {
    if (Math.random()>0.5){
    sound = sound1;
  }
  else {
   sound = sound2;
  }
    return sound;
}
public String getType() {
    return type;
}

public void setSound(String newSound) {
    sound = newSound;
}
}
