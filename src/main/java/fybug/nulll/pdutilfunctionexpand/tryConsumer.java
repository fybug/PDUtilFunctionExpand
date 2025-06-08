package fybug.nulll.pdutilfunctionexpand;
import java.util.function.Consumer;

/**
 * @param <T> 传入的参数类型
 * @param <E> 可能抛出的异常类型
 *
 * @author fybug
 * @version 0.0.1
 * @see Consumer
 * @since pdutilfunctionexpand 0.0.1
 */
@FunctionalInterface
public
interface tryConsumer<T, E extends Throwable> {
  /** @see Consumer#accept(Object) */
  void accept(T t) throws E;
}
