public class Magic extends  Hero{
    public Magic(String typeOfPower) {
        super(typeOfPower);
    }

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Волшебник применил суперспособность" + getTypeOfPower());
    }
}
