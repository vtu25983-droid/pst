import java.time.LocalDate;
import java.util.*;
import java.util.stream.*;

class Event {
    private final String name;
    private final LocalDate date;

    Event(String name, String date) {
        this.name = name;
        this.date = LocalDate.parse(date); // Format: yyyy-MM-dd
    }

    public String getName() { return name; }
    public LocalDate getDate() { return date; }
}

public class task9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Number of events: ");
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt();

            List<Event> events = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                events.add(new Event(sc.next(), sc.next()));
            }

            System.out.print("Enter month filter (1-12): ");
            int month = sc.nextInt();

            // 1. Sort and Display All
            System.out.print("Chronological: ");
            List<Event> sortedEvents = events.stream()
                    .sorted(Comparator.comparing(Event::getDate))
                    .collect(Collectors.toList());
            
            sortedEvents.forEach(e -> System.out.print(e.getName() + " "));
            System.out.println();

            // 2. Earliest & Latest using Stream Min/Max (Safer than get(0))
            events.stream()
                .min(Comparator.comparing(Event::getDate))
                .ifPresent(e -> System.out.println("Earliest: " + e.getName()));

            events.stream()
                .max(Comparator.comparing(Event::getDate))
                .ifPresent(e -> System.out.println("Latest: " + e.getName()));

            // 3. Events in specific month
            System.out.print("Events in month " + month + ": ");
            long count = events.stream()
                    .filter(e -> e.getDate().getMonthValue() == month)
                    .peek(e -> System.out.print(e.getName() + " "))
                    .count();
            
            if (count == 0) System.out.print("None found.");
            System.out.println();
        }
    }
}