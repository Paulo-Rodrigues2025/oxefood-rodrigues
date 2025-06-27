package br.com.ifpe.oxefood.api.CupomDesconto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ifpe.oxefood.modelo.cupomDesconto.CupomDesconto;
import br.com.ifpe.oxefood.modelo.cupomDesconto.CupomDescontoService;


@RestController
@RequestMapping("/api/cupomDesconto")
@CrossOrigin

public class CupomDescontoController {


@Autowired 
private CupomDescontoService cupomDescontoService;

@PostMapping
public ResponseEntity<CupomDesconto> save(@RequestBody CupomDescontoRequest request) {

    CupomDesconto cupomDesconto = cupomDescontoService.save(request.build());
    return new ResponseEntity<CupomDesconto>(cupomDesconto, HttpStatus.CREATED);
}

@GetMapping
    public List<CupomDesconto> listarTodos() {
        return cupomDescontoService.listarTodos();
    }

    @GetMapping("/{id}")
    public CupomDesconto obterPorID(@PathVariable Long id) {
        return cupomDescontoService.obterPorID(id);
    }

    @PutMapping("/{id}")
 public ResponseEntity<CupomDesconto> update(@PathVariable("id") Long id, @RequestBody CupomDescontoRequest request) {

       cupomDescontoService.update(id, request.build());
       return ResponseEntity.ok().build();
 }

 @DeleteMapping("/{id}")
   public ResponseEntity<Void> delete(@PathVariable Long id) {

       cupomDescontoService.delete(id);
       return ResponseEntity.ok().build();
   }


}

