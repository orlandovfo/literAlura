@RestController
@RequestMapping("/api/authors")
public class AuthorController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Author> getAllAuthors() {
        return bookService.getAllAuthors();
    }
}