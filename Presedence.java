/*Write a java program to print the results of the following operations
Test data:
a.-5+8*6
b.(55+9)%9
c.20+-3*5/8
d.5+15/3*2-8%3
*/
class Presedence {
    public static void main(String[] args) {
        
        System.out.println("a.  "+(-5+8*6));

        System.out.println("b. "+(55+9)%9);

        System.out.println("c. "+(20+-3*5/8));

        System.out.println("d. "+(5+15/3*2-8%3));

    }
}