package org.yinhd.collection.map;

import org.yinhd.collection.PersonA;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<PersonA, String> treeMap = new TreeMap<>(new Comparator<PersonA>() {
            @Override
            public int compare(PersonA o1, PersonA o2) {
                int num = o1.getAge() - o2.getAge();
                return Integer.compare(num, 0);
            }
        });
        treeMap.put(new PersonA(3), "A");
        treeMap.put(new PersonA(2), "B");
        treeMap.put(new PersonA(5), "C");
        treeMap.entrySet().forEach(personAStringEntry -> System.out.println(personAStringEntry.getValue()));
    }
}
