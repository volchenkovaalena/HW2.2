public class HufflepuffStudent extends HogwartsStudent {
    private int hardWork;
    private int loyalty;
    private int honesty;

    public HufflepuffStudent (String name, int magicPower, int distance, int hardWork, int loyalty, int honesty) {
        super (name, magicPower, distance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getHardWork () {
        return hardWork;
    }

    public void setHardWork ( int hardWork ) {
        this.hardWork = hardWork;
    }

    public int getLoyalty () {
        return loyalty;
    }

    public void setLoyalty ( int loyalty ) {
        this.loyalty = loyalty;
    }
    public int getHonesty() {
        return honesty;
    }
    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString () {
        return "HufflepuffStudent{" + super.toString () +
                "hardWork=" + hardWork +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}
