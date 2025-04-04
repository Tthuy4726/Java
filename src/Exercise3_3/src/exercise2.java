class Resource {
    String name;
    public Resource(String name) {
        this.name = name;
    }
}

public class exercise2 {
    public static void main(String[] args) {
        Resource resou1 = new Resource("resou1");
        Resource resou2 = new Resource("resou2");

        Thread threadA = new Thread(() -> {
            synchronized (resou1) {
                System.out.println("Thread A locked " + resou1.name);
                synchronized (resou2) {
                    System.out.println("Thread A locked " + resou2.name);
                }
            }
        });

        Thread threadB = new Thread(() -> {
            synchronized (resou1) { // Thứ tự khóa giống thread A -> Không deadlock
                System.out.println("Thread B locked " + resou1.name);
                synchronized (resou2) {
                    System.out.println("Thread B locked " + resou2.name);
                }
            }
        });

        threadA.start();
        threadB.start();
    }
}
