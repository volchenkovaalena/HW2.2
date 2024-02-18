public class Hogwarts {
    public void printStudent ( HogwartsStudent student ) {
        System.out.println ( student );
    }

    public void compareStudents ( HogwartsStudent first, HogwartsStudent second ) {
        if ( first.getMagicPower ( ) > second.getMagicPower ( ) ) {
            System.out.println ( "Студент " + first.getName ( ) + " сильнее чем " + second.getName ( ) );
        } else if ( first.getMagicPower ( ) == second.getMagicPower ( ) ) {
            System.out.println ( "Студенты равны по силе" );
        } else {
            System.out.println ( "Студент " + second.getName () + " сильнее чем " + first.getName () );
        }

        if ( first.getDistance ( ) > second.getDistance ( ) ) {
            System.out.println ( "Студент " + first.getName ( ) + " имеет большую трансгрессию чем " + second.getName ( ) );
        } else if ( first.getDistance ( ) == second.getDistance ( ) ) {
            System.out.println ( "Студенты равны по трансгрессии " );
        } else {
            System.out.println ( "Студент " + second.getName () + " имеет большую трансгрессию чем " + first.getName () );
        }
    }

    public void compareGryffindorStudent (GryffindorStudent first, GryffindorStudent second) {
        int sumFirst = first.getNobility ( ) + first.getHonor ( ) + first.getBravery ( );
        int sumSecond = second.getNobility () + second.getHonor () + second.getBravery ( );

        if (sumFirst > sumSecond) {
            System.out.println ( "Студент " + first.getName ( ) + " сильнее чем " + second.getName ( ) );
        } else if (sumFirst == sumSecond) {
            System.out.println ( "Студенты равны по силе" );
        } else {
            System.out.println ( "Студент " + second.getName () + " сильнее чем " + first.getName () );
        }


        }

    public void compareHufflepuffStudent (HufflepuffStudent first, HufflepuffStudent second) {
        int sumFirst = first.getHardWork ( ) + first.getLoyalty ( ) + first.getHonesty ( );
        int sumSecond = second.getHardWork () + second.getLoyalty () + second.getHonesty ()y ( );

        if (sumFirst > sumSecond) {
            System.out.println ( "Студент " + first.getName ( ) + " сильнее чем " + second.getName ( ) );
        } else if (sumFirst == sumSecond) {
            System.out.println ( "Студенты равны по силе" );
        } else {
            System.out.println ( "Студент " + second.getName () + " сильнее чем " + first.getName () );
        }


    }

    public void compareRavenclawStudent (RavenclawStudent first, RavenclawStudent second) {
        int sumFirst = first.getWit ( ) + first.getWisdom ( ) + first.getCreation ( ) + first.getSmart ();
        int sumSecond = second.getWit () + second.getWisdom () + second.getCreation ( ) + second.getSmart ();

        if (sumFirst > sumSecond) {
            System.out.println ( "Студент " + first.getName ( ) + " сильнее чем " + second.getName ( ) );
        } else if (sumFirst == sumSecond) {
            System.out.println ( "Студенты равны по силе" );
        } else {
            System.out.println ( "Студент " + second.getName () + " сильнее чем " + first.getName () );
        }


    }

    public void compareSlytherinStudent (SlytherinStudent first, SlytherinStudent second) {
        int sumFirst = first.getLustForPower ( ) + first.getDetermination ( ) + first.getCunning ( ) + first.getAmbition () + first.getResource ( );
        int sumSecond = second.getLustForPower () + second.getDetermination () + second.getCunning ( ) + second.getAmbition () + second.getResource ();

        if (sumFirst > sumSecond) {
            System.out.println ( "Студент " + first.getName ( ) + " сильнее чем " + second.getName ( ) );
        } else if (sumFirst == sumSecond) {
            System.out.println ( "Студенты равны по силе" );
        } else {
            System.out.println ( "Студент " + second.getName () + " сильнее чем " + first.getName () );
        }


    }
    }