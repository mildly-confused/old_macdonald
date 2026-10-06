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
