package fybug.nulll.pdutilfunctionexpand;

/**
 * @param <E> 可能抛出的异常类型
 *
 * @author fybug
 * @version 0.0.1
 * @see Runnable
 * @since pdutilfunctionexpand 0.0.1
 */
@FunctionalInterface
public
interface tryRunnable<E extends Throwable> {
  /** @see Runnable#run() */
  void run() throws E;
}
