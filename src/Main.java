public class Main {
    public static void main(String[] args) {

        HavingSuperAbility havingSuperAbility [] = { new Magic(": TELEKINESIS") ,
                new Medic(": TREATMENT", 50) ,
                new Warrior(": CRITICAL DAMAGE ")};
        for (int i = 0; i < havingSuperAbility.length ; i++) {
            havingSuperAbility[i].applySuperAbility();
            if (havingSuperAbility[i] instanceof  Medic){
                System.out.println(((Medic) havingSuperAbility[i]).getHealPoints());
            ((Medic)havingSuperAbility[i]).increaseExperience();
            System.out.println(((Medic) havingSuperAbility[i]).getHealPoints());
            }
        }

        Medic medic = new Medic( "ÁÛÑÒÐÎÅ ËÅ×ÅÍÈÅ", 50);

      //  medic.increaseExperience();







    }
}