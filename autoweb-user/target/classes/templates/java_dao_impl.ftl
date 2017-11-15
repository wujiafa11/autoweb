package ${table.packageDaoImpl};

import ${table.packageDao}.${table.classDao};
import ${table.packageDomain}.${table.classDomain};
import com.auto.commons.core.dao.impl.BaseDao;
import com.auto.commons.core.sql.dto.DataRecord;
import com.auto.commons.core.util.JavaBeanMap;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* Created by auto build on ${now?string("yyyy/MM/dd")}.
* ${table.tableComment} ${table.classDaoImpl}
*/
@Repository
public class ${table.classDaoImpl} extends BaseDao<${table.classDomain}, Long> implements ${table.classDao} {

    private final String STATEMENT_HEAD = " ${table.packageDomain}.${table.classDomain}";

    /**
    * 查询所有${table.tableComment}
    *
    * @return
    */
    public List<${table.classDomain}> list${table.classDomain}() {
        Map<String, Object> map = new HashMap<>();
        List<DataRecord> list = super.selectForList(STATEMENT_HEAD + ".query${table.classDomain}", map);
        List<${table.classDomain}> ${table.classDomainLower}s = JavaBeanMap.convertListToJavaBean(list, ${table.classDomain}.class);
        return ${table.classDomainLower}s;
    }



    @Autowired
    public ${table.classDaoImpl}(SqlSessionFactory sqlSessionFactory) {
        super(sqlSessionFactory);
    }

    @Override
    public Class<${table.classDomain}> getClz() {
        return ${table.classDomain}.class;
    }

}
