package com.shashankjaincompany.Sec14;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class With_Java_Stream {
    // @Test
    public void regular() {

        ArrayList<String> name = new ArrayList<String>();
        name.add("Abhishek");
        name.add("Mintu");
        name.add("Anjali");
        name.add("Rahul");
        name.add("Avinash");
        int count = 0;
        for (int i = 0; i < name.size(); i++) {
            String actualName = name.get(i);
            if (actualName.startsWith("A")) {
                count++;
            }
        }
        System.out.println(count);
    }

    @Test
    public void withJavaStream() {
        ArrayList<String> name = new ArrayList<String>();
        name.add("Abhishek");
        name.add("Mintu");
        name.add("Anjali");
        name.add("Rahul");
        name.add("Avinash");
        long c = name.stream().filter(actual -> actual.startsWith("A")).count();
        System.out.println(c);


        long d = Stream.of("shashank", "sourabh", "sadhana", "suresh", "rahul", "rohit").filter(act -> act.startsWith("s")).count();
        System.out.println(d);

        // print name having alphabet count greater than 4
        name.stream().filter(s -> s.length() > 5).forEach(s -> System.out.println(s));
        System.out.println();
        name.stream().filter(s -> s.length() > 5).limit(1).forEach(s -> System.out.println(s));

    }

    @Test
    public void streamMap() {
        Stream.of("shashank", "sourabh", "sadhana", "suresh", "rahul", "rohana").filter(act -> act.endsWith("a")).map(act -> act.toUpperCase())
                .forEach(act -> System.out.println(act));

    }

    @Test
    public void sortedMap() {
        ArrayList<String> actors = new ArrayList<String>();
        actors.add("Shahrukh");
        actors.add("Salman");
        actors.add("Ranveer");
        actors.add("varun");
        String[] players = {"Virat", "Rohit", "Rahul", "Hardik", "Ravindra"};
        //ArrayList<String> actPlayers= new ArrayList<String>();
        List<String> actPlayers = Arrays.asList(players);
        actPlayers.stream().filter(s -> s.startsWith("R")).sorted().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));
        System.out.println();
        //Stream.concat(actors.stream(),actPlayers.stream()).sorted().forEach(s-> System.out.println(s));
        Stream<String> mergeStream = Stream.concat(actors.stream(), actPlayers.stream());
        //    boolean flag = mergeStream.anyMatch(s -> s.equalsIgnoreCase("Rahul"));
        //  System.out.println(flag);
        //   Assert.assertTrue(flag);

        List<String> finallist = mergeStream.filter(s -> s.startsWith("R")).map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(finallist.get(0));
    }

    @Test
    public void uniqueNumber() {
        List<Integer> values = Arrays.asList(3, 3, 5, 6, 6, 8, 8, 9, 10);
        values.stream().distinct().forEach(s -> System.out.println(s));

        List<String> names = Arrays.asList("rahul", "rahul", "shashank", "sourabh", "shashank", "sourabh");
        names.stream().distinct().forEach(s -> System.out.println(s));

        List<Integer> values1 = Arrays.asList(3, 3, 4, 4, 5, 5, 6, 7, 8, 9, 10);
        List<Integer> newvalues = values1.stream().distinct().sorted().collect(Collectors.toList());
        System.out.println(newvalues.get(0));
    }


}

