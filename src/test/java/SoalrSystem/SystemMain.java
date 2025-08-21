package SoalrSystem;

public class SystemMain {
    public static void main(String[] args) {
        Basics solar=new Basics();
        solar.Moon="2";
        solar.Planets="2";
        solar.Sun="1";

        System.out.println("solarsystem is created MVP is ready to be deployed");


        featureSun olen=new featureSun();
        olen.color="pink";
        olen.size="10000000km";
        olen.temp="100000000000k";

        System.out.println("featrue sun is ready");

    }

}
