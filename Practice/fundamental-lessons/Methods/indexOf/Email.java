package Methods.indexOf;

    // create the following methods with the correct return type
    // add one attribue for the address
    // create a constructor that assigns an address to this address
    // create 
    // toString
    // getAtIndex
    // getUser
    // getDomain
    // isSchool

public class Email {
    
    private String address;
    private String fullName;

    public Email(String address) {
        this.address = address;
    }

    public String toString() {
        return address;
    }
    //  getAtIndex
    // Where is thee @ ? mharrell@hcvsd.org
    public int getAtIndex() {
        return address.indexOf("@");
    }
    // return everthing left of @
    // method substring - - cuts out part of a string
    // String substring(int from, int to)   from index "from" up to, NOT including, "to"
    public String getUser() {
        return address.substring(0, address.indexOf("@"));
    }

    public String getDomain() {
        return address.substring(address.indexOf("@") + 1, address.length());
    }

    public boolean isSchool() {
        return address.indexOf("nhvweb.net") != -1;
    }


    // ===== CHALLENGE 1 =====
// Method name: getFirstName
// School addresses are formatted first.last@cuny.edu
// Return the first name: the part of the user before the ".".
//     "ana.lee@hcvsd.org" -> "ana"
// Hint: call your helper method getUser() first and store it in a variable.
// Hint: find the "." in that variable, not in address.
// Tools: getUser, indexOf, substring

    public String getFirstName() {
        fullName = getUser();
        return fullName.substring(0, fullName.indexOf("."));
    }

// ===== CHALLENGE 2 =====
// Method name: changeDomain
// Return a new address with the same user but a different domain.
//     "ana@hcvsd.org", "gmail.com" -> "ana@gmail.com"
// Reminder: this method must TAKE IN a parameter (the new domain).
//     What type is it? What will you name it?
// Hint: you don't need indexOf. getUser() already does the cutting.
// Hint: join Strings with +. Don't forget the "@".
// Tools: getUser, +
    
    public String changeDomain(String newDomain) {
        return getUser() + "@" + newDomain;
    }

    // ===== CHALLENGE 3 =====
    // Method name: getLabel
    // Label the address as "School" or "Personal", followed by the domain.
    //     "ana.lee@hcvsd.org" -> "School: hcvsd.org"
    //     "ana99@gmail.com"   -> "Personal: gmail.com"
    // Hint: isSchool() already returns true or false, so use it as your condition.
    // Hint: every path through the method needs a return.
    // Tools: if/else, isSchool, getDomain

    public String getLabel() {
        if (isSchool() == true) {
            return "School: " + getDomain();
        }
        else {
            return "Personal: " + getDomain();
        }
    }

    public boolean isStaffFormat() {
        return address.indexOf("nhvweb.net") != -1 && toString(getUser()).indexOf(".") == -1;
    }

}
