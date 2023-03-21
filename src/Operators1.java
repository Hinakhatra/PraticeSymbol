public class Operators1 {
    static int a = 19;
    static int b = 20;
    static int c = 19;
    static String name ="Rajesh";
    static String name1 = "I am living in london";
    static String name2 = "rajesh";
    static String value = "£345,6";
    static double amount = 3453.00;
    static String surname = "Patel";

    public static void main(String[] args) {
        System.out.println(name.contentEquals(surname));
        System.out.println(name.format(surname));
        System.out.println(name.isEmpty());//false
        System.out.println(name1.lastIndexOf("london"));
        System.out.println(name1.lastIndexOf("d"));
        System.out.println(name.replace("j",""));
        System.out.println(name.replaceFirst("R",""));
        // String value1 = value.replaceAll("£","");
       //System.out.println(value1);
      // String value2 = value1.replaceAll(",","");
       //System.out.println(value2);
        //  double amount1 = Double.parseDouble(value2);//for convert string into double
       // System.out.println(amount1);
      //  System.out.println(amount1*2);
      // String amountText = String.valueOf(amount);//for convert double into string
      // System.out.println(amountText);//it's string now you can't multiply it

       // System.out.println(name1.toUpperCase());
       /// System.out.println(name1.toLowerCase());
       // String[]parts = name1.split(" ");
       // System.out.println(parts[0]);
       // System.out.println(parts[1]);
       // System.out.println(parts[2]);
      //  System.out.println(parts[3]);
      //  System.out.println(parts[4]);
      //  System.out.println(name1.replaceAll("I am","she is"));
        //System.out.println(name1.startsWith("she"));
        //System.out.println(name1.endsWith("n"));
        //System.out.println(name.contains("k"));
        //System.out.println(name.compareTo(name2));
       // System.out.println(name.equals(name2));
        //System.out.println(name.equalsIgnoreCase(name2));










      //  System.out.println("Raj\tesh");//one space
       // System.out.println("Raj\besh");//one letter delete
       // System.out.println("Raj\nesh");//new line
       // System.out.println("Raj\resh");//remains right side
      //  System.out.println("Raj\'esh");//add singel quote
      //  System.out.println("Raj\"esh");//add double quote
      //  System.out.println("Raj\\esh");//add backward slash




       // System.out.println(c%a);
       //System.out.println(++c); //18
       // System.out.println(c);  //18
       // System.out.println(c++);//18
       // System.out.println(c); //19
       // System.out.println(--b);//19
       // System.out.println(b--);//19
       // System.out.println(b);//18

      //  System.out.println(a==b);//false//equal
        //System.out.println(a==c);//true
       // System.out.println(a!=b);//true//not equal
      //  System.out.println(a!=c);//false
      //  System.out.println(a>b);//false
      //  System.out.println(a<b);//true
      //  System.out.println(a>=b);//false//one condition match
      //  System.out.println(b<=c);//false
       // System.out.println(b>=a);//true
       // System.out.println(a>=c);//true

     // Logical operators && (logical And)
       // System.out.println((a>b)&&(b<c));//false//both condition true then true
       // System.out.println((a<b)&&(b>c));//true

        // || logical or // any one condition true/false answer true
      //  System.out.println((a>b)||(b<c));//false
       // System.out.println((a<b)||(b<c));//true

        //Logical Not !
        //System.out.println(!(a>b)||(b<c));//true
       // System.out.println (!(a<b)&&(b>c));//false

        // Assignment ==
        //int c=a+b;
       // System.out.println(c);
       // System.out.println(c+=a);//c+a
       // System.out.println(c-=a);//c-a//0


    }

}
