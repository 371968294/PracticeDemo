package com.huskey.util;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Husky on 16/1/5.
 */
public interface RowMapper {
    public Object mapRow(ResultSet rs, int index)
            throws SQLException;
}
