package Methods.equals;

public class Password {

    private String secret;

    public Password(String secret)
    {
        this.secret = secret;
    }

    public boolean checkBroken(String attempt){
        return secret == attempt;
    }

    public boolean check(String attempt){
        return attempt.equals(secret);
    }

        // ===== CHALLENGE 1  =====
    // create a method called sameAs which takes in a string 'other'. 
    // Return true if THIS Password and another have the same secret.
    // (Inside the class you can reach other.secret.)
    // to test, create a new object with a new password

    public boolean sameAs(Password other) {
        return secret.equals(other.secret);
    }

     // ===== CHALLENGE 2 =====
     // Create another method called "change()" two arguements, 
    // Change the password. The user must type the new password twice.
    // Change secret and return true ONLY if:
    //     both typed passwords match each other, AND
    //     the new password is different from the current one.
    // Otherwise change nothing and return false.
    //     secret "lion": change("tiger", "tiger") -> true   (secret is now "tiger")
    //     secret "lion": change("tiger", "tigre") -> false  (typo)
    //     secret "lion": change("lion", "lion")   -> false  (same as old)
    // Tools: equals, if/else, &&, !

    public boolean change(String newPassOne, String newPassTwo) {
        if (newPassOne.equals(newPassTwo) && !newPassOne.equals(secret)) {
            System.out.println("Secret is now " + newPassOne);
            return true;
        }
        else {
            return false;
        }
    }

    public 

}
