package ${table.packageServiceImpl};

import ${table.packageDomain}.${table.classDomain};
import ${table.packageDao}.${table.classDomain}Dao;
import ${table.packageService}.${table.classService};
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by auto build on ${now?string("yyyy/MM/dd")}.
* ${table.tableComment} ${table.classServiceImpl}
*/
@Service
@Transactional
public class ${table.classServiceImpl} implements ${table.classService} {

    private static final Logger LOGGER = LoggerFactory.getLogger(${table.classServiceImpl}.class);

    @Resource
    private ${table.classDao} ${table.classDaoLower};

    /**
    * 查询所有${table.tableComment}
    *
    * @return
    */
    public List<${table.classDomain}> list${table.classDomain}() {
        List<${table.classDomain}> ${table.classDomainLower}s = ${table.classDaoLower}.list${table.classDomain}();
        return ${table.classDomainLower}s;
    }

    /**
    * 查询单个${table.tableComment}
    * @param ${table.pk}
    * @return
    */
    public ${table.classDomain} get${table.classDomain}(Long ${table.pk}){
        return ${table.classDaoLower}.get(${table.pk});
    }

    /**
    * 修改${table.tableComment}
    * @param ${table.classDomainLower}
    * @return
    */
    public int update${table.classDomain}(${table.classDomain} ${table.classDomainLower}){
        return ${table.classDaoLower}.update(${table.classDomainLower});
    }

    /**
    * 删除${table.tableComment}
    * @param ${table.pk}
    * @return
    */
    public int delete${table.classDomain}(Long ${table.pk}){
        return ${table.classDaoLower}.delete(${table.pk});
    }

}
