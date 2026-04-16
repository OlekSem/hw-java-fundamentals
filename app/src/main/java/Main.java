import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Task 1
        // "Your time is limited, so don’t waste it living someone else’s life" Steve Jobs
        System.out.println("\"Your time is limited, \n\tso don`t waste it \n\t\tliving someone else`s life\" \n\t\t\tSteve Jobs");
        
        // Task 2
        Scanner scanner = new Scanner(System.in); 

        // System.out.println("Enter the value and the percentage: ");
        // float value = scanner.nextFloat();
        // float percentage =  scanner.nextFloat();

        // System.out.printf("%.2f%% of %.2f is %.2f\n", percentage, value, value * percentage / 100);

        // Task 3
        // System.out.println("Enter three digits one by one: ");

        // int a = scanner.nextInt();
        // int b = scanner.nextInt();
        // int c = scanner.nextInt();

        // System.out.printf("%d%d%d\n", a, b, c);

        // Task 4
        // System.out.println("Enter a six-digit number: ");

        // String num = scanner.next();

        // try {
        //     if(Integer.toString(Integer.parseInt(num)).length() == 6){
        //         System.out.println("" + num.charAt(5) + num.charAt(4) + num.charAt(2) + num.charAt(3) + num.charAt(1) + num.charAt(0));
        //     }
        // }
        // catch (Exception e){
        //     System.err.println(e.getMessage());
        //     System.out.println("The number provided is invalid");
        // }

        // Task 5

        // int month = scanner.nextInt();

        // if( month < 1 || month > 12) {
        //     System.err.println("The month is out of the range");
        // }
        // if (month <= 2 || month == 12) {
        //     System.out.println("Winter");
        // }
        // else if (month <= 5) {
        //     System.out.println("Spring");
        // }
        // else if (month <= 8) {
        //     System.out.println("Summer");
        // }
        // else {
        //     System.out.println("Autumn");
        // }

        // Task 6

        // System.out.println("Enter the value in metres: ");
        // float metres = scanner.nextFloat();

        // System.out.println("What do you want to convert this value to? (1 - miles; 2 - inches; 3 - yards)");
        // int ch = scanner.nextInt();

        // switch (ch) {
        //     case 1:
        //         System.out.println(metres / 1609);
        //         break;
        //     case 2:
        //         System.out.println(metres * 39.37);
        //         break;
        //     case 3:
        //         System.out.println(metres * 1.094);
        //         break;

        //     default:
        //         System.out.println("There is no such a choice");
        //         break;
        // }

        // Task 7

        // System.out.println("Enter the boundaries of the array: ");
        
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();

        // if( a > b) {
        //     int tmp = a;
        //     a = b;
        //     b = tmp;
        // }

        // for (int i = a; i <= b; i++) {
        //     if (i % 2 == 1) {
        //         System.out.println(i);
        //     }
        // }

        // Task 8

        // System.out.println("Enter the boundaries of the table of multiplication: ");
        
        // int a = scanner.nextInt();
        // int b = scanner.nextInt();

        // if( a > b) {
        //     int tmp = a;
        //     a = b;
        //     b = tmp;
        // }

        // for (int i = a; i <= b; i++){
        //     for (int k = 1; k <= 10; k++){
        //         System.out.printf("%dx%d=%d\t", i, k, i * k);
        //     }
        //     System.out.printf("\n");
        // }

        // Task 9

        // int[] arr = new int[20];
        // Random random = new Random();

        // int min = Integer.MAX_VALUE;
        // int max = Integer.MIN_VALUE;

        // int negative = 0;
        // int positive = 0;
        // int zeros = 0;

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = random.nextInt(21) - 10;

        //     if (arr[i] < min) min = arr[i];
        //     if (arr[i] > max) max = arr[i];

        //     if (arr[i] < 0) negative++;
        //     else if (arr[i] > 0) positive++;
        //     else zeros++;
        // }

        // System.out.println("Min: " + min);
        // System.out.println("Max: " + max);
        // System.out.println("Negative: " + negative);
        // System.out.println("Positive: " + positive);
        // System.out.println("Zeros: " + zeros);

        // Task 10

        // int[] arr = new int[20];
        // Random random = new Random();

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = random.nextInt(21) - 10;
        // }

        // List<Integer> evens = new ArrayList<>();
        // List<Integer> odds = new ArrayList<>();
        // List<Integer> negatives = new ArrayList<>();
        // List<Integer> positives = new ArrayList<>();

        // for (int num : arr) {
        //     if (num % 2 == 0) evens.add(num);
        //     else odds.add(num);

        //     if (num < 0) negatives.add(num);
        //     else if (num > 0) positives.add(num);
        // }

        // System.out.println("Evens: " + evens);
        // System.out.println("Odds: " + odds);
        // System.out.println("Negatives: " + negatives);
        // System.out.println("Positives: " + positives);

        // Task 11

        // drawLine('h', 10, '&');
        // drawLine('v', 4, '%');

        // Task 12

        // int[] arr = {5, -2, 10, 3, 0, 7};

        // System.out.println(Arrays.toString(arr));
        // bubbleSort(arr, "asc");
        // System.out.println(Arrays.toString(arr));
        // bubbleSort(arr, "desc");
        // System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, String order) {
        if(order.equals("asc")) {
            for(int i = arr.length; i > 1; i --) {
                for(int k = 0; k < i - 1; k ++) {
                    if (arr[k] > arr[k + 1]) {
                        int tmp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = tmp;
                    }
                }
            }
        }
        else if(order.equals("desc")) {
            for(int i = arr.length; i > 1; i --) {
                for(int k = 0; k < i - 1; k ++) {
                    if (arr[k] < arr[k + 1]) {
                        int tmp = arr[k];
                        arr[k] = arr[k + 1];
                        arr[k + 1] = tmp;
                    }
                }
            }
        }
        else {
            System.out.println("Order is invalid");
        }
    }

    public static void drawLine(char direction, int length, char character) {
        if (direction == 'h') {
            for (int i = 0; i < length; i ++){
                System.out.print(character);
            }
            System.out.print('\n');
        }
        else if (direction == 'v') {
            for (int i = 0; i < length; i ++){
                System.out.println(character);
            }   
        }
        else {
            System.out.println("Invalid direction");
        }
    }
}
