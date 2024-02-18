public class GryffindorStudent extends HogwartsStudent {
    private int nobility;
    private int honor;
    private int bravery;

    public GryffindorStudent (String name, int magicPower, int distance, int nobility, int honor, int bravery){
        super (name, magicPower, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    public int getNobility() {
        return nobility;
    }
    public void setNobility (int nobility) {
        this.nobility = nobility;
    }
    public int getHonor(){
        return honor;
    }
    public void setHonor( int honor){
        this.honor = honor;
    }
    public int getBravery(){
        return bravery;
    }
    public void srtBravery(int bravery){
        this.bravery = bravery;
    }

    @Override
    public String toString () {
        return "GryffindorStudent{" + super.toString () +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
