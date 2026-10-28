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

        Email michael = new Email("michael.harrell@nhvweb.net");
        Email john = new Email("john.marran@student.nhvweb.net");

        System.out.println(michael.toString());
        System.out.println(michael.getAtIndex());
        System.out.println(john.getAtIndex());
        System.out.println(michael.getUser());
        System.out.println(john.getUser());
        System.out.println(michael.getDomain());
        System.out.println(john.getDomain());
        System.out.println(john.getFirstName());
        System.out.println(michael.getFirstName());
        System.out.println(john.changeDomain("yahoo.com"));
        System.out.println(michael.changeDomain("comcast.net"));
        System.out.println(john.isSchool());
        System.out.println(michael.isSchool());
        System.out.println(john.getLabel());
        System.out.println(michael.getLabel());
    }

}
//0
//1
//2
//-1
//-1