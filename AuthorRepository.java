public interface AuthorRepository extends JpaRepository<Author, Long> {
    List<Author> findByNameContaining(String name);
}