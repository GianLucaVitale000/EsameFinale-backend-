package com.heartwoodlabs.esame.rs;


import com.heartwoodlabs.esame.dao.BaseDao;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/api")
public class RestApplication extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> classes = new HashSet<>();
        classes.add(ProdottoResource.class);
        classes.add(MarcaResource.class);


        classes.add(JacksonConfiguration.class);
        classes.add(InvalidDataExceptionMapper.class);
        classes.add(HeadersFilter.class);

        BaseDao.initFactory("DefaultPersistenceUnit");

        return classes;
    }
}
