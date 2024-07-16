package challenge.forumhub.api.domain.topico;

import java.time.LocalDateTime;

public record DadosDetalhamentoTopico(Long id, String titulo, String mensagem, LocalDateTime dataDeCriacao,
    String autor,
    String curso, Boolean status) {
  public DadosDetalhamentoTopico(Topico topico) {
    this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataDeCriacao(), topico.getAutor(),
        topico.getCurso(), topico.getStatus());

  }
}
