public class GrassPokemon extends Pokemon
{
    private String plantType;//grass pokemon are based on a certain plant
    private String plantAttack;// grass pokemon have a plant-themed attack. example; sharp leaves, poison

    //grassPokemon constructor
    public GrassPokemon(String name, String sound, String plantType, String plantAttack) {
        super(name, sound);
        this.plantType = plantType;
        this.plantAttack = plantAttack;
    }

    //plantType getter and setter
    public String getPlantType()
    {
        return plantType;
    }

    public void setPlantType(String plantType)
    {
        this.plantType = plantType;
    }

    //plantAttack getter and setter
    public String getPlantAttack() {
        return plantAttack;
    }

    public void setPlantAttack(String plantAttack) {
        this.plantAttack = plantAttack;
    }

    public void grow()
    {
        System.out.println(getName()+"grows a nice "+ getPlantType());
    }

    public void grassAttack()
    {
        System.out.println("watch out!"+ getName()+" attacks with"+getPlantAttack() );
    }
    @Override// grass pokemon make their own sound
    public void speak()
    {
        System.out.println(getName()+" rustles "+getSound());
    }
}
