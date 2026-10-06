public class NamedCow extends Cow {
    //private String name;
public NamedCow (String name) { //how will this be called without making a specific named cow object?
    //super (sound, type);
    super(name, type);
    this.name = name;
}
public String getName() {
    return name;
}
}
