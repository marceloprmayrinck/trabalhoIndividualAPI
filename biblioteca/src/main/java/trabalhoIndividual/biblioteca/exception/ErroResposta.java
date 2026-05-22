package trabalhoIndividual.biblioteca.exception;


import java.time.LocalDateTime;
import java.util.List;

public class ErroResposta {

    private Integer status;
    private String titulo;
    private LocalDateTime dataAtual;
    private List<String> erros;

    public ErroResposta(Integer status, String titulo, LocalDateTime dataAtual, List<String> erros) {
        this.status = status;
        this.titulo = titulo;
        this.dataAtual = dataAtual;
        this.erros = erros;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public LocalDateTime getDataHora() {
        return dataAtual;
    }

    public void setDataHora(LocalDateTime dataAtual) {
        this.dataAtual = dataAtual;
    }

    public List<String> getErros() {
        return erros;
    }

    public void setErros(List<String> erros) {
        this.erros = erros;
    }
}
