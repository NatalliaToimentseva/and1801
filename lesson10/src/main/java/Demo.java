public class Demo {
    public static void main(String[] args) {
        DocumentNumberHandler docHandler = new DocumentNumberHandler();
        String documentNumber = docHandler.getDocumentNumberForStart(); //1111-aBc-2222-sss-1a2b

        if (documentNumber != null) {
            //Вывести на экран в одну строку два первых блока по 4 цифры.
            docHandler.showBlocksWithFourNumbers(documentNumber);

            //Вывести на экран номер документа, но блоки из трех букв заменить
            //на *** (каждая буква заменятся на *).
            docHandler.showWithReplacedLettersBlock(documentNumber);

            //- Вывести на экран только одни буквы из номера документа в
            //формате yyy/yyy/y/y в нижнем регистре.
            docHandler.showInLowerCaseOnlyLetters(documentNumber);

            //Вывести на экран буквы из номера документа в формате
            //"Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
            //класса StringBuilder).
            docHandler.showInUpperCaseOnlyLetters(documentNumber);

            //Проверить содержит ли номер документа последовательность abc и
            //вывети сообщение содержит или нет(причем, abc и ABC считается
            //одинаковой последовательностью).
            if(docHandler.checkIfDocumentNumberContainsSequence(documentNumber, "abc")) {
                System.out.println("Номер документа содержит последовательность abc");
            } else {
                System.out.println("Номер документа не содержит последовательность abc");
            }

            // Проверить начинается ли номер документа с последовательности
            //555.
            if(docHandler.checkIfDocumentNumbersStartsWith(documentNumber, "555")) {
                System.out.println("Номер документа начинается с последовательности 555");
            } else {
                System.out.println("Номер документа не начинается с последовательности 555");
            }

            //Проверить заканчивается ли номер документа на
            //последовательность 1a2b.
            if(docHandler.checkIfDocumentNumbersEndsWith(documentNumber, "1a2b")) {
                System.out.println("Номер документа заканчивается последовательностью 1a2b");
            } else {
                System.out.println("Номер документа не заканчивается последовательностью 1a2b");
            }
        } else {
            System.out.println("Для работы программы необходимо ввести номер документа!");
        }
    }
}
