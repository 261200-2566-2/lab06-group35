

public class Sword implements Weapons{

    double addatk = 5 ;
    double adddef = 0 ;

    /**addatk
     * @return: Returns the additional attack value provided by the sword (addatk).
     */
    public double addAtk() {

        return addatk  ;

    }

    /**addDef
     * @returns the additional defense value provided by the sword (adddef).
     */
    public double addDef() {

        return adddef ;

    }

    /**PrintStats
     * @return: Prints the statistics of the sword to the console, including additional attack and defense values.
     * effects: Prints information to the console but does not modify the state.
     */
    public void PrintStats(){
        System.out.println("Sword Stats");
        System.out.println("add ATK :" + addatk) ;
        System.out.println("add Def : "+adddef);

    }
}