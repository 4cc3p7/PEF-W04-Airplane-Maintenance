public class MaintenanceApp {
    public static void main(String[] args) {

        Airplane boeing = new Airplane("Boeing 747");
        Airplane airbus = new Airplane("Airbus A320");

        // 1 Hangar objekt erstellen
        Hangar hangar = new Hangar ();

        // 2 Status aufrufen
        System.out.println("Status direkt nach erzeugung des Hangars: ");
        hangar.status();
        System.out.println();

        // 3 Flugzeug parken
        hangar.parkInSlot1(boeing);
        hangar.parkInSlot2(airbus);

        // 4 status aufrufen
        System.out.println("Staus, nachdem die Fulgzeuge geparkt sind: ");
        hangar.status();
        System.out.println();

        // Gepäckstück erstellen
        luggage bag1 = new luggage(12.5);
        luggage bag2 = new luggage(2.5);
        luggage bag3 = new luggage(3.5);

        // Boeing mit Gepäck laden
        boeing.loadLuggage(bag1);
        boeing.loadLuggage(bag2);

        // Airbus mit Gepäck laden
        airbus.loadLuggage(bag3);


        // Kontrolle des Gepäckgewichts
        System.out.println("\nGepäckgewicht Boeing: " + boeing.getTotalLuggageWeight());
        System.out.println("Gepäckgewicht Airbus: " + airbus.getTotalLuggageWeight());



        // 5 Boeing vom hangar entfernen
        hangar.removeFromSlot1();

        // 6 Status aufrufen
        System.out.println("Status des Hangars: ");
        hangar.status();

        System.out.println("Boeing letzte Wartung: " + boeing.getLastMaintenance());


        //TODO: add hangar handling
    }
}
