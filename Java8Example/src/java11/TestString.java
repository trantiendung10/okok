package java11;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestString {

    public static void main(String[] args) {
//        String multilineString = "deft helps \n \n developers \n explore Java.";
//        List<String> lines = multilineString.lines()
//                .filter(line -> !line.isBlank())
//                .map(String::strip)
//                .collect(Collectors.toList());
//        lines.forEach(x->System.out.println(x));
//    }
//    public static void main(String[] args) {
//    List sampleList = Arrays.asList("Java", "Kotlin");
//    String[] sampleArray =  (String[]) sampleList.toArray(String[] :: new);;
//    sampleList.forEach(x->System.out.println(x));
//    }
    List<String> sampleList = Arrays.asList("Java", "Kotlin");
    String resultString = sampleList.stream()
      .map((var x) -> x.toUpperCase())
      .collect(Collectors.joining(","));
    System.out.print(resultString);
    }
}
