package stringFunction;

public class StringFunctionDemo {
//TestNG is a testing fram work.

    public void String() {
        String obj = new String("Sadia");

        char firstLetter = obj.charAt(0);
        System.out.println(firstLetter);

        int length = obj.length();
        System.out.println(length);

        String lower = obj.toLowerCase();
        System.out.println(lower);

        String upper = obj.toUpperCase();
        System.out.println(upper);

        String newSpelling = obj.replace('i', 'e');
        System.out.println(newSpelling);

        String fullName = obj.concat("Sadia");
        System.out.println(fullName);

        String[] twoNames = fullName.split("");
        System.out.println(twoNames[0]);
        System.out.println(twoNames[1]);

    }

    public static void reverseString() {
        String name = "Sadia"; // aidaS
        // char lastLetter = name.charAt(5);


        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.println(name.charAt(i));

        }

    }

    //another way of reverse
    public static void reverseString2() {
        String name = "Sadia";
        String reverse = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);// string + char = String
        }

        System.out.println(reverse);

    }

    // take any string and validate that it is palindrom or not
    public static void palindrome() {
        String name = "madam";
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i); // string + char = String;

        }
        System.out.println(reverse);

        if (reverse.equals(name)) {
            System.out.println("This is a palindrome");
        } else {
            System.out.println("This is not palindrome");
        }
    }


        public static void stringToInt() {
           // int a = 200;
           // System.out.println(a + 100);
            String dollar = "200";
            System.out.println(dollar + 100);
            int newDollar = Integer.valueOf(dollar);
            System.out.println(newDollar + 100);
        }


    public static void intToString() {
        int a = 200;
        System.out.println(a + 300);

        String newAvalue = String.valueOf(a);
        System.out.println(newAvalue + 300);
    }

        public static void StringBufferDemo(){
        StringBuffer sb = new StringBuffer("Hello");
        sb.append("Batch7");
            System.out.println(sb);

            sb.insert(6,"Participant");
            System.out.println(sb);

            sb.reverse();
            System.out.println(sb);

    }





    public static void StringFunction2() {
        String firstString = "We are learing Java as part of the Automation Course";
        firstString.toUpperCase(); // calling the method java created
        firstString.toLowerCase();
        firstString.length();
        char firstLetter = firstString.charAt(0);
        System.out.println(firstLetter);
        String oneWord = firstString.substring(3, 5);// substring starts with 0,
        // and ends with index+1
        System.out.println(oneWord);

        boolean javaWord = firstString.contains("java");
        System.out.println(javaWord);

        String[] words = firstString.split("");
        System.out.println(words.length);
    }



    public static void main(String[] args) {
       // StringFunction2();// calling the method I created
        //reverseString();
        //reverseString2();


        // palindrome();
        //StringToInt();
       // intToString();
        // StringBufferDemo();


    }

}
