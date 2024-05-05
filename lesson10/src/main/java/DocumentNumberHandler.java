import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DocumentNumberHandler {
    public String getDocumentNumberForStart() {
        Scanner in = new Scanner(System.in);
        String documentNumber = null;
        do {
            System.out.println("Введите строку формата xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.");
            String usersInput = in.nextLine();
            if (usersInput.matches("(\\d{4}-[a-zA-Z]{3}-){2}(\\d[a-zA-Z]){2}")){
                documentNumber = usersInput;
            } else if (usersInput.matches("cancel")){
                break;
            } else {
                System.out.println("Строка не соответствует шаблону, для выхода введите - cancel");
            }
        } while (documentNumber == null);
        return documentNumber;
    }
    public void showBlocksWithFourNumbers(String documentNumber) {
        Pattern p = Pattern.compile("\\d{4}");
        Matcher m = p.matcher(documentNumber);
        StringBuilder string = new StringBuilder();
        while (m.find()){
            string.append(m.group());
        }
        System.out.println(string);
    }
    public void showWithReplacedLettersBlock(String documentNumber) {
        System.out.println(documentNumber.replaceAll("[a-zA-Z]{3}", "***"));
    }
    public void showInLowerCaseOnlyLetters(String documentNumber) {
        System.out.println(getOnlyLetters(documentNumber).toLowerCase(Locale.getDefault()));
    }

    public void showInUpperCaseOnlyLetters(String documentNumber) {
        System.out.println("Letters:" + getOnlyLetters(documentNumber).toUpperCase());
    }
    private String getOnlyLetters (String string) {
        StringBuilder result = new StringBuilder();
        result.append(string.replaceAll("[^a-zA-Z]+", "/"));
        if(result.toString().startsWith("/")) {
            result.deleteCharAt(0);
        }
        return result.toString();
    }
    public boolean checkIfDocumentNumberContainsSequence(String documentNumber, String sequence) {
        return documentNumber.matches("(?i).*" + sequence + ".*");
    }
    public boolean checkIfDocumentNumbersStartsWith(String documentNumber, String sequence) {
        return documentNumber.toLowerCase().startsWith(sequence.toLowerCase());
    }
    public boolean checkIfDocumentNumbersEndsWith(String documentNumber, String sequence) {
        return documentNumber.toLowerCase().endsWith(sequence.toLowerCase());
    }
}
