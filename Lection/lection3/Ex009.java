// Напишите метод, который сжимает строку.


// Пример: вход aaaabbbcaaadd.
// результат - a4b3ca3d2

// package lection3;

// public class lection3_3 {
//     public static void main(String[] args) {
//         String myString = "aaaabbbcaaadd";
//         StringBuilder resString = new StringBuilder();
//         int count = 1;
//         for (int i = 0; i < myString.length()-1; i++) {
//             if (myString.charAt(i + 1) == myString.charAt(i)) {
//                 count++;
//             }
//             else {
//                 resString.append(myString.charAt(i)).append(count);
//                 count = 1;
//             }
//         }
//         resString.append(myString.charAt(myString.length()-1)).append(count);
//         System.out.println(resString);
//     }
// }
