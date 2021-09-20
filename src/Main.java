import java.util.*;

public class Main {
    public static void main(String[] args) {
        int j = 0;
        String subjectinsert = "", subjectfind = "";
        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Neçə söz daxil edəcəksən ?");
        j = scanner.nextInt();
        System.out.println("Deməli " + j + " söz daxil edirsən!?");
        System.out.println("Sözləri daxil edin:");

        for (int i = 0; i < j; i++) {
            subjectinsert = scanner.next();
            list.add(subjectinsert);
        }

        System.out.println("Hansı sözü çapa verəcəksən ?");
        subjectfind = scanner.next();
        System.out.println("Sözlər daxil edildi,Databese-dən axtarış edilir...");
        fooOptional(list, subjectfind).ifPresent(System.out::println);

    }

    private static Optional<String> fooOptional(List<String> words, String findword) {

        for (String word : words) {
            if (word.equalsIgnoreCase(findword))
                return Optional.of(word);
        }
        return Optional.of("Daxil etdiyin söz tapılmadı");
    }

}
