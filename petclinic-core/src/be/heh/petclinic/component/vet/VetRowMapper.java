package be.heh.petclinic.component.vet;

import be.heh.petclinic.domain.Vet;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

class VetRowMapper implements RowMapper<Vet> {

    @Override
    public Vet mapRow(ResultSet rs, int line) throws SQLException {
        VetResultExtractor extractor = new VetResultExtractor();
        return extractor.extractData(rs);
    }
}
