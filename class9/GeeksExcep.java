
class GeeksExcep {
    public static void main(String[] args) {
      
        // String s set an empty string and calling getLength()
        String s = "";
      
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught 1");
        }

        // String s set to a value and calling getLength()
        // s = "GeeksforGeeks";
      
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught 2");
        }

        // Setting s as null and calling getLength()
        s = null;
      
        try {
            System.out.println(getLength(s));
        }
        catch (IllegalArgumentException e) {
            System.out.println(
                "IllegalArgumentException caught 3");
        }
    }

    public static int getLength(String s)
    {
        if (s == null)
            throw new IllegalArgumentException(
                "The argument cannot be null in main");
      
        return s.length();
    }
}