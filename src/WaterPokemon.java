public class WaterPokemon extends Pokemon
{
    private int swimSpeed;//all waterpokemon can swim
    private String liquid; //a waterpokemon has a type of liquid. for example: water, ice, acid, poison, coffee

    public WaterPokemon(String name, String sound, int swimSpeed, String liquid) {
        super(name, sound);
        this.swimSpeed= swimSpeed;
        this.liquid = liquid;
    }
    //getter and setter of swimSpeed
    public int getSwimSpeed() {
        return swimSpeed;
    }

    public void setSwimSpeed(int swimSpeed) {
        this.swimSpeed= WaterPokemon.this.swimSpeed;
    }

    //getter of setter of liquid

    public String getLiquid() {
        return liquid;
    }

    public void setLiquid(String liquid) {
        this.liquid = liquid;
    }

    public void swim(String direction)//waterpokemons can swim
    {
        System.out.println(getName()+" swims "+getSwimSpeed()+" meters "+direction );
    }

    public void splash()
    {
        System.out.println(getName()+ " shoots a splash of "+getLiquid());
    }

    @Override //water pokemon make their own sound
    public void speak() {
        System.out.println(getName()+" bubbles "+getSound());
    }

    public void dance()
    {
        System.out.println(getName()+" dances a flowy dance");
    }
}
