package factory.abstraction;

/**
 * @param <T> - Type to consume
 * @param <E> - Enum to consume
 * @author Andrei
 */
public interface AbstractFactory<T, E> {

	T create(E type);

}
