import java.lang.ref.WeakReference;

class phone
{
    private String name;
    private int price;

    public phone(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "phone [name=" + name + ", price=" + price + "]";
    }
    
}
class GCs {
    public static void main(String[] args) {
        System.out.println("Garbage Collection Example");
        // phone p1=new phone("Iphone",150000);
        WeakReference<phone> p1 = new WeakReference<>(new phone("Iphone", 150000));
        try{
            System.out.println("Before GC: " + p1.get());
            System.gc(); // Suggesting JVM to run garbage collector
            Thread.sleep(1000); // Sleep for a while to allow GC to run
        } catch (InterruptedException e) {
            e.printStackTrace();

        }

        System.out.println(p1.get()); // The object reference is null coz we asked the JVM to collect garbage and the weakreference objects are kinda weak so they go onto garbage collections
    }
}
