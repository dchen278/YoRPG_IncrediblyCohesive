/**
 * class Protagonist -- protagonist of Ye Olde RPG
 **/

public class Protagonist extends Character {

    // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~
    protected String _name = "J. Doe";
    // private int _hitPts;
    // private int _strength;
    // private int _defense;
    // private double _attack;
    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    /**
     * default constructor pre: instance vars are declared post: initializes
     * instance vars.
     **/
    public Protagonist() {
        // super();
        //_hitPts = 125;
        //_strength = 100;
        //_defense = 40;
        //_attack = .4;
    }

    /**
     * overloaded constructor pre: instance vars are declared post: initializes
     * instance vars. _name is set to input String.
     **/
    public Protagonist(String name) {
        this();
        _name = name;
    }

    // ~~~~~~~~~~~~~~ ACCESSORS ~~~~~~~~~~~~~~~~~
    public String getName() {
        return _name;
    }

    public int getDefense() {
        return _defense;
    }
    // prepare a Protagonist for a special attack
    public void specialize() {
        _attack = .75;
        _defense = 20;
    }

    // revert to normal mode
    public void normalize() {
        _attack = .4;
        _defense = 40;
    }

    public int getStrength() {
      return _strength;
    }

    public double getAttack() {
      return _attack;
    }

}// end class Protagonist