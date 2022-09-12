package pro.sky;


import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
//        Дан массив строк, необходимо удалить из него все дубли, оставшиеся строки объединить в одну в порядке следования в массиве.
        String[] strings = new String[]{"asd","asd1","asd","asd2","asd3","asd4","asd",};

        String s = Arrays.stream(strings)
                .distinct()
                .collect(Collectors.joining());

        System.out.println(Arrays.toString(strings));
        System.out.println(s);
    }
}