/*
 * Copyright (c) 2019. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package seu.wh.seuwh_mstc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seu.wh.seuwh_mstc.dao.TagDao;
import seu.wh.seuwh_mstc.model.Tag;
import seu.wh.seuwh_mstc.result.ResultInfo;
import seu.wh.seuwh_mstc.service.TagService;

import java.util.List;

@Service
public class TagServiceImpl implements TagService {
    @Autowired
    TagDao tagDao;

    @Override
    public ResultInfo getAllTag() {
        List<Tag> tags=tagDao.getAllTag();
        return ResultInfo.ok(tags);
    }
}
