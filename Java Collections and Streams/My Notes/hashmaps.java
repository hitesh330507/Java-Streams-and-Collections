import java.util.HashMap;
import java.util.Map;

// public class hashmaps {
//     public static void main(String[] args) {
//          Map<Integer,String> map= new HashMap<>(15,0.25f);
//             map.put(101,"Alice");
//             map.put(102,"Bob");
//             map.put(103,"Charlie");
//             System.out.println(map.containsValue("Bob"));
//     }
// }

class student{
    private int id;
    private String name;
    public student(int id, String name)
    {
        this.id=id;
        this.name=name;
    }

    public int getId()
    {
        return id;
    }
    public String getName(){
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        student other = (student) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
    
}


public class hashmaps {
    public static void main(String[] args) {
        Map<student, Integer> map=new HashMap<>(14,0.255f);
        student s1=new student(101,"Max");
        student s2=new student(102,"Bob");
        student s3=new student(101,"Max");

        map.put(s1,99); // hashcode1 --> index1 
        map.put(s2,97); // hashcode2 --> index2
        map.put(s3,88); // hashcode1 --> index1 even tho its similar to s1
        map.put(s1,getorDe)
        System.out.println(map.size()); // Output 3 even tho we have similar entries in the s1 and s3 coz s3 is a new obj formed so a new hashcode and equals is use and stored as a seperate entity
        System.out.println(map.get(s1).hashCode()); // output 99 even tho the value is change in s3 this indicates its stored separately
        System.out.println(map.get(s2).hashCode());
        System.out.println(s1.hashCode());// the output will be same as below coz we override the hashcode and equals functions
        System.out.println(s3.hashCode()); //Run it without hashcode and eqala methods for better undertsanding
        System.out.println(s2.hashCode());
        System.out.println("bucket index of s1: "+s1.hashCode() % 14);
        System.out.println("bucket index of s2: "+s2.hashCode() % 14);
        System.out.println("bucket index of s3: "+s3.hashCode() % 14);
        
        // To solve this prblm we use overriding of methods of hashcode and equals
        // Resolved and all "SET"
        // Refer engineeringDigest 8 hrs video on collections 
        // Timestamp 1:53:10;
    }
}