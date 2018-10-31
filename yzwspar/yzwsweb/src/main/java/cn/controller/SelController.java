package cn.controller;

import cn.service.TypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@RequestMapping("haha/")
@Controller
public class SelController {
    @Resource
    private TypeService uis;

    public TypeService getUis() {
        return uis;
    }

    public void setUis(TypeService uis) {
        this.uis = uis;
    }
    @ResponseBody
    @RequestMapping(value="getall")
    public String asd(){

        return uis.sel();
    }
}
