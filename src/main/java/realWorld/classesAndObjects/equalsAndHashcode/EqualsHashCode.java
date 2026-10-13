package realWorld.classesAndObjects.equalsAndHashcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
public class EqualsHashCode {

    public static void main(String[] args){
        UserNoOverride a1 = new UserNoOverride("U1","a@x.com");
        UserNoOverride a2 = new UserNoOverride("U2","a@x.com");
        System.out.println("a1==a2 :"+(a1==a2));
        System.out.println("a1.equals(a2) "+a1.equals(a2));
        Set<UserNoOverride> setA = new HashSet<>(Set.of(a1));
        setA.add(a2);
        System.out.println("Set size (no override) :"+setA.size());

        UserEntity b1 = new UserEntity("U1","a@x.com");
        UserEntity b2 = new UserEntity("U1","new@x.com");
        System.out.println("b1==b2: "+(b1==b2));
        System.out.println("b1.equals(b2) : "+b1.equals(b2));
        System.out.println("Hash Equal :"+ (b1.hashCode() == b2.hashCode()));
        Set<UserEntity> setB = new HashSet<>(Set.of(b1));
        setB.add(b2);
        System.out.println("Set size (Override) :"+setB.size());

        // Map lookup with different object but same ID
        Map<UserEntity, String> cart = new HashMap<>();
        cart.put(b1, "Laptop");
        System.out.println("Lookup by new Object - same UserId: "+cart.get(new UserEntity("U1", null)));
        System.out.println("Lookup by new Object - same email: "+cart.get(new UserEntity("U2", "a@x.com")));
    }

}
