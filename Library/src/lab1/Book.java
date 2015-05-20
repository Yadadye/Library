
 */
public Book(String bookTitle) {
// TODO: Implement this method
 title = bookTitle;
 borrowed = false;
}

public void rented() {
// TODO: Implement this method
 borrowed = true;
}
/**
@@ -36,6 +39,7 @@ public void rented() {
*/
public void returned() {
// TODO: Implement this method
 borrowed = false;
}
/**
@@ -44,6 +48,7 @@ public void returned() {
*/
public boolean isBorrowed() {
// TODO: Implement this method
 return borrowed;
}
/**
@@ -52,16 +57,17 @@ public boolean isBorrowed() {
*/
public String getTitle() {
// TODO: Implement this method
 return title;
}
public static void main(String[] arguments) {
// Small test of the Book class
Book example = new Book("The Da Vinci Code");
System.out.println("Title (should be The Da Vinci Code): " + example.getTitle());
 System.out.println("Borrowed? (should be false): " + example.isBorrowed());
 System.out.println("Rented? (should be false): " + example.isBorrowed());
example.rented();
 System.out.println("Borrowed? (should be true): " + example.isBorrowed());
 System.out.println("Rented? (should be true): " + example.isBorrowed());
example.returned();
 System.out.println("Borrowed? (should be false): " + example.isBorrowed());
 System.out.println("Rented? (should be false): " + example.isBorrowed());
}
} 