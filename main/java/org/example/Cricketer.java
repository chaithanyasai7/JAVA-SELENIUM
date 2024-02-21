//RTP overriding
package org.example;


class Cricketer {
    void play()
    {
        System.out.println("Cricketer is playing cricket");
    }
}
class Batsman extends Cricketer {
    @Override
    void play()
    {
        System.out.println("Batsman is batting");
    }
}

class Bowler extends Cricketer {
    @Override
    void play()
    {
        System.out.println("Bowler is bowling");
    }

    public static void main(String[] args)
    {

        Cricketer Cricketer1 = new Batsman();
        Cricketer Cricketer2 = new Bowler();
        Cricketer1.play();
        Cricketer2.play();
    }
}






