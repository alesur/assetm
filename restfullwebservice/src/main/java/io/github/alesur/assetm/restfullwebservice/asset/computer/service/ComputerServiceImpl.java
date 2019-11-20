package io.github.alesur.assetm.restfullwebservice.asset.computer.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Service;

@Service
public class ComputerServiceImpl implements ComputerService {

    @Autowired
    private DataSource dataSource;

    public List computerassets(long id){
        String sql = "SELECT * FROM computer";
        List<String> computerList = new ArrayList<>();
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.query(sql, new ResultSetExtractor() {
                    public List extractData(ResultSet rs) throws SQLException {

                        while (rs.next()) {
                            String name = rs.getString("name");
                            computerList.add(name);
                        }
                        return computerList;
                    }
                }
        );
        return computerList;
    }

}
