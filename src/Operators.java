public class Operators {
    static int a = 10;
    static int b = 20;
    static int c = 30;
    static int d = 17;
    static String name = "Harry";
    static String name2 = "potter";
    static  String name3 = "I want to get £200,so that I can buy my $item";
    static  String value = "£3456";
    public static void main(String[] args) {
        String value1 = value.replaceAll("£","");
        System.out.println(value1);
        double amount = Double.parseDouble(value1);
        System.out.println(amount);
        System.out.println(amount*2);



       // System.out.println("My name is rajesh");
      //  System.out.println("raj\tesh");
       // System.out.println("raj\besh");
       // System.out.println("raj\nesh");
      //  System.out.println("raj\resh");
       // System.out.println("raj\fesh");
       // System.out.println("raj\'esh");
       // System.out.println("raj\"esh");
      //  System.out.println("raj\\esh");
      //  System.out.println(name+"\n"+name2);
       // System.out.println(name3.toUpperCase());
        //System.out.println(name3.toLowerCase());
      //  String[]parts = name3.split(" ");
       // System.out.println(parts[0]);
       // System.out.println(parts[1]);
       // System.out.println(parts[2]);
        //System.out.println(name3.replaceAll("I","She"));
       // System.out.println(name3.startsWith("She"));
        //System.out.println(name3.startsWith("I"));
       // System.out.println(name2.endsWith("r"));
       // System.out.println(name2.endsWith("R"));
       // System.out.println(name.contains("r"));
       // System.out.println(name.compareTo(name2));



        // System.out.println(a+b);
       // System.out.println(a+b+c);
      //  System.out.println(a-b);
     //   System.out.println(a*b);
     //   System.out.println(c/a);
     //  System.out.println(c%a);
       // System.out.println(++a);
      //  System.out.println(a);
      //  System.out.println(a++);
        //System.out.println(a);
       // System.out.println(b--);
       // System.out.println(b);
      //  System.out.println(--c);
       // System.out.println(c);
      //  System.out.println(a==b);
      //  System.out.println(a!=c);
      //  System.out.println(a>b);
      //  System.out.println(c<a);
      //  System.out.println(a>=b); //10>=20
      //  System.out.println(b<=a); //20<=10
       // System.out.println(a>b && b<a);
      //  System.out.println((d<c) || (a>b));
       // System.out.println(!(a>b) && !(b<a));
     //   System.out.println(!(d<c) || (a>b));
       // System.out.println(a=b);  //10=20
       // System.out.println(c+=a);
       // System.out.println(c-=b);





    }
}
