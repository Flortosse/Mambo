package org.mambo.shared.database.impl.internal;

import com.google.common.base.Supplier;
import net.sf.cglib.proxy.Dispatcher;
import net.sf.cglib.proxy.Enhancer;
import org.mambo.shared.database.EntityInterface;
import org.mambo.shared.database.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Blackrush
 * Date: 09/12/12
 * Time: 10:34
 */
public final class References {
    private References() {}

    @SuppressWarnings("unchecked")
    public static <E extends EntityInterface<?>> E create(final Repository<E> repository, final EntityMetadata metadata, final Object id) {
        return (E) Enhancer.create(metadata.getEntityClass(), new Dispatcher() {
            @Override
            public Object loadObject() throws Exception {
                return repository.find(id);
            }
        });
    }

    @SuppressWarnings("unchecked")
    public static <E extends EntityInterface<?>> E of(final Class<E> clazz, final Supplier<E> supplier) {
        return (E) Enhancer.create(clazz, new Dispatcher() {
            public Object loadObject() throws Exception {
                return supplier.get();
            }
        });
    }
}