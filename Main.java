public class Main {
    public static void main ( String[] args ) {

        Hogwarts hogwarts = new Hogwarts ();

        GryffindorStudent harry = new GryffindorStudent ( "Гарри Поттер", 22, 44, 55, 66,   18  );
        GryffindorStudent hermione = new GryffindorStudent ( "Гермиона Грейнджер",33,12,44,51,34 );
        GryffindorStudent ron = new GryffindorStudent ( "Рон Уизли", 23, 12, 55, 12,9 );
        SlytherinStudent drako = new SlytherinStudent ( "Драко Малфой", 21 , 33, 67, 12, 55, 37,66 );
        SlytherinStudent grehem = new SlytherinStudent ( "Грэхэм Монтегю", 43, 55, 88, 23, 43,55,61 );
        SlytherinStudent gregory = new SlytherinStudent ( "Грегори Гойл", 22,44, 12,34, 51, 59, 70 );
        HufflepuffStudent zaharia = new HufflepuffStudent ( "Захария Смит", 22, 45, 12,33,36 );
        HufflepuffStudent sedrik = new HufflepuffStudent ( "Седрик Диггори", 12, 44, 56, 12,55 );
        HufflepuffStudent justin = new HufflepuffStudent ( "Джастин Финч-Флетчли", 12,43,44, 12,33 );
        RavenclawStudent zhou = new RavenclawStudent ( "Чжоу Чанг", 33, 67, 89, 22,55,54);
        RavenclawStudent padma = new RavenclawStudent ( "Падма Патил", 44,90,12,33,55,71);
        RavenclawStudent marcus = new RavenclawStudent ( "Маркус Белби", 55, 67,12, 88,56,33);

        hogwarts.printStudent ( harry );
        hogwarts.printStudent ( padma );

        hogwarts.compareStudents ( harry, padma );
        hogwarts.compareGryffindorStudent ( harry,hermione );


    }

}