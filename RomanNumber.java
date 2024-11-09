import java.util.Scanner;

public class RomanNumber{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer less than 3999: ");

        int number = scan.nextInt();
        
        if(number <= 0 || number > 3999){
            System.out.println("Please enter integer between 1 to 3999.");
            return;
        }

        String result = "";

        int digit = number % 10;
        result = convertRoman(digit, 'I', 'V', 'X') + result;
        number = number / 10;
         
        digit = number % 10;
        result = convertRoman(digit, 'X', 'L', 'C') + result;
        number = number / 10;

        digit = number % 10;
        result = convertRoman(digit, 'C', 'D', 'M') + result;
        number = number / 10;
        
        digit = number % 10;
        result = convertRoman(digit, 'M', ' ', ' ') + result;
       
        System.out.println("It is converted to Roman number: " + result);

    }

        public static String convertRoman(int digit, char a, char b, char c){
            
            String str = "";

            switch(digit){
                case 1:
                    str += a;
                    break;

                case 2:
                    str = str + a + a;
                    break;

                case 3:
                    str = str + a + a + a;
                    break;

                case 4:
                    str = str + a + b;
                    break;

                case 5:
                    str = str + b;
                    break;

                case 6:
                    str = str + b + a;
                    break;

                case 7:
                    str = str + b + a + a;
                    break;

                case 8: 
                    str = str + b + a + a + a;
                    break;

                case 9: 
                    str = str + a + c;
                    break;

                default:
                    str += "";
                    break;
            }  

            return str;
        }
}