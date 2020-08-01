/**
 * User: phmiranda
 * Project: instalura
 * Description: this class execute...!
 * Date: 31/07/2020
 */

package br.com.alura.instalura.controller;

import br.com.alura.instalura.repository.PublicacaoRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/publicacoes")
public class PublicacaoController {
    @Autowired
    PublicacaoRespository publicacaoRespository;

    @GetMapping
    public void index() {

    }
}
