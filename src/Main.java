import java.util.*;

public class Main {
    public static void main(String[] args) {
        int j = 0;
        String subject = "", subject1 = "";
        List<String> list = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Neçə söz daxil edəcəksən ?");
        j = scanner.nextInt();
        System.out.println("Deməli " + j + " söz daxil edirsən!?");
        System.out.println("Sözləri daxil edin:");

        for (int i = 0; i < j; i++) {
            subject = scanner.next();
            list.add(subject);
        }

        System.out.println("Hansı sözü çapa verəcəksən ?");
        subject1 = scanner.next();
        System.out.println("Sözlər daxil edildi,Databese-dən axtarış edilir...");
        fooOptional(list, subject1).ifPresent(System.out::println);

    }

    private static Optional<String> fooOptional(List<String> words, String findword) {

        for (String word : words) {
            if (word.equalsIgnoreCase(findword))
                return Optional.of(word);
        }
        return Optional.of("Tapılmadı");
    }

}
