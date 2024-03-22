public class Main {
    public static void main(String[] args) throws Exception{
        ConferenceEvent conferenceEvent = new ConferenceEvent("EventID", "EventName", "EventLocation", "PointOfContact", 50, 2, 25,40,60);
        conferenceEvent.calculateEventCost();
        System.out.println(conferenceEvent);


        MusicConcertEvent event = new MusicConcertEvent(true, 500.0); 
        double totalCost = event.calculateEventCost();
        System.out.println(event.toString());
        System.out.println("Total Event Cost: $" + totalCost);
        }
        
}