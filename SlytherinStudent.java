public class SlytherinStudent extends HogwartsStudent {
    private int cunning;
    private int determination;
    private int ambition;
    private int resource;
    private int lustForPower;

    public SlytherinStudent (String name, int magicPower, int distance, int cunning, int determination, int ambition,int resource, int lustForPower) {
        super (name, magicPower, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resource = resource;
        this.lustForPower = lustForPower;
    }

    public int getCunning () {
        return cunning;
    }

    public void setCunning ( int cunning ) {
        this.cunning = cunning;
    }

    public int getDetermination () {
        return determination;
    }

    public void setDetermination ( int determination ) {
        this.determination = determination;
    }

    public int getAmbition () {
        return ambition;
    }

    public void setAmbition ( int ambition ) {
        this.ambition = ambition;
    }

    public int getResource () {
        return resource;
    }

    public void setResource ( int resource ) {
        this.resource = resource;
    }

    public int getLustForPower () {
        return lustForPower;
    }

    public void setLustForPower ( int lustForPower ) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString () {
        return "SlytherinStudent{" + super.toString () +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resource=" + resource +
                ", lustForPower=" + lustForPower +
                '}';
    }
}
