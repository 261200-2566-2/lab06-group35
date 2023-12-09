public class Assasin implements  Character{
    protected String Name;
    protected String Role ;
    protected int Level;
    protected double HP;
    protected double MaxHP;
    protected double Mana;
    protected double MaxMana;
    protected double Defense;
    protected double Base_RunSpeed;
    protected double Max_RunSpeed ;
    protected double Base_Damege ;
    protected double Max_Damege ;
    protected Weapons weapon;




    /**Assasin
     * @requires: Name and Role are non-null strings.
     * @return: Initializes an Assasin object with the provided Name and Role.
     * Sets default values for various attributes (e.g., Level, HP, Mana).
     * Prints a welcome message.
     */
    Assasin (String Name,String Role){
        this.Name= Name ;
        this.Role = Role ;
        Level = 1 ;
        HP = 100 ;
        MaxHP = 100 ;
        Mana = 100 ;
        MaxMana = 100 ;
        Defense = 0 ;
        Base_RunSpeed = 10 ;
        Max_RunSpeed =  10 ;
        Base_Damege = 0 ;
        System.out.println("Hello Newbie " +Name);

    }
    //////////////////

    /**EquipWeapon
     * @requires: weapons is not null.
     * @return: If weapons is an instance of Daggers, equips the weapon and updates stats.
     * Prints a message indicating the successful equip or an error message if the weapon is not suitable.
     * effects: Modifies the weapon attribute of the Assasin instance.
     * effects: Calls updatestatfronWeapon(weapons).
     */
    public void EquipWeapon(Weapons weapons){
        if(weapons instanceof Daggers){
            this.weapon = weapons;
            updatestatfronWeapon(weapons) ;
            System.out.println("You Have Equipped Daggers!!!");
        }else{
            System.out.println("You cannot Equip this shit a bro");
        }
    }
    //////////////////

    /**updatestatfronWeapon
     * @requires: weapons is not null.
     * @return: Updates the base damage and defense of the Assasin based on the provided weapon's attributes.
     * effects: Modifies the Base_Damege and Defense attributes of the Assasin instance.
     */
    public void updatestatfronWeapon(Weapons weapons) {
        this.Base_Damege += weapons.addAtk() ;
        this.Defense += weapons.addDef() ;
    }

    /**getatk
     * @requires: DMG is a non-negative value.
     * @return: Reduces the HP of the Assasin based on the incoming damage (DMG) after considering defense.
     * @return: Prints a message indicating the attack.
     * effects: Modifies the HP attribute of the Assasin instance.
     */
    @Override
    public void getatk(double DMG) {
        if(DMG - Defense >= 0 )  {
            HP =HP - (DMG- Defense) ;
        }
        System.out.println(Name+ "Got Attacked");

    }

    /**showStats
     * @return: Prints the current stats of the Assasin object, including Name, Role, HP, Mana, etc.
     * effects: Prints information to the console but does not modify the state.
     */
    @Override
    public void showStats() {
        System.out.println("Name : "+Name);
        System.out.println("Role : "+Role);
        System.out.println("HP = " + HP);
        System.out.println("Level : "+Level);
        System.out.println("Mana : "+Mana);
        System.out.println("Defense : "+Defense);
        System.out.println("Run Speed : "+Base_RunSpeed);
        System.out.println("Attack Damage : "+Base_Damege);
    }

    /**GetAtkDMG
     * @return: Returns the current base damage of the Assasin.
     */
    public double GetAtkDMG() {
        return Base_Damege ;

    }
}