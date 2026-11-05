public class LivroServices {

    private final Livro livroRepository;

    public LivroServices(Livro livroRepository) {
        this.livroRepository = livroRepository;
    }

    public List<Livro> getAllLivros() {
        return livroRepository.findAll();
    }

    public Livro getLivroById(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    public Livro createLivro(Livro livro) {
        return livroRepository.save(livro);
    }

}