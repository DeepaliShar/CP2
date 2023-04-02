import java.util.*;

import javax.sound.sampled.SourceDataLine;
public class Quiz2 {
    public static void main(String[] args) {
        
        String s1=new String("Java");
          String s2=new String("Java");
          System.out.println(s1==s2);
          System.out.println(s1.equals(s2));
          System.out.println(s1==s2.intern());
          System.out.println(s1.intern()==s2.intern());
          System.out.println(s1.intern()==s2);
        //   System.out.println("0".indent(0));
        //   System.out.println("1".indent(1));
        //   System.out.println("2".indent(2));
        //   System.out.println("3".indent(3));
        //   System.out.println("4".indent(4));
        //   System.out.println("5".indent(5));
        System.out.println("A".compareTo("B"));
        System.out.println("B".compareTo("A"));
        String string="Java";
        StringBuffer buffer=new StringBuffer(string);
        StringBuilder builder=new StringBuilder(string);
        System.out.println(string.equals(buffer));
        System.out.println(string.equals(builder));
        System.out.println(buffer.equals(builder));
        "ABC123abc".chars().forEach(System.out::println);
        String str1="null"+null+1;
        System.out.println(str1);
        // String str2=1+null+"null";
        // System.out.println(str2);
        //error
        String str2="Java Concept Of The Day";
        System.out.println(str2.indexOf('a')+str2.indexOf("Day"));
        System.out.println(str2.indexOf('a',5));
        System.out.println(str2.replace("a","A".lastIndexOf('a')));



    }
}
