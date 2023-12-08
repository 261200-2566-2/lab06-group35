

public class Daggers implements Weapons{
    double addatk = 5 ;
    double adddef = 0 ;

    /**addAtk
     * @return: Returns the additional attack value provided by the daggers (addatk).
     */
    public double addAtk() {

        return addatk  ;

    }

    /**addDef
     * @return: Returns the additional defense value provided by the daggers (adddef).
     */
    public double addDef() {

        return adddef ;

    }

    /**PrintStats
     * @return: Prints the statistics of the daggers to the console, including additional attack and defense values.
     * effects: Prints information to the console but does not modify the state
     */
    public void PrintStats(){
        System.out.println("Sword Stats");
        System.out.println("add ATK :" + addatk) ;
        System.out.println("add Def : "+adddef);

    }
}
