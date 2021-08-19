package br.pucpr.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping ("/produto")
public class ProdutoResource {


    produto produto;

    @GetMapping("/consulta")
    public String consulta(){

        return "Chamado endpoint de consulta";

    }

//
//    @PostMapping
//    public String incluir(String nome){
//
//        return "Incluindo um nome";
//
//
//    }


//    @GetMapping("/{id}")
//    public produto consulta(@PathVariable("id") int id){
//
//        return Produtos.get(id);
//
//    }

    @GetMapping("/produto/{id}")
    public produto add(@PathVariable("id") int id){
        produto a = new produto();

        a.setId(id);
        a.setNome("Nescau");
        a.setcodigo("3000");

        return a;

    }

    @GetMapping("/produto/")
    public produto primeiroEndPointGetHello() {
        return produto;
    }



    @PostMapping
    public produto Produto(@RequestBody produto produto){

        return produto;


    }

    @GetMapping("/produto/")
    public produto listagem(@PathVariable("id") int id){
        produto a = new produto();

        a.setId(id);
        a.setNome("Nescau");
        a.setcodigo("3000");

        return a;

    }




    @DeleteMapping("/produto/{id}")
    public produto delete(@PathVariable("id") int id) {
        return produto;
    }


    @PutMapping("/produto")
    public produto put() {
        return produto;
    }







}
