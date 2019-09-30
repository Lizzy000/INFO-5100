// Note:
// 1.Complete All Questions
// 2.Deadline : 30th September 2019, 12:00pm

// Q1. Write a Java class named 'Course'
// It should have following members
// courseId
// courseName
// maxCapacity
// professorId
// credits
// int[] studentIds

// Function: registerStudent(int studentId)

// There should be 3 ways to create Course Object (Hint : Use Constructor)
// courseId
// courseId, professorId
// courseId, professorId, credits

// Class should provide getters/setters for all members
// registerStudent method should store all ids in studentIds array.

-----------------------------------------------------------------------------------------------------------------------

// Q2. In the above example, add following validations to setters/constructors
// courseId - should not be negative or 0
// courseName- should be a string with minimum length 10 and maximum 60
// maxCapacity - should not be less than 10 greater than 100
// professorId - should be a six digit integer
// credits - should be a single digit but greater than 0

-----------------------------------------------------------------------------------------------------------------------

// Q3. Add a function called removeDuplicates in Course class
// This function should be called if course has reached the maximum capacity and
// remove all duplicate student Ids and return the new ids

// Ex: Input :[1,6,2,3,2,4,5,6]
// Output: [1,6,2,3,4,5]

public int[] removeDuplicates(int[] studentIds) {

  
  ArrayList<Integer> list = new ArrayList<Integer>();
  
  for(int i = 0; i < studentIds.length; i++) {
    for(int j = i+1; j <studentIds.length; j++) {
      if(studentIds[i] == studentIds[j]) {
        if(!list.contain(studentIds[i])) {
          list.add(studentIds[i]);
        }       
      }
    }
  }
  Integer[] result = new Integer[list.size()];
  return list.toArray(result);
  
}

-----------------------------------------------------------------------------------------------------------------------

// Q4. Implement the following method in Course class.

public int groupsOfStudents(int[] studentIds) {
  int nums = studentIds.length;
  int count = 0;
  
  for(int i = 0; i < nums; i++) {
    if(studentIds[i] % 2 == 0) {
      for(int j = i +1; j <nums; j++) {
        if(studentIds[j] % 2 == 0) {
          count++;
        }
      }
    }
    else {
      for(int j = i +1; j <nums; j++) {
        if(studentIds[j] % 2 != 0) {
          count++;
        }
      }
    }
  return count;
  
}

// The above method takes an array of studentIds as an argument. Find number of pairs of studentsIds whose sum is even
// Example:
// Input : [1,2,3,4,5,6]
// Output : 6
// Explanation: (1 + 3), (1 + 5), (3 + 5), (2 + 4), (2 + 6), (4 + 6)

-----------------------------------------------------------------------------------------------------------------------

// Q5.
// The count-and-say sequence is a sequence of integers with the first five terms as following:
// 1.     1
// 2.     11
// 3.     21
// 4.     1211
// 5.     111221

// 1 is read off as "one 1" or 11.
// 11 is read off as "two 1s" or 21.
// 21 is read off as "one 2, then one 1" or 1211.
// Given an integer n where 1 ≤ n ≤ 30, generate the nth term of the count-and-say sequence.
// Note: Each term of the sequence of integers will be represented as a string.

// Example 1:
// Input: 1
// Output: "1"

// Example 2:
// Input: 4
// Output: "1211"
public String countAndSay(int n) {
  String preString = "1";
        while (--n > 0) {
            StringBuilder sb = new StringBuilder();
            char[] preChars = preString.toCharArray();

            for (int i = 0; i < preChars.length; i++) {
                int count = 1;
                while ((i+1) < preChars.length && preChars[i] == preChars[i+1]) {
                    count++;
                    i++;
                }
                sb.append(String.valueOf(count) + String.valueOf(oldChars[i]));
            }
            preString = sb.toString();
        }

        return preString;
        }
}

-----------------------------------------------------------------------------------------------------------------------

// Q6. Given an input string , reverse the string word by word.
// Example:
// Input : “the sky is blue”
// Output : “blue is sky the”
// Assumptions:
// A word is defined as a sequence of non-space characters.
// The input string does not contain leading or trailing spaces.
// The words are always separated by a single space.

public String reverse(String input) {
  int len = input.length;
  Char[] output = input.toCharArray();
  for(int i = 0; i < len/2; i++) {
      Char temp = "";
      temp = output[i];
      output[i] = output[len -1 - i];
      output[len -1 - i] = temp;  
  }
  return new String(output);
}
-----------------------------------------------------------------------------------------------------------------------


Q7.
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.
Example 1:
Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]

Example 2:
Input:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]

public int[] spiralOrder(int[][] matrix) {

int[] temp;
int x = i = j = 0;
int row = matrix[0].length, column = matrix.length;

for(i = 0, i < row/2, i++){
 for(j= 0, j < column, j++ ) {
  temp[x] = matrix[i][j]
  x++;}
 for(int a = i, a < row -i -1, a++) {
  temp[x] = matrix[a][j];
  x++;}
 for(int b=


}
}
}

-----------------------------------------------------------------------------------------------------------------------

// Q8.
// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this
// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"
// Write the code that will take a string and make this conversion given a number of rows:
// String convert(string s, int numRows);
// Example 1:
// Input: s = "PAYPALISHIRING", numRows = 3
// Output: "PAHNAPLSIIGYIR"

// Example 2:
// Input: s = "PAYPALISHIRING", numRows = 4
// Output: "PINALSIGYAHRPI"
// Explanation:

// P     I    N
// A   L S  I G
// Y A   H R
// P     I
public String convert(String s, int numRows) {
   StringBuilder temp = new StringBuilder(); 
   Char[] arr = s.toCharArray();
   
   int gap1 = (numRows - 1) * 2;
   int gap2 = (numRows - i -1) * 2;
   
   for(int i = 0; i < numRows; i++) {      
      for(j = i; j < arr.length; j= j + gap1) {
          if(i = 0 || i == numRows - 1) {
              temp.append(arr[j]);
             
          }
          if(i > 0 && i < numRows -1 && (j + gap2) < arr.length) {
              temp.append(arr[j] + arr[j + gap2]);
          }
          
      }
      
   }
   return temp.toString();
   
}
-----------------------------------------------------------------------------------------------------------------------

Q9. Explain Encapsulation with an example. (Write at least 30-40 words).

-----------------------------------------------------------------------------------------------------------------------

// Q10. What is the difference between Encapsulation and Abstraction

Abstraction is to create content without specific solutions or codes. An abstraction class can designates specific
solution to son class, which will achieve specific solution in an encapsulated way. Abstraction is a blueprint. 
Abstraction does not care about details.

But encapsulation achieves details, and only get visited by indirect ways. 
Encapsulation Gets and changes data by specific methods called "getter" and "setter" .
