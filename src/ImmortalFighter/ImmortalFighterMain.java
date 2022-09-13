package ImmortalFighter;

public class ImmortalFighterMain {

    public static void main(String[] args) {

        Punches NormalPunch1 = new NormalPunch();
        Punches UppercutPunch1 = new UppercutPunch();
        Punches ElpowPunch1 = new ElbowPunch();

        Kicks normalKick1 = new NormalKick();
        Kicks HurricaneKick1 = new HurricaneKick();
        Kicks FlyingKick1 = new FlyingKick();

        Fighter f1 = new Luka(NormalPunch1, normalKick1);

        f1.performanceKicks();
    //    f1.performancePunches();

        System.out.println("----------------");

        Fighter f2 = new Luka(UppercutPunch1, HurricaneKick1);

        f2.performanceKicks();
        f2.performancePunches();

        f2.setPunch(new ElbowPunch());
        f2.performancePunches();

        System.out.println("----------------");

        Fighter f3 = new Alvara(ElpowPunch1, FlyingKick1);

        f1.performanceKicks();
        f3.performancePunches();

    }

}
