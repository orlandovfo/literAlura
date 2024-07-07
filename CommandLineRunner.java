@Component
public class CommandLineRunner implements ApplicationRunner {
    @Autowired
    private BookService bookService;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Opções:");
            System.out.println("1. Buscar livro por título");
            System.out.println("2. Listar todos os livros");
            System.out.println("3. Listar autores");
            System.out.println("4. Listar livros por idioma");
            System.out.println("5. Sair");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.print("Digite o título do livro: ");
                    String title = scanner.next();
                    List<Book> books = bookService.searchBooksByTitle(title);
                    System.out.println("Resultados:");
                    books.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));
                    break;
                case 2:
                    List<Book> allBooks = bookService.getAllBooks();
                    System.out.println("Todos os livros:");
                    allBooks.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));
                    break;
                case 3:
                    List<Author> authors = bookService.getAllAuthors();
                    System.out.println("Autores:");
                    authors.forEach(author -> System.out.println(author.getName()));
                    break;
                case 4:
                    System.out.print("Digite o idioma: ");
                    String language = scanner.next();
                    List<Book> booksByLanguage = bookService.getBooksByLanguage(language);
                    System.out.println("Livros em " + language + ":");
                    booksByLanguage.forEach(book -> System.out.println(book.getTitle() + " by " + book.getAuthor()));
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}