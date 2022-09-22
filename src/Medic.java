public class Medic extends Hero{
    private  int healPoints ;


    public Medic(String typeOfPower, int healPoints) {
        super(typeOfPower);
        this.healPoints = healPoints;
    }

    public  void  increaseExperience () {
        System.out.println(healPoints * 0.1);
        setHealPoints((int) (getHealPoints() + healPoints * 0.1));
       // System.out.println(getHealPoints());



    }

    public Medic(String typeOfPower) {
        super(typeOfPower);
    }

    @Override
    public void applySuperAbility() {
        super.applySuperAbility();
        System.out.println("Медик применил суперспособность" + getTypeOfPower());
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }
}
