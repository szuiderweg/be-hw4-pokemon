//bonus 1 & 2: changed Pokemon class into an abstract class.  the speak-method is also made abstract.
public abstract class Pokemon
{
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
        System.out.println(getName()+" says "+getSound());
    }

    public abstract void dance();//bonus 2: implement an abstract method
//    {
//        System.out.println(getName()+" dances a cute little dance");
//    }
}
