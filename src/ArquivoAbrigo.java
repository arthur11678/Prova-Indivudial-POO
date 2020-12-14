public class ArquivoAbrigo extends Persistencia {
    @Override
    void inserir(Abrigo abrigo) {
        //Abrir o arquivo e fazer o append do objeto
    }
    @Override
    void excluir(Abrigo abrigo){
        //Abrir o arquivo e excluir o objeto
    }
    @Override
    ArrayList<Abrigo> listar() {
        //Abrir o arquivo, armazenar todos os objetos no ArrayList e retornar
    } 

    @Override
    Animal buscar(String nome){
        //Abrir o arquivo, comparar se os nome são iguais e retornar o objeto.
    }
}
