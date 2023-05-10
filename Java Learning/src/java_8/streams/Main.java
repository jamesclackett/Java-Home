package java_8.streams;

import javax.print.DocFlavor;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        /*
                Not to be mistaken with I/O streams like InputStream.
                These are completely different.
                Java 8 Streams are for functional programming and
                should be treated separately

                Streams bring functional programming to Java
                advantages of streams:
                >> Are useful for formatting/filtering data. functional code is more readable here.
                > will make you a more efficient Java programmer
                > make heavy use of lambda expressions
                > makes it easy to multi-thread operations

                A stream pipeline consists of a source, followed by zero or
                more intermediate operations; and a terminal operation

                Source: can be created from Collections, Lists, Sets, ints,
                longs, doubles, arrays, lines of a file

                Operations:
                    * Intermediate (return a stream to allow chaining):
                        > filter, map, sorted, anyMatch, flatMap, distinct, skip, findFirst
                        > Order matters, for large datasets: filter first, then sort or map
                        > for very large datasets, use ParallelStream to multi-thread
                    * Terminal (either void or return non-null):
                        > forEach applies same func to every element
                        > collect saves the elements into a collection
                        >  reduce, min, max, count, summaryStatistics
                            these all reduce the data to a single element
         */

        // In practice:

        //1) Integer Stream
        IntStream.range(1,10).forEach(System.out::print);
        System.out.println();

        //2) Integer Stream with skip
        IntStream.range(1,10).skip(5).forEach(value -> System.out.println(value));
        System.out.println();

        //3) Integer Stream with sum
        System.out.println(IntStream.range(1,5).sum());
        System.out.println();

        //4) Stream.of sorted and findFirst
        Stream.of("Ava", "Ann", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        System.out.println();

        //5) Stream from Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika"};
        Arrays.stream(names) // same as Stream.of(names) - both return a stream
                .filter(str -> str.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
        System.out.println();

        //6) Average of squares of an int array
        Arrays.stream(new int[]{2,4,6,8,10})
                .map(x -> x*x)
                .average()
                .ifPresent(System.out::println);
        System.out.println();

        //7) Stream from List, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Kushal", "Brent", "Sarika"
                , "amanda", "Hans", "Shivika");
        people.stream()
                .map(String::toLowerCase)
                .filter(s -> s.startsWith("a"))
                .forEach(System.out::println);
        System.out.println();

        //8) Stream rows from text file, sort, filter and print
        Path path = Paths.get("Java Learning/resources/files/bands.txt");

        Stream<String> bands = Files.lines(path);
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close(); // important to avoid memory leaks
        System.out.println();

        //9) Stream rows from text file and save to List
        List<String> bands2 =
                Files.lines(path)
                .filter(x -> x.contains("a")).toList();
        bands2.forEach(System.out::println);
        System.out.println();

        //10) Stream rows from a csv files and count
        Path path2 = Paths.get("Java Learning/resources/files/data.txt");
        Stream<String> rows1 = Files.lines(path2);
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();
        System.out.println("row count: " + rowCount);
        rows1.close();
        System.out.println();


    }
}

