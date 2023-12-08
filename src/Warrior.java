

public class Warrior implements  Character{
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

    /**EquipWeapon
     * @requires: Name and Role parameters are not null.
     * Initializes a Warrior instance with default values and prints a welcome message.
     * effects: Prints information to the console.
     */
    Warrior (String Name,String Role){
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
    public void EquipWeapon(Weapons weapons){
        if(weapons instanceof Sword){
            this.weapon = weapons;
            System.out.println("You Have Equipped Sword!!!");

            updatestatfronWeapon(weapons) ;
        }else{
            System.out.println("You cannot Equip this shit a bro");
        }
    }
    //////////////////
    public void updatestatfronWeapon(Weapons weapons) {
        this.Base_Damege += weapons.addAtk() ;
        this.Defense += weapons.addDef() ;
    }

    @Override
    public void getatk(double DMG) {
        if(DMG - Defense >= 0 )  {
            HP =HP - (DMG- Defense) ;
        }
        System.out.println(Name+ "Got Attacked");
    }


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
    public double GetAtkDMG() {
        return Base_Damege;
    }
}