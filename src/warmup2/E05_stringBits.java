package warmup2;

public class E05_stringBits {
    public static void main(String[] args) {

/*        Given a string, return a new string made of every
other char starting with the first, so "Hello" yields "Hlo".

        stringBits("Hello") → "Hlo"
        stringBits("Hi") → "H"
        stringBits("Heeololeo") → "Hello"*/

        // one appears one omits


        System.out.println( stringBits("Hello"));
    }

    private static String stringBits(String str) {

        String str2="";

        for (int i =0; i <= str.length()-1; i++) {
                if(i%2==0) str2+=str.charAt(i);
        }
        return str2;
    }
}