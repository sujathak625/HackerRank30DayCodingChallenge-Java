import java.util.*;

public class ArrayElementMaxMinDifference {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        //   int[] elements = new int[N];
        List<Integer> elements = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            elements.add(sc.nextInt());
        }

        Integer maxNo = elements.stream()
                .mapToInt(v -> v)
                .max().orElseThrow(NoSuchElementException::new);

        Integer minNo = elements.stream()
                .mapToInt(v -> v)
                .min().orElseThrow(NoSuchElementException::new);

        int diff = maxNo - minNo;
        System.out.println(diff);
    }
}
