class Interface {

  String AccountType;

  // constructor accepting single value
  Interface(String accou) {
  AccountType = accou;
    System.out.println(" Type of Account" + AccountType);
  }

  public static void interface(String[] args) {

    // call constructor by passing a single value
    Interface obj1 = new Interface("Current Account");
    Interface obj2 = new Interface("Saving Account");
    Interface obj3 = new Interface("ISA");
  }
}

/* Reference: This code is written by me and the help of https://www.programiz.com/java-programming/constructors
Reference list entry: Can we return this keyword from a method in java (no date). Available at: Java Constructors (With Examples) (no date). Available at: https://www.programiz.com/java-programming/constructors.*/