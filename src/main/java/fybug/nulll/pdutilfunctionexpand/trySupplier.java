package fybug.nulll.pdutilfunctionexpand;
import java.util.function.Supplier;

/**
 * @param <R> 返回的参数类型
 * @param <E> 可能抛出的异常类型
 *
 * @author fybug
 * @version 0.0.1
 * @see Supplier
 * @since pdutilfunctionexpand 0.0.1
 */
@FunctionalInterface
public
interface trySupplier<R, E extends Throwable> {
  /** @see Supplier#get() */
  R get() throws E;
}
