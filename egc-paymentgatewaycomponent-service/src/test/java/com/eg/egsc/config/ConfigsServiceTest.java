package com.eg.egsc.config;

import com.eg.egsc.scp.paygateway.DemoServiceApplication;
import com.eg.egsc.scp.paygateway.dto.ConfigsDto;
import com.eg.egsc.scp.paygateway.dto.PageQueryDto;
import com.eg.egsc.scp.paygateway.service.ConfigsService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {DemoServiceApplication.class})
public class ConfigsServiceTest {

    private Logger logger = LoggerFactory.getLogger(ConfigsServiceTest.class);

    @Autowired
    private ConfigsService configsServiceImpl;

    @Test
    public void getConfigsListTest(){
        PageQueryDto pageQueryDto = new PageQueryDto();
        pageQueryDto.setPageNo(1);
        pageQueryDto.setPageSize(10);
        List<ConfigsDto> configsList = configsServiceImpl.getConfigsList(pageQueryDto);
        logger.info("数量：{}",configsList.size());
    }
}
