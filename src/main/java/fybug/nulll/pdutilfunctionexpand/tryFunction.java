package fybug.nulll.pdutilfunctionexpand;
import java.util.function.Function;

/**
 * @param <T> 传入的参数类型
 * @param <R> 返回的参数类型
 * @param <E> 可能抛出的异常类型
 *
 * @author fybug
 * @version 0.0.1
 * @see Function
 * @since pdutilfunctionexpand 0.0.1
 */
@FunctionalInterface
public
interface tryFunction<T, R, E extends Throwable> {
  /** @see Function#apply(Object) */
  R apply(T t) throws E;
}
