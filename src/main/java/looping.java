public class looping {

    private static void loopDigga() {
        for(int i = 0; i < 100; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("This is a loop my nigga");
        }
    }

    public static void main(String[] args) {
        loopDigga();
    }
}
