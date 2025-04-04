public class exercise1 {
    static final int NUM_PHILOSOPHERS = 5;

    public static void main(String[] args) {
        ChopStick[] chopsticks = new ChopStick[NUM_PHILOSOPHERS];
        Philosopher[] philosophers = new Philosopher[NUM_PHILOSOPHERS];

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            chopsticks[i] = new ChopStick();
        }

        for (int i = 0; i < NUM_PHILOSOPHERS; i++) {
            philosophers[i] = new Philosopher(i, chopsticks[i], chopsticks[(i + 1) % NUM_PHILOSOPHERS]);
            philosophers[i].start();
        }
    }

    static class Philosopher extends Thread {
        private int position;
        private ChopStick leftStick, rightStick;

        Philosopher(int pos, ChopStick left, ChopStick right) {
            position = pos;
            leftStick = left;
            rightStick = right;
        }

        public void eat() {
            leftStick.pickUp();
            rightStick.pickUp();
            System.out.println("Triết gia " + position + " đang ăn.");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public void think() {
            leftStick.putDown();
            rightStick.putDown();
            System.out.println("Triết gia " + position + " đang suy nghĩ.");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void run() {
            while (true) {
                eat();
                think();
            }
        }
    }

    static class ChopStick {
        private boolean isAvailable = true;

        public synchronized void pickUp() {
            while (!isAvailable) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            isAvailable = false;
        }

        public synchronized void putDown() {
            isAvailable = true;
            notify();
        }
    }
}
