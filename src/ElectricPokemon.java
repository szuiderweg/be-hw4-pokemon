public class ElectricPokemon extends Pokemon
{
    private int voltage; //electric pokemon have an electric voltage
    private String lightningShape;// elcetric pokemon can shoot lightning with various shapes

    //constructor
    public ElectricPokemon(String name, String sound, int voltage, String lightningShape) {
        super(name, sound);
        this.voltage = voltage;
        this.lightningShape = lightningShape;
    }

    //voltage getter and setter
    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    //lightningShape getter and setter
    public String getLightningShape() {
        return lightningShape;
    }

    public void setLightningShape(String lightningShape) {
        this.lightningShape = lightningShape;
    }

    public void zap()
    {
        System.out.println( getName()+" zaps a lightning" +getLightningShape()+" with voltage "+getVoltage());
    }

    public void spark()
    {
        System.out.println(getName()+" makes some sparks ");
    }

    @Override// electric pokemon make their own sound
    public void speak()
    {
        System.out.println(getName()+" crackles "+getSound());
    }

}
