public class RavenclawStudent extends HogwartsStudent {
    private int smart;
    private int wisdom;
    private int  wit;
    private int  creation;

    public RavenclawStudent (String name, int magicPower, int distance, int smart, int wisdom, int wit, int creation){
        super (name,magicPower, distance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creation = creation;
    }

    public int getSmart () {
        return smart;
    }

    public void setSmart ( int smart ) {
        this.smart = smart;
    }

    public int getWisdom () {
        return wisdom;
    }

    public void setWisdom ( int wisdom ) {
        this.wisdom = wisdom;
    }

    public int getWit () {
        return wit;
    }

    public void setWit ( int wit ) {
        this.wit = wit;
    }

    public int getCreation () {
        return creation;
    }

    public void setCreation ( int creation ) {
        this.creation = creation;
    }

    @Override
    public String toString () {
        return "RavenclawStudent{" + super.toString () +
                "smart=" + smart +
                ", wisdom=" + wisdom +
                ", wit=" + wit +
                ", creation=" + creation +
                '}';
    }
}
