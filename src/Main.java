
public class Main {

    /**main(String[] args)
     * @return: Demonstrates the functionality of the RPG system by creating instances, equipping weapons, and performing attacks.
     * @return: Prints information to the console but does not modify the state.
     * effects: Prints information to the console.
     * effects: Invokes methods on various character instances.
     */
    public static void main(String[] args) {
        Character SCK = new Warrior("SCKagura", "Warrior");
        Sword sword = new Sword();
        SCK.showStats();
        Daggers daggers = new Daggers();
        SCK.EquipWeapon(daggers);
        SCK.EquipWeapon(sword);
        SCK.showStats();

        Character DUMMY = new Warrior("Dummy", "Warrior");

        SCK.attack(DUMMY);
        DUMMY.showStats();


        Character assassin = new Assasin("Assassin1", "Assassin");
        Sword assassinSword = new Sword();
        assassin.EquipWeapon(assassinSword);
        assassin.showStats();

        Character assassinTarget = new Assasin("AssassinTarget", "Assassin");
        assassin.attack(assassinTarget);
        assassinTarget.showStats();
    }

}

