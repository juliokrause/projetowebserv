package br.pucpr.servico;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/aluno")
public class AlunoResource {

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


    @GetMapping("/consulta/{id}")


            public aluno consulta(@PathVariable("id") int id){
            aluno a = new aluno();

            a.setId(id);
            a.setNome("Fujioka");
            a.setMatricula("1234");

            return a;

        }


        @PostMapping
        public aluno incluirAluno(@RequestBody aluno aluno){

            return aluno;




        }


}
