public class Main {
        public static void main(String[]args){

            // -- String Functions in JAVA --

            String s = "abcdef";

            // -- to return the size of the String --
            System.out.println("Length : "+s.length());

            // -- to find the char value @ particular index --
            System.out.println("Character At : "+s.charAt(3));

            //--- to print the substring of main string by index value--
            System.out.println("Substring : "+s.substring(1,3));
            // it prints upto second value -1  like bc not d @ 3

            // -- to check the substring presense --
            System.out.println("Contains : "+s.contains("bcd"));

            // -- to compare the two Strings
            System.out.println("Compares : "+s.equals("abcdef"));

            // --it do not see the case used just equals the ch--
            System.out.println("Compare irrespective of cases used : "+s.equalsIgnoreCase("abCdEf"));

            // -- 

        }    
}
