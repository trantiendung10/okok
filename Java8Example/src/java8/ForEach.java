package java8;


interface Sayable {
    public String say(String word);
    default String say1(String word)
    {
        return word+" "+word;
    }
}
 
public class ForEach {
    public static void main(String[] args) {
        Sayable s = (word) -> {
            return word;
        };
        System.out.println(s.say1("Meo meo!"));
    }
}