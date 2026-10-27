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
        return address.substring(address.indexOf("@"), address.length());
    }

    public boolean isSchool() {
        return false;
    }


}
