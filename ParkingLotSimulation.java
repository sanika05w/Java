import java.util.*;

public class ParkingLotSimulation
{
    public static void main(String[] args) {
        Lot lot = new Lot(2);
        System.out.println(lot.park("MH12AB1234"));
        System.out.println(lot.park("MH14CD5678"));
        System.out.println(lot.park("MH20EF9999"));
        lot.leave("MH12AB1234");
        System.out.println(lot.park("MH20EF9999"));
    }

    static class Lot {
        int cap; Set<String> cars = new LinkedHashSet<>();
        Lot(int c) { cap = c; }
        String park(String no) { if (cars.size() >= cap) return "Full: " + no; cars.add(no); return "Parked: " + no; }
        void leave(String no) { cars.remove(no); }
    }
}
