/**
 * User: phmiranda
 * Project: instalura
 * Description: this class execute...!
 * Date: 31/07/2020
 */

package br.com.alura.instalura.repository;

import br.com.alura.instalura.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
