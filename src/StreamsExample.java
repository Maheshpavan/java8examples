import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsExample {

    public static void main(String[] args) {
        List<String> elements =
                Stream.of("a", "b", "c").filter(element -> element.length()==1)
                        .collect(Collectors.toList());
        Optional<String> anyElement = elements.stream().findAny();
        Optional<String> firstElement = elements.stream().findFirst();
        System.out.println("anyElement => "+(anyElement.isPresent()?anyElement.get():""));
        System.out.println("anyElement => "+(firstElement.isPresent()?firstElement.get():""));
    }
}
