package old.unitTests.RegExp.user.model;

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
        if (validatePassword(password)) {
            this.password = password;
//            System.out.println("Ok!");
        } else {
            System.out.println("pass" + " => is not valid");
        }
    }

    // MY SOLUTION > =====================================

    // first solution
    private boolean validatePassword(String password) {
        // crypto:
//        return passCode(password) == 31;

        boolean[] err = {false, false, false, false, false};

        if (!(password.length() < 8)) {
            err[0] = true;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)){
                err[1] = true;
            }
            if (Character.isLowerCase(ch)){
                err[2] = true;
            }
            if (Character.isDigit(ch)){
                err[3] = true;
            }
            if (ch == '_' || ch == '-' || ch == '.' || ch == '%' || ch == '@' || ch == '!'){
                err[4] = true;
            }
        }
        if (err[0] && err[1] && err[2] && err[3] && err[4]){
            return true;
        }
        return false;
    }

    // XOR
    public byte passCode (String pass){
        byte res = 0;
        if (pass.length() >= 8){
            res |= 1; // res = res | 1  (||)- работает с булеен
        }
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (Character.isUpperCase(c)){
                res |= 2;
            }
            if (Character.isLowerCase(c)){
                res |= 4;
            }
            if (Character.isDigit(c)){
                res |= 8;
            }
//            if (err[0] && err[1] && err[2] && err[3] && err[4]){
//                res |= 16;
//            }
        }
        return res;
    }


//    second solution
//    private boolean isCorrectUpper(String pass){
//        for (int i = 0; i < pass.length(); i++) {
//            char ch = pass.charAt(i);
//            if (Character.isUpperCase(ch))
//            return true;
//        }
//        return false;
//    }
//    private boolean isCorrectDig(String pass){
//        for (int i = 0; i < pass.length(); i++) {
//            char ch = pass.charAt(i);
//            if (Character.isLowerCase(ch))
//                return true;
//        }
//        return false;
//    }
//    private boolean isCorrectLower(String pass){
//        for (int i = 0; i < pass.length(); i++) {
//            char ch = pass.charAt(i);
//            if (Character.isDigit(ch))
//                return true;
//        }
//        return false;
//    }
//    private boolean isCorrectSymbol(String pass){
//        for (int i = 0; i < pass.length(); i++) {
//            char ch = pass.charAt(i);
//            if (ch == '_' || ch == '-' || ch == '.' || ch == '%' || ch == '@' || ch == '!'){
//                return true;
//            }
//        }
//        return false;
//    }
//
//    private boolean validatePassword(String password) {
//
//        if(password.length() < 8) {
//            return false;
//        }
//
//        if (!isCorrectUpper(password)){
//            return false;
//        }
//
//        if (!isCorrectLower(password)){
//            return false;
//        }
//
//        if (!isCorrectDig(password)){
//            return false;
//        }
//
//        if (!isCorrectSymbol(password)){
//            return false;
//        }
//
//        return true;
//    }

    // my solution < =====================================

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

