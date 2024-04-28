public class CredentialValidator {
    private static final int FIELD_LENGTH = 20;
    public static void validate (String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login.length() >= FIELD_LENGTH) {
            throw new WrongLoginException("Длина логина должна быть меньше 20 символов!");
        } else if (password.length() >= FIELD_LENGTH) {
            throw new WrongPasswordException("Длина пароля должна быть меньше 20 символов!");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают!");
        } else {
            System.out.println("Данные валидны");
        }
    }
}
