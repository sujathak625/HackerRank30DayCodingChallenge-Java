import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class ArraysExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Collections.reverse(arr);
        StringBuilder str = new StringBuilder(arr.get(0));
        for (Integer integer : arr) {
            str.append(integer).append(" ");
        }
        System.out.println(str);
        bufferedReader.close();
    }
}
