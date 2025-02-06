import java.time.LocalDateTime;

public class Hangar {
    private Airplane slot1;
    private Airplane slot2;

    public void parkInSlot1(Airplane airplane) {
        this.slot1 = airplane;
    }

    // Flugzeug in Slot2 parken
    public void parkInSlot2(Airplane airplane) {
        this.slot2 = airplane;
    }

    // Flugzeug aus Slot1 entfernen
    public void removeFromSlot1() {
        if(slot1 != null) {
            slot1.setLastMaintenance(LocalDateTime.now());
        }
        this.slot1 = null;
    }

    // Flugzeug aus Slot2 entfernen
    public void removeFromSlot2() {
        if(slot2 != null) {
            slot2.setLastMaintenance(LocalDateTime.now());
        }
        this.slot2 = null;
    }



    // Status ausgeben
    public void status() {
        printSlotStatus("Slot1", slot1);
        printSlotStatus("Slot2", slot2);
    }

    // Neue private Hilfsmethode zur Vermeidung von Code-Duplikation
    private void printSlotStatus(String slotName, Airplane airplane) {
        if (airplane != null) {
            System.out.println(slotName + ": " + airplane.getAirplaneType());
        } else {
            System.out.println(slotName + ": Leer");
        }
    }
}
