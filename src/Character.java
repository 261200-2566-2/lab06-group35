

/**interface Character
 * @requires: Enemy is not null.
 * @return: Invokes getatk on the provided Enemy object, passing the current attack damage of the calling Character.
 * effects: Calls getatk on the Enemy instance, potentially modifying its state.
 */
public interface Character {
    default   void  attack(Character Enemy){
        Enemy.getatk(GetAtkDMG());
    }

    /**showStats
     * @return: Prints the current stats of the implementing Character.
     * effects: Prints information to the console but does not modify the s
     */
    void showStats() ;

    /**getatk
     * @requires: atk is a non-negative value
     * @return: Reduces the HP of the implementing Character based on the incoming attack (atk).
     * effects: Modifies the HP attribute of the implementing Character instance.
     */
    void getatk(double atk);

    /**EquipWeapon
     * @requires: weapons is not null.
     * @return: Equips the provided weapon, updating the stats of the implementing Character.
     * effects: Modifies the state of the implementing Character instance based on the equipped weapon.
     */
    void EquipWeapon(Weapons weapons) ;

    /**GetAtkDMG
     * @return: Returns the current base damage of the implementing Character.
     */
    double  GetAtkDMG() ;

}    