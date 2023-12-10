public class Main {
    public static void main(String[] args) {
        //create pokemon named Poeki using the pokemon superclass
        Pokemon poekie = new Pokemon("Poeki","poek!");
        //run both methods of the superclass
       poekie.speak();
       poekie.dance();

        System.out.println("~~~~~~~~");
       FirePokemon lucy = new FirePokemon("Lucy", "Woosh!", "red", 12);
        lucy.speak();
        lucy.dance();
       lucy.glow();
       lucy.fireBreath();

        System.out.println("~~~~~~~~");
        WaterPokemon vortex = new WaterPokemon("Vortex", "blub blub blub", 8, "mint flavoured water");
        vortex.speak();
        vortex.dance();
        vortex.swim("forwards");
        vortex.splash();

        System.out.println("~~~~~~~~");
        GrassPokemon verdant = new GrassPokemon("Verdant", "frrr frr frrrrr!", "fern", "Constrict");
        verdant.speak();
        verdant.dance();
        verdant.grow();
        verdant.grassAttack();

        System.out.println("~~~~~~~~");
        ElectricPokemon sparky = new ElectricPokemon("Sparky", " bzzt bzzt!", 30000, "streak");
        sparky.speak();
        sparky.dance();
        sparky.zap();
        sparky.spark();

    }
}
