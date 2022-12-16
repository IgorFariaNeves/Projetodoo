public class Endereco {
    private String cep;
    private String rua;
    private String numero;
       private String cidade;


    public Endereco (String cep, String rua, String numero, String cidade){
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;

    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getrua() {
        return rua;
    }

    public void setrua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }



    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

