
package meuprojeto;

public class Livro {
    // os atributos
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;
    //os metodos
    void mostrarDetalhes(){
        String mensagem="Mostrando mensagens declaradas";
        System.out.println(mensagem);
        System.out.println("Nome: "+nome);
        System.out.println("Descrição: "+descricao);
        System.out.println("Valor: "+valor);
        System.out.println("ISBN: "+isbn);
        if(this.temAutor()){
        autor.MostrarDetalhes();
        }
        System.out.println("--");
    }
    
    ///
    public void aplicaDescontoDe(double porcentagem){
        this.valor-=this.valor*porcentagem;
    }
    ///
    boolean temAutor(){
        return this.autor !=null;
    }
    ///
}
