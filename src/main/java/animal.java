public abstract class animal {


    private int eyes;
    private int legs;
    private String sound;

    public animal (int eyes, int legs, String sound ) {
        this.eyes = eyes;
        this.legs = legs;
        this.sound = sound;
    }

    public int getEyes () {
        return eyes;
    }

    public void setEyes (int eyes) {
        this.eyes = eyes;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs (int legs) {
        this.legs = legs;

    }
    public String getSound() {
        return sound;
    }

    public void setSound( String Sound) {
        this.sound = sound;



    }
    public abstract String eat();
}
