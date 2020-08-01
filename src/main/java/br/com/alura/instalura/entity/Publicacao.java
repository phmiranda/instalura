/**
 * User: phmiranda
 * Project: instalura
 * Description: this class execute...!
 * Date: 31/07/2020
 */

package br.com.alura.instalura.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "publicacoes")
public class Publicacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}
