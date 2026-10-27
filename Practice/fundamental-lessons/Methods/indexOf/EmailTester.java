package Methods.indexOf;
/*
 * EmailTester: uses indexOf on Strings and Email objects.
 * Predict each line BEFORE you run.
 *
 * Run:  javac Email.java EmailTester.java
 *       java EmailTester
 */
public class EmailTester {
    
    public static void main(String[] args) {
        
        String word = "banana";
        System.out.println(word.indexOf("b"));
        System.out.println(word.indexOf("a"));
        System.out.println(word.indexOf("nan"));
        System.out.println(word.indexOf("z"));
        System.out.println(word.indexOf("B"));

        Email michael = new Email("mharrell@nhvweb.net");
        Email john = new Email("jmarran@student.nhvweb.net");

        System.out.println(michael.toString());
        System.out.println(michael.getAtIndex());
        System.out.println(john.getAtIndex());
        System.out.println(michael.getUser());
        System.out.println(john.getUser());
        System.out.println(michael.getDomain());
        System.out.println(john.getDomain());
    }

}
//0
//1
//2
//-1
//-1