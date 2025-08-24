import java.util.Date;

public class Tarefas {

    //Atributos
    String descricao;
    Date dataDeVencimento;
    Boolean status;
    String categoria;

    //Construtores

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao (String descricao) {
        this.descricao = descricao;
    }

    public Date getDataDeVencimento(){
        return dataDeVencimento;
    }

    public void setDataDeVencimento(Date dataDeVencimento){
        this.dataDeVencimento = dataDeVencimento;
    }

    public Boolean getStatus(){
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

}
