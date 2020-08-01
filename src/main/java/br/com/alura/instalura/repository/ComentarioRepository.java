/**
 * User: phmiranda
 * Project: instalura
 * Description: this class execute...!
 * Date: 01/08/2020
 */

package br.com.alura.instalura.repository;

import br.com.alura.instalura.entity.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
