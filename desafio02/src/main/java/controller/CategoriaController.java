package controller;

import lombok.RequiredArgsConstructor;
import model.Categoria;
import org.springframework.web.bind.annotation.*;
import repository.CategoriaRepository;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api")

public class CategoriaController {

    CategoriaRepository categoriaRepository;

    // Metodo Listar categoria
        @GetMapping("/categoria")
    public List<Categoria> listCategoria(){
        return categoriaRepository.findAll();
    }

    //Metodo lista ID

    @GetMapping("/categoria/{id}")
    public List<Categoria> listaCategoriaId(@PathVariable(value = "id")int id){
            return (List<Categoria>) categoriaRepository.findById(id);
    }

    // Metodo Salvar
    @PostMapping("/Categoria")
    public Categoria salCategoria(@RequestBody Categoria categoria){
        return categoriaRepository.save(categoria);
    }

    //Metodo Atualizar a Categoria
    @PutMapping("/categoria")
    public Categoria atuCategoria(@RequestBody Categoria categoria){
            return categoriaRepository.save(categoria);
    }

    //Metodo Excluir

    @DeleteMapping("/categoria")
    public void delCategoria(@RequestBody Categoria categoria){
            categoriaRepository.delete(categoria);
    }


}
