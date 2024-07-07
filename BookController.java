@RestController
@RequestMapping("/api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{title}")
    public List<Book> getBooksByTitle(@PathVariable String title) {
        return bookService.searchBooksByTitle(title);
    }

    @GetMapping("/language/{language}")
    public List<Book> getBooksByLanguage(@PathVariable String language) {
        return bookService.getBooksByLanguage(language);
    }
}