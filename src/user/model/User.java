package user.model;

public class User {
    private String email;
    private String password;

    public User(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        if(validatePassword(password)) {
            this.password = password;
            System.out.println("Ok!");
        }
        else {
            System.out.println("pass" + " => is not valid");
        }
    }



    // my solution >
    private boolean isCorrectUpper(String pass){
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isUpperCase(ch))
            return true;
        }
        return false;
    }
    private boolean isCorrectDig(String pass){
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isLowerCase(ch))
                return true;
        }
        return false;
    }
    private boolean isCorrectLower(String pass){
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (Character.isDigit(ch))
                return true;
        }
        return false;
    }
    private boolean isCorrectSymbol(String pass){
        for (int i = 0; i < pass.length(); i++) {
            char ch = pass.charAt(i);
            if (ch == '_' || ch == '-' || ch == '.' || ch == '%' || ch == '@' || ch == '!'){
                return true;
            }
        }
        return false;
    }


    private boolean validatePassword(String password) {

        if(password.length() < 8) {
            return false;
        }

        if (!isCorrectUpper(password)){
            return false;
        }

        if (!isCorrectLower(password)){
            return false;
        }

        if (!isCorrectDig(password)){
            return false;
        }

        if (!isCorrectSymbol(password)){
            return false;
        }

        return true;
    }
    // my solution <


    public void setEmail(String email) {
        if (validateEmail(email)) {
            this.email = email;
//            System.out.println("email:" + email + " => valid");

        } else {
//            System.out.println(email + " => is not valid");
        }
    }

    private boolean validateEmail(String email) {
        int indexAt = email.indexOf('@');
        if (indexAt == -1 || indexAt != email.lastIndexOf('@')) {
            return false;
        }
        if (email.indexOf('.', indexAt) == -1) {
            return false;
        }
        if (email.lastIndexOf('.') > email.length() - 3) {
            return false;
        }

        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
//            if (!((c >= '0' && c <= 'g'))){ // char таблицу смотреть
            if (!(Character.isDigit(c) || Character.isAlphabetic(c) || c == '_' || c == '-' || c == '.' || c == '@')) {
                return false;
            }
        }
        return true;
    }





    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

