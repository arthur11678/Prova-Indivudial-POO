import java.util.ArrayList;



public class ArquivoAnimal extends Persistencia{
    @Override
    void inserir(Animal animal) {
        //Abrir o arquivo e fazer o append do objeto
    }
    @Override
    void excluir(Animal animal){
        //Abrir o arquivo e excluir o objeto
    }
    @Override
    ArrayList<Animal> listar() {
        //Abrir o arquivo, armazenar todos os objetos no ArrayList e retornar
    } 

    @Override
    Animal buscar(String nome){
        //Abrir o arquivo, comparar se os nome são iguais e retornar o objeto.
    }
}