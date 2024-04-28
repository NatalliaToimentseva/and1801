public class Demo {
    public static void main(String[] args) {
        try {
            CredentialValidator.validate("There is more than twenty symbol", "raspberry", "raspberry");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n"); //Длина логина должна быть меньше 20 символов!

        try {
            CredentialValidator.validate("alias", "There is more than twenty symbol", "raspberry"); //в данном случае совпадение не принципиально
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n"); //Длина пароля должна быть меньше 20 символов!

        try {
            CredentialValidator.validate("alias", "raspberry", "rasspbery");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("\n"); //Пароль и подтверждение пароля не совпадают!

        try {
            CredentialValidator.validate("alias", "raspberry", "raspberry");
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        } //Данные валидны
    }
}