package com.wacai.pt.goodjob.mapper;

import com.wacai.pt.goodjob.vo.TaskParamVo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xuanwu on 16/3/29.
 */
@Repository
public interface TaskParamMapper {
    List<TaskParamVo> findTaskParamVoById(@Param("task_config_id") Integer task_config_id);
}
