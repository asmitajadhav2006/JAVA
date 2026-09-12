public class practice {
    public static void reverseprint(String []str) {
        String s=str[0];
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("Reversed string: " + rev);
    }}
    /*static int getvowelscount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args){
        String str="Love";
        System.out.println(getvowelscount(str));

    }
}*/
    /*static void printlength(String str) {
        int count=0;
        for(char ch:str){
            count++;
        }*/
       //we cannot do this for finding the string length without using length method so we are using .tochararray()
        /*static int getlengthofstring(String str) {
            
            char[] ch=str.toCharArray();
            int len=ch.length;
            return len;
        }
        public static void main(String[] args) {
            String str="LOVE";
            int length=getlengthofstring(str);
            System.out.println("Length of string: "+length);
        }}
        */
       //this is for access each character of string  
        /*static void  printstring(String str) {
          int n=str.length();
          for(int i=0;i<n;i++){
              char ch=str.charAt(i);
              System.out.println(ch);
          }}
         public static void main(String[] args) {
          String str="LOVE";
          printstring(str);
         }}*/
  /*   String s="LOVE";
    String rev=" ";
    for(int i=s.length()-1;i>=0;i--){
        rev=rev+s.charAt(i);
    }
    System.out.println("Reversed string: " + rev);
    String str="LOVE";
   String s=str.toString();
   System.out.println("String value: "+s);*/
   /*public class Practice {

    public static String removeA(String s) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a') {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeA("banana"));
    }}
 */
