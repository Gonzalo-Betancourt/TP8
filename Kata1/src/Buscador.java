import java.util.Collection;

public class Buscador<T extends Identificable<K>, K> {

    public T buscar(Collection<? extends T> elementos, K id) {
        for (T e : elementos) {
            if (e.tieneMismoID(id)) {
                return e;
            }
        }
        return null;
    }

}