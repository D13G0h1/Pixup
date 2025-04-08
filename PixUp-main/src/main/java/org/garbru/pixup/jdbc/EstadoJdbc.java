package org.garbru.pixup.jdbc;

import org.garbru.pixup.model.Estado;

import java.util.List;

public interface EstadoJdbc {
    List<Estado> findAll();
}
