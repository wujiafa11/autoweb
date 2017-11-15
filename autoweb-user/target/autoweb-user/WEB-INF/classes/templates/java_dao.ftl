package ${table.packageDao};

import ${table.packageDomain}.${table.classDomain};
import com.auto.commons.core.dao.IBaseDao;
import org.springframework.stereotype.Component;

import java.util.List;

/**
* Created by auto build on ${now?string("yyyy/MM/dd")}.
* ${table.tableComment} ${table.classDao}
*/
@Component
public interface ${table.classDao} extends IBaseDao<${table.classDomain}, Long> {

    /**
    * 查询所有${table.tableComment}
    *
    * @return
    */
    List<${table.classDomain}> list${table.classDomain}();

}
