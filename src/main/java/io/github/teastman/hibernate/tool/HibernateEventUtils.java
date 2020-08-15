package io.github.teastman.hibernate.tool;


import org.hibernate.event.spi.AbstractPreDatabaseOperationEvent;
import org.hibernate.event.spi.PostDeleteEvent;
import org.hibernate.event.spi.PostInsertEvent;
import org.hibernate.event.spi.PostUpdateEvent;
import org.hibernate.event.spi.PreDeleteEvent;
import org.hibernate.event.spi.PreInsertEvent;
import org.hibernate.event.spi.PreUpdateEvent;
import org.hibernate.event.spi.SaveOrUpdateEvent;
import org.hibernate.persister.entity.EntityPersister;
import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

/**
 * Utility class for working with Hibernate spi events.
 *
 * @author Tyler Eastman
 */
@SuppressWarnings("unused")
public class HibernateEventUtils {

    public static int getPropertyIndex(@NotNull AbstractPreDatabaseOperationEvent event, String property){
        return getPropertyIndex(event.getPersister(), property);
    }

    public static int getPropertyIndex(PreUpdateEvent event, String property){
        return getPropertyIndex(event.getPersister(), property);
    }

    public static int getPropertyIndex(PreInsertEvent event, String property){
        return getPropertyIndex(event.getPersister(), property);
    }

    public static int getPropertyIndex(PreDeleteEvent event, String property){
        return getPropertyIndex(event.getPersister(), property);
    }

    public static int getPropertyIndex(PostUpdateEvent event, String property){
        return getPropertyIndex(event.getPersister(), property);
    }

    public static int getPropertyIndex(PostInsertEvent event, String property){
        return getPropertyIndex(event.getPersister(), property);
    }

    public static int getPropertyIndex(PostDeleteEvent event, String property){
        return getPropertyIndex(event.getPersister(), property);
    }

    public static int getPropertyIndex(SaveOrUpdateEvent event, String property){
        return getPropertyIndex(event.getEntry().getPersister(), property);
    }

    public static int getPropertyIndex(EntityPersister persister, String property){
        return Arrays.asList(persister.getPropertyNames()).indexOf(property);
    }
}
