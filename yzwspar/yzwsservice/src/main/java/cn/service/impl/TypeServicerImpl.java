package cn.service.impl;

import cn.dao.TypeDao;
import cn.pojo.Type;
import cn.service.TypeService;
import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("usi")
public class TypeServicerImpl implements TypeService {
    @Resource
    private TypeDao uid;

    public TypeDao getUid() {
        return uid;
    }

    public void setUid(TypeDao uid) {
        this.uid = uid;
    }

    @Override
    public String sel() {
        List<Type> sel = uid.sel();
        return JSON.toJSONString(sel);
    }
}
