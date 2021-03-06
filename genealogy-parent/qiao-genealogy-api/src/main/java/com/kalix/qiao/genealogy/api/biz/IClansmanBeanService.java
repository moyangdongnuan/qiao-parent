package com.kalix.qiao.genealogy.api.biz;

import com.kalix.framework.core.api.biz.IBizService;
import com.kalix.qiao.genealogy.api.dto.ClansmanDTO;
import com.kalix.qiao.genealogy.entities.ClansmanBean;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * Created by Administrator on 2018/5/13.
 */
public interface IClansmanBeanService extends IBizService<ClansmanBean> {

    void deleteByGenealogyId(long id);

    ClansmanDTO getClansmanByGenealogyId(int genealogyId, String jsonStr);

    String deleteOneAndChildrens(long id);

}
