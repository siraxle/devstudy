package ownResearch;

public class Substring {
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        int temp = 0;
        String str = "";
        for (int i = 0; i < greeting.length(); i++){
            if (greeting.charAt(i) ==' ' || i == greeting.length()-1){
                str = greeting.substring(temp, i+1);
                System.out.print(str.trim());
                temp = i;
            }
        }

        //System.out.println(greeting.charAt(6));
        //String location = greeting.substring(7, 12);
        //System.out.println(location);
    }
}
