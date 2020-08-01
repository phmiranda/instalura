/**
 * User: phmiranda
 * Project: instalura
 * Description: this class execute...!
 * Date: 01/08/2020
 */

package br.com.alura.instalura.controller;

import br.com.alura.instalura.repository.ComentarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comentarios")
public class ComentarioController {
    @Autowired
    private ComentarioRepository comentarioRepository;

    @GetMapping
    public void index() {

    }
}
