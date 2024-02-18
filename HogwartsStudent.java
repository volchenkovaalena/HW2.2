public class HogwartsStudent {
    private String name;
    private int magicPower;

    private int distance;

    public HogwartsStudent(String name, int magicPower, int distance){
        this.name = name;
        this.magicPower = magicPower;
        this.distance = distance;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getMagicPower () {
        return magicPower;
    }

    public void setMagicPower (int magicPower) {
        this.magicPower = magicPower;
    }

    public int getDistance () {
        return distance;
    }

    public void setDistance ( int distance ) {
        this.distance = distance;
    }

    @Override
    public String toString () {
        return "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", distance=" + distance;
    }
}
