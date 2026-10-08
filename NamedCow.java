public class NamedCow extends Cow {
    private String name;
public NamedCow (String sound, String type, String name) { //how will this be called without making a specific named cow object?
    super (sound, type);
    this.name = name;
}
public String getName() {
    return name;
}
}
