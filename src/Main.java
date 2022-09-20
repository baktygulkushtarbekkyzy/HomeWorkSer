import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        System.out.println(set);

    Set<Integer>set1=new HashSet<>();
    set1.add(0);
    set1.add(1);
    set1.add(2);
        System.out.println(set1);
        System.out.println();
        System.out.println(symmetricDifference(set, set1));
    }
    public static Set<Integer>symmetricDifference(Set<Integer>set,Set<Integer> set1){
       Set<Integer> setter=new HashSet<>(set);
       setter.removeAll(set1);
       set1.removeAll(set);
       setter.addAll(set1);
        System.out.print("Joop: ");
       return setter;

    }
}