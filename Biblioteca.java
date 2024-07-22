//Maria Eduarda da Silva Lima RA: 2614561

import java.util.ArrayList;
import java.util.List;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class Biblioteca implements BibliotecaInterface {
    private List<Livro> livros;
    private List<Revista> revistas;
    private List<Manga> mangas;

    public Biblioteca() {
        this.livros = new ArrayList<>();
        this.revistas = new ArrayList<>();
        this.mangas = new ArrayList<>();


        livros.add(new Livro("Orgulho e Preconceito", "Romance"));
        livros.add(new Livro("O Paciente", "Terror/Suspense"));
        livros.add(new Livro("O Espadachim de Carvão", "Aventura"));

        revistas.add(new Revista("Gazeta Esportiva", "Esporte"));
        revistas.add(new Revista("Vogue", "Moda"));
        revistas.add(new Revista("Top Chef", "Gastronomia"));

        mangas.add(new Manga("One Piece", "Shounen"));
        mangas.add(new Manga("Vinland Saga", "Seinen"));
        mangas.add(new Manga("Kimi ni Todoke", "Shoujo"));
    }

    @Override // Sobreescrita do método acessar 
    public void acessar() {
        try {
            Class<?> cls = this.getClass();
            Method[] methods = cls.getDeclaredMethods();
            System.out.println("Métodos disponíveis na classe Biblioteca:");
            for (Method method : methods) {
                System.out.println(method.getName());
            }
        } catch (Exception e) {
            System.out.println("Erro ao listar métodos: " + e.getMessage());
        }
    }

    public void acessarLivros() {
        System.out.println("Acessando livros...");
        for (Livro livro : livros) {
            System.out.println(livro.getNome() + " - " + livro.getGenero());
        }
    }

    public void acessarRevistas() {
        System.out.println("Acessando revistas...");
        for (Revista revista : revistas) {
            System.out.println(revista.getNome() + " - " + revista.getTipo());
        }
    }

    public void acessarMangas() {
        System.out.println("Acessando mangás...");
        for (Manga manga : mangas) {
            System.out.println(manga.getNome() + " - " + manga.getEstilo());
        }
    }

    @Override // Sobreescrita do método cadastrar
    public void cadastrar() {
        
    }

    // Sobrecarga do método cadastrar
    public void cadastrarLivro() {
        try {
            Leitura leitura = new Leitura();
            Livro livro = new Livro();
            livro.setNome(leitura.entDados("Nome"));
            livro.setEditora(leitura.entDados("Editora"));
            livro.setSinopse(leitura.entDados("Sinopse"));
            livro.setAutor(leitura.entDados("Autor"));
            livro.setNumPag(Integer.parseInt(leitura.entDados("Número de Páginas")));
            livro.setGenero(leitura.entDados("Gênero"));
            livros.add(livro);
            System.out.println("Livro cadastrado com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: Número de páginas deve ser um número inteiro.");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar livro: " + e.getMessage());
        }
    }

    public void cadastrarRevista() {
        try {
            Leitura leitura = new Leitura();
            Revista revista = new Revista();
            revista.setNome(leitura.entDados("Nome"));
            revista.setEditora(leitura.entDados("Editora"));
            revista.setSinopse(leitura.entDados("Sinopse"));
            revista.setAutor(leitura.entDados("Autor"));
            revista.setNumPag(Integer.parseInt(leitura.entDados("Número de Páginas")));
            revista.setTipo(leitura.entDados("Tipo"));
            revistas.add(revista);
            System.out.println("Revista cadastrada com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: Número de páginas deve ser um número inteiro.");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar revista: " + e.getMessage());
        }
    }

    public void cadastrarManga() {
        try {
            Leitura leitura = new Leitura();
            Manga manga = new Manga();
            manga.setNome(leitura.entDados("Nome"));
            manga.setEditora(leitura.entDados("Editora"));
            manga.setSinopse(leitura.entDados("Sinopse"));
            manga.setAutor(leitura.entDados("Autor"));
            manga.setNumPag(Integer.parseInt(leitura.entDados("Número de Páginas")));
            manga.setEstilo(leitura.entDados("Estilo"));
            mangas.add(manga);
            System.out.println("Mangá cadastrado com sucesso!");
        } catch (NumberFormatException e) {
            System.out.println("Erro: Número de páginas deve ser um número inteiro.");
        } catch (Exception e) {
            System.out.println("Erro ao cadastrar mangá: " + e.getMessage());
        }
    }
}