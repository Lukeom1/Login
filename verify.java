public class verify {

    public Boolean verifyEmail(String email){
        return email.matches("(.*)@(.*)\\.(.*)");
    }

    public boolean verifyPassword(String password) {
        if (password.length() >= 7){
            return password.matches(".*[a-zA-Z].*");
        }
        else return false;
    }
}
