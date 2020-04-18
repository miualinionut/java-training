package code._4_student_effort;

import code._2_challenge._2_foobarqix.FooBarQix;

import java.util.Arrays;

public class Main {

    public static String fizzBuzz(int target) {
        String s = "";
        boolean flag = false;
        for (int i = 1; i <= target; i++) {
            if (i % 3 == 0) {
                s += "Fizz";
                flag = true;
            }
            if (i % 5 == 0) {
                s += "Buzz";
                flag = true;
            }
            if (!flag) {
                s += i;
            }

            s += "\n";
            flag = false;
        }

        return s;
    }

    public static String fizzBuzzRizzJazz(int target) {
        String s = "";
        boolean flag = false;
        for (int i = 1; i <= target; i++) {
            if (i % 3 == 0) {
                s += "Fizz";
                flag = true;
            }
            if (i % 5 == 0) {
                s += "Buzz";
                flag = true;
            }
            if (i % 7 == 0) {
                s += "Rizz";
                flag = true;
            }
            if (i % 11 == 0) {
                s += "Jazz";
                flag = true;
            }

            if (!flag) {
                s += i;
            }

            s += "\n";
            flag = false;
        }

        return s;
    }

    static String fooBarQix(int number) {
        String s = "";
        if (number % 3 == 0) {
            s += "Foo";
        }
        if (number % 5 == 0) {
            s += "Bar";
        }
        if (number % 7 == 0) {
            s += "Qix";
        }

        char[] digitsOfNumber = String.valueOf(number).toCharArray();
        for (char c : digitsOfNumber) {
            switch (c) {
                case '3':
                    s += "Foo";
                    break;
                case '5':
                    s += "Bar";
                    break;
                case '7':
                    s += "Qix";
                    break;
            }
        }

        if (s.equals("")) {
            return String.valueOf(number);
        }
        return s;
    }


    static String fooBarQix2(int number) {
        String s = "";
        boolean flag = false;

        if (number % 3 == 0) {
            s += "Foo";
            flag = true;
        }
        if (number % 5 == 0) {
            s += "Bar";
            flag = true;
        }
        if (number % 7 == 0) {
            s += "Qix";
            flag = true;
        }

        char[] digitsOfNumber = String.valueOf(number).toCharArray();
        for (char c : digitsOfNumber) {
            switch (c) {
                case '3':
                    s += "Foo";
                    break;
                case '5':
                    s += "Bar";
                    break;
                case '7':
                    s += "Qix";
                    break;
                case '0':
                    s += "*";
                    break;
                default:
                    if (!flag)
                        s += c;
            }
        }

        return s;
    }


    static int pairOf2(int[] arr) {
        int counter = 0;

        // sort - nlogn complexity
        Arrays.sort(arr);

        int length = arr.length;
        // check if first element is > 0 or the last is < 0
        if (arr[0] > 0 || (arr[length - 1] < 0)) {
            return 0;
        }

        int i = 0, j = length - 1;

        while (arr[i] < 0 && arr[j] > 0) {
            if (arr[i] + arr[j] == 0) {
                counter++;
                j--;
                i++;
            }
            if (Math.abs(arr[i]) < arr[j]) {
                j--;
            }
            if (Math.abs(arr[i]) > arr[j]) {
                i++;
            }
        }

        return counter;
    }

    static int pairOf3(int[] arr) {
        int counter = 0;
        int length = arr.length;
        int firstPositive = 0;

        Arrays.sort(arr);
        boolean [] checkIndex = new boolean[length];

        // get index of first positive number in array
        for (int i = 0; i < length; i++) {
            if (arr[i] > 0) {
                firstPositive = i;
                break;
            }
        }

        // check if first element is > 0 or the last is < 0
        if (arr[0] > 0 || (arr[length - 1] < 0)) {
            return 0;
        }
        // i tried to reuse pairOf2, with some additional checks
        // but the complexity would be the same or badly

        for (int i = 0; i < length; i++) {
            for (int j = firstPositive; j < length; j++) {
                for (int k = i + 1; k < length; k++) {
                    if (k == j)
                        continue;
                    if ((arr[i] + arr[j] + arr[k] == 0) &&
                            (!checkIndex[i] && !checkIndex[j] && !checkIndex[k])) {
                        counter++;
                        j--;
                        i++;
                        checkIndex[i] = true;
                        checkIndex[j] = true;
                        checkIndex[k] = true;
                        // if a pair was found, can't find another with the same arr[i] and arr[j]
                        break;
                    }

                }
            }
        }

        return counter;
    }


    public static void main(String[] args) {
        //TODO put your code changes in here
//    System.out.println(fizzBuzz(100));
//    System.out.println(fizzBuzzRizzJazz(100));
//    System.out.println(fooBarQix(29));
//    System.out.println(fooBarQix2(10101));
        int[] arr = {3, 2, -3, -2, 3, 0};
        int[] arr1 = {1, 1, 0, -1, -1};
        int[] arr2 = {5, 9, -5, 7, -5};
        int[] arr3 = {-1, -1, -1, 2};

//        System.out.println(pairOf2(arr));
        System.out.println(pairOf3(arr));

    }
}
