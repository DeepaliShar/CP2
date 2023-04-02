public class Quiz {
    public static void main(String[] args) {
        String name="JavaConceptOfTheDay".substring(4);
        System.out.println(name);
        String s="1".repeat(5);
        System.out.println(s);
        System.out.println("1".concat("2").repeat(5).charAt(7));
        System.out.println("Java"==new String("Java"));
        String str="Java\tConcept\tOf\tThe\tDay  ".strip();
        System.out.println(str);
        if("string".toUpperCase()=="STRING")
          System.out.println(true);
        else
          System.out.println(false);
       
        // String str1="Java";
        //   String str2=new String("Java");
        //   System.out.println(str1==str2);
        //   System.out.println(str1.equals(str2));
        //   System.out.println(str1.hashCode()==str2.hashCode());


        // String str1="Java";
        //   String str2=str1.intern();
        //   System.out.println(str1==str2);
        //   System.out.println(str1.equals(str2));
        //   System.out.println(str1.hashCode()==str2.hashCode());

        String str1="Java";
          String str2=str1.intern();
          String str3=new String("Java");
          System.out.println(str1==str2);
          System.out.println(str2==str3);
          System.out.println(str3==str1);

    }
    
}
