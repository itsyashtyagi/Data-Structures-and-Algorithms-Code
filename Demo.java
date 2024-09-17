 // How do you reverse a string?

public class Demo{

    // Maximum charter in a string
    public static void maximunCharcter(String str){
        char maximumChar = str.charAt(0);
        int maximunnum = 0;
        for(int i=0;i< str.length();i++){
            int num = 0;
            char newChar = str.charAt(i);
            for(int j=0;j<str.length();j++){
                if(newChar == str.charAt(j)){
                    num++;
                    if(maximunnum < num ){
                        maximunnum = num;
                        maximumChar = newChar;
                    }
                }
            } 
        }
       System.out.println("The maximun charcter in string is : " + maximumChar + " it is appeared : " + maximunnum + " times");
    }

    public static void reverseString(String str){
        StringBuilder newStr = new StringBuilder();
        for(int i=str.length() -1;i >= 0;i--){
            char newChar = str.charAt(i); // 8 "i"
            newStr.append(newChar);
        }
       System.out.println("The reverse string is : " + newStr);
    }

    public static void main(String args[]){
        String str = "yash tyagi sambhal";
        maximunCharcter(str);
    }
}