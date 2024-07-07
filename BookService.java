@Service
public class BookService {
    @Value("${gutendex.api.url}")
    private String apiUrl;

    @Autowired
    private BookRepository bookRepository;

    public List<Book> searchBooksByTitle(String title) {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(apiUrl + "/books/?search=" + title))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        ObjectMapper mapper = new ObjectMapper();
        JsonNode root = mapper.readTree(response.body());

        List<Book> books = new ArrayList<>();
        root.get("results").forEach(node -> {
            Book book = mapper.convertValue(node, Book.class);
            books.add(book);
        });

        return books;
    }

    public void saveBook(Book book) {
        bookRepository.save(book);
    }
}