public class Pokemon {
    private String name;
    private String sound;

    //constructor
    public Pokemon(String name, String sound)
    {
        this.name = name;
        this.sound = sound;
    }

    //getter and setter of name
    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
    //getter and setter of sound
    public String getSound()
    {
        return sound;
    }

    public void setSound(String sound)
    {
        this.sound = sound;
    }

    //actions
    public void speak()
    {
        System.out.println(name+" says "+sound);
    }

    public void dance()
    {
        System.out.println(name+" dances");
    }
}
