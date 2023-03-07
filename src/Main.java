public class Main {

    public static void main(String[] args) {
        Author author1 = new Author("Андрей", "Бурунов");
        Author author2 = new Author("Алексей", "Масляков");
        Author author3 = new Author("Алексей", "Бусляков");
        System.out.println(author1);
        System.out.println(author2);
        System.out.println(author2.equals(author3));
        System.out.println(author3.hashCode());
        System.out.println(author2.hashCode());


        Book book1 = new Book("Тихий дом", author1, 1997);
        Book book2 = new Book("Шумный дом", author2, 1997);
        Book book3 = new Book("Шумный дом", author3, 1997);
        System.out.println(book3.equals(book2));
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());


        System.out.println(book1);
        System.out.println(book2);


    }
}