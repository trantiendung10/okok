package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class optional {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Java");
        items.add("C#");
        items.add("C++");
        items.add("PHP");
        items.add("Javascript");
 
      Optional<List<String>> check = Optional.ofNullable(items);  
//      check.ifPresent(x->x.forEach(y-> System.out.println(y.toLowerCase())));
        check.ifPresent(x->x.forEach(y-> System.out.println(y.toLowerCase())));
//        check.get().stream().map(x->x+"d").forEach(y-> System.out.println(y));

//        check.get().forEach(y-> System.out.println(y));
//        Optional<List<String>> checkNull = Optional.ofNullable(items);  
//        if(checkNull.isPresent()){
//            String lowercaseString = items.get(4).toLowerCase();  
//            System.out.print(lowercaseString);  
//        }else  
//            System.out.println("string value is not present");  
        
//        String name = new String("dung");
//        
//        Optional<String> opt = Optional.ofNullable(name);
//        opt.filter(x -> x.contains("d")).map(x -> x.toUpperCase())
//            .ifPresent(x -> System.out.println("Name: " + x));
        
    }

}
