public class Warrior extends Hero{
    public Warrior(String typeOfPower) {
        super(typeOfPower);
    }

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Воин применил суперспособность"  + getTypeOfPower());
    }
}
