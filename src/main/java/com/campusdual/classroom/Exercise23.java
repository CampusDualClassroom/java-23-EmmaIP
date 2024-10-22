package com.campusdual.classroom;

import java.util.HashMap;
import java.util.Map;

public class Exercise23 {

    public static Map<String, Person> createHashMap() {

        Map<String, Person> personMap = new HashMap<>();
        personMap.put("person", new Person("John", "Smith"));
        personMap.put("teacher", new Teacher("María", "Montessori", "Educación"));
        personMap.put("police", new PoliceOfficer("Jake", "Peralta", "B-99"));
        personMap.put("doctor", new Doctor("Gregory", "House", "Nefrología e infectología"));

        return personMap;

    }

    public static Person addMapValue(Map<String, Person> map, String key, Person value) {
        map.put(key, value);

        return map.get(key);
    }

    public static void printMapValues(Map<String, Person> map) {
        for(Map.Entry<String, Person> entry : map.entrySet()) {
            entry.getValue().getDetails();
        }
    }

    public static void main(String[] args) {

        Map<String, Person> personMap = createHashMap();
        addMapValue(personMap, "police", new PoliceOfficer("Charles", "Boyle", "B-99"));
        printMapValues(personMap);
    }
    
}
