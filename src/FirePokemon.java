public class FirePokemon extends Pokemon
{
    private String flameColor;//flames produced by fire pokemon can have various colors
    private int illumination;//a measure of the light a fire pokemon's flames spread

    //constructor
    public FirePokemon(String name, String sound, String flameColor, int illumination) {
        super(name, sound);
        this.flameColor = flameColor;
        this.illumination = illumination;
    }
    //flame color getter and setter
    public String getFlameColor() {
        return flameColor;
    }

    public void setFlameColor(String flameColor) {
        this.flameColor = flameColor;
    }
//illumination level getter and setter
    public int getIllumination() {
        return illumination;
    }

    public void setIllumination(int illumination) {
        this.illumination = illumination;
    }

    public void fireBreath()// special firepower
    {
        System.out.println(getName() + " breaths "+getFlameColor()+" fire");
    }

    public void glow()// another special firepower
    {
        System.out.println(getName()+ " glows a pretty " +getFlameColor()+" light with power " +getIllumination());
    }

    @Override// fire pokemon make their own sound
    public void speak()
    {
        System.out.println(getName()+" roars "+getSound());
    }


}
