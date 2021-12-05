public class verify {

    public Boolean verifyEmail(String email){
        return email.matches("(.*)@(.*)\\.(.*)");
    }

    public boolean verifyPassword() {
        return false;
    }
}
