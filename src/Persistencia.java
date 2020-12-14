import java.util.ArrayList;

abstract class Persistencia {
    abstract void inserir(Object o);
    abstract void excluir(Object o );
    abstract ArrayList listar();
    abstract Object buscar(Object o); 
}
