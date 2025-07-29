import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;
@SuppressWarnings("unused")
class student {
    
    private String name;
    private int age;

    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}

public class weakhashmap {
    public static void main(String[] args) {
        WeakHashMap<String, student> weakmap = new WeakHashMap<>();
        loadcache(weakmap);
        // weakmap.put(new String("Student1"), new student("Alice",20));
        // weakmap.put(new String("Student2"), new student("Bob",22));
        // weakmap.put(new String("Student3"), new student("Max",19));

        System.out.println("Before GC: " + weakmap);
        System.gc();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After GC: " + weakmap);
    }

    public static void loadcache(Map<String, student> map) {
        String key1 = new String("student1");
        String key2 = new String("student2");
        map.put(key1, new student("Alice", 20));
        map.put(key2, new student("Bob", 22));
    }
    // Remember abt the weakreference, it is a reference that does not prevent its
    // referent from being made finalizable, finalized, and then reclaimed.
    // Reemenber to make the object a weak reference so that is can be garbage
    // collected and recycled late by the JVM.!!
    // WeakHashMap is a Map implementation that uses weak references for its keys,
    // allowing them to be garbage collected when no strong references exist.
}
