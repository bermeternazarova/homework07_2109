public  abstract class  Hero implements HavingSuperAbility {
    private int health ;
    private  int damage ;
    private  String typeOfPower ;

    public Hero(String typeOfPower) {
        this.typeOfPower = typeOfPower;
    }

    @Override
    public void applySuperAbility() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getTypeOfPower() {
        return typeOfPower;
    }

    public void setTypeOfPower(String typeOfPower) {
        this.typeOfPower = typeOfPower;
    }
}

