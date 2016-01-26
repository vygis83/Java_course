package com.vygutis;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by luksyvyg on 26/01/2016.
 */
public class MapClass {

    public static void main(String[] args) {

        Map<String, String> languages = new HashMap<>();
        if(languages.containsKey("Java")) {
            System.out.println("Java is in the map");
        } else {
            languages.put("Java", "good coffee");
            System.out.println("Java added");
        }

        languages.put("Python", "scary snake");
        languages.put("C#", "good for Unity 3D");
        languages.put("BASIC", "very basic");
        languages.put("Lisp", "terra incognito");

        if(languages.containsKey("Java")) {
            System.out.println("Java is in the map");
        } else {
            languages.put("Java", "this course");
        }

        System.out.println("=========================================");

//        languages.remove("Lisp");
        if(languages.remove("C#", "good for Unity 3D")) {
            System.out.println("C# removed");
        } else {
            System.out.println("key/value pair not found");
        }

        if(languages.replace("Lisp", "terra incognito", "sveplumas")) {
            System.out.println("Lisp replaced");
        } else {
            System.out.println("Lisp was not replaced");
        }
//        System.out.println(languages.replace("Scala", "scalability"));

        for(String key: languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }
    }
}
