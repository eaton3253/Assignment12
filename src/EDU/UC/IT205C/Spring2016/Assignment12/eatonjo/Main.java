/* Name: Jerry Eaton
   Assignment #: 11
   Due Date: 4-19-2016
   Course/Section/Term yr:  Computer Programming II  IT2045C  Spring 2016
   
   Program Description:
   https://projecteuler.net/problem=30
   
   Digit fifth powers
   Problem 30

  Surprisingly there are only three numbers that can be written as the sum of fourth powers of their digits:

   1634 = 14 + 64 + 34 + 44
    8208 = 84 + 24 + 04 + 84
   9474 = 94 + 44 + 74 + 44

   As 1 = 14 is not a sum it is not included.

The sum of these numbers is 1634 + 8208 + 9474 = 19316.

Find the sum of all the numbers that can be written as the sum of fifth powers of their digits.

references:
  fifth power sum method developed from algorithm given on white board in class   
   */

package EDU.UC.IT205C.Spring2016.Assignment12.eatonjo;

public class Main {
	public static void main(String[] args) {		

		  int sum = 0; 
		  //for (int i = 10000; i < Integer.MAX_VALUE; i++) {   //this ran for hours so changed to a lower value
		  for (int i = 10; i < 1000000; i++) { 
		    if (i == fifthpowertotal(i)) {
			   System.out.println(Integer.toString(i)); 
		       sum = sum + i; 
		       //System.out.println("  running total: " + Integer.toString(sum));  //debug	       
		    }
		  } 
		   System.out.println("total " + Integer.toString(sum));
		 } 

		 private static int fifthpowertotal(int num) { 
		  int total = 0; 
	      int digit;
		  
		   while (num != 0) { 
		     digit = num % 10; 
		     total = (int) (total + Math.pow(digit, 5)); 
		     num = num / 10; 
		   } 	   
		  return total; 
		 } 

	}


