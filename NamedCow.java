/*
* Title of Class: NamedCow
* Author's Name: Milda Kuciauskas
* Purpose: to be called in order to create a named cow object and call accessor methods 
* Resources: https://codehs.com/textbook/apcsa_textbook/9.2
* 
*/
public class NamedCow extends Cow {
    private String name;
public NamedCow (String sound, String type, String name) { 
    super (sound, type);
    this.name = name;
}
public String getName() {
    return name;
}
}
