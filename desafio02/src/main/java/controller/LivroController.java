package controller;

import lombok.RequiredArgsConstructor;
import model.Categoria;
import model.Livro;
import org.springframework.web.bind.annotation.*;
import repository.CategoriaRepository;
import repository.LivroRepository;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")
public class LivroController {

    LivroRepository livroRepository;

    // Metodo Listar livro
    @GetMapping("/livro")
    public List<Livro> listLivro(){
        return livroRepository.findAll();
    }

    //Metodo lista ID

    @GetMapping("/livro/{id}")
    public List<Livro> listLivroId(@PathVariable(value = "id")int id){
        return (List<Livro>) livroRepository.findById(id);
    }

    // Metodo Salvar
    @PostMapping("/livro")
    public Livro salLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    //Metodo Atualizar a Categoria
    @PutMapping("/livro")
    public Livro atuLivro(@RequestBody Livro livro){
        return livroRepository.save(livro);
    }

    //Metodo Excluir

    @DeleteMapping("/livro")
    public void delLivro(@RequestBody Livro livro){
        livroRepository.delete(livro);
    }
}
