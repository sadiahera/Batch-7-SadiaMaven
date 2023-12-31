package loopDemo;

public class LoopMyname {
     /*
    Write your name and check if there is/are any vowels there. if found print them.
    My name =SADIA
    Vowel=A ,I
     */


    public void Mynamevowels(){
        // a,e,i,o,u, vowels
       String name= "SadiaHera";
        int lenthofName = name.length();

            System.out.println(lenthofName);

            char sixthLetter = name.charAt(5);
        System.out.println(sixthLetter);

        char ninthLetter = name.charAt(8);
        System.out.println(ninthLetter);

        char firstLetter=name.charAt(10);
        System.out.println(firstLetter);
        for (int i=0; i< name.length(); i++){

            if (name.charAt(i)== 'a' || name.charAt(i)== 'e' || name.charAt(i)== 'i' ||
                    name.charAt(i)== 'o' || name.charAt(i)== 'u' ){
                System.out.println(name.charAt(i) + "is vowel");
            }
        }


    }

    public static void main(String[] args) {
        LoopMyname obj = new LoopMyname();
        obj.Mynamevowels();
    }
}
