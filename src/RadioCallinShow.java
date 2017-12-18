
public class RadioCallinShow {


    public static void main(String[] args) {
        LinkedQueue phoneLine = new LinkedQueue();
        System.out.println("The lines are open");
        System.out.println("Currently we have " + phoneLine.size() + " callers waiting...");
        System.out.println("3 calls are coming in");
        phoneLine.enqueue(new Caller("Jim"));
        phoneLine.enqueue(new Caller("Billy"));
        phoneLine.enqueue(new Caller("Douglas"));
        System.out.println("The next caller will be: " + phoneLine.peekFront());
    }
    
}
