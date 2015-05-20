public class Library {
// TODO: Add the missing implementation to this class
 String address;
 java.util.ArrayList<Book> books;

 public static final String openTime = "9am";
 public static final String closeTime = "5pm";

 public Library(String libraryAddress) {
 address = libraryAddress;
 books = new java.util.ArrayList<Book>();
 }

 public void addBook(Book book) {
 books.add(book);
 }

 public static void printOpeningHours() {
 System.out.println("Libraries are open daily from " + openTime + " to " + closeTime);
 }

 public void printAddress() {
 System.out.println(address);
 }

 public void printAvailableBooks() {
 boolean bookPresent = false;
 for (Book book : books) {
 if (!book.isBorrowed()) {
 System.out.println(book.getTitle());
 bookPresent = true;
 }
 }
 if (!bookPresent) {
 System.out.println("No book in catalog");
 }
 }

 public void borrowBook(String title) {
 int found = 0;
 for (Book book : books) {
 if (book.getTitle().equals(title)) {
 if (found == 0) {
 found = 1;
 }
 if (!book.isBorrowed()) {
 book.rented();
 found = 2;
 break;
 };
 }
 }
 if (found == 0) {
 System.out.println("Sorry, this book is not in our catalog.");
 } else if (found == 1) {
 System.out.println("Sorry, this book is already borrowed.");
 } else if (found == 2) {
 System.out.println("You successfully borrowed " + title);
 }
 }

 public void returnBook(String title) {
 boolean found = false;
 for (Book book : books) {
 if (book.getTitle().equals(title) && book.isBorrowed()) {
 book.returned();
 found = true;
 break;
 }
 }
 if (found) {
 System.out.println("You successfully returned " + title);
 }
 }
public static void main(String[] args) {
// Create two libraries