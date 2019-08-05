package com.xh.util;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author xiaohe
 * @version V1.0.0
 */
public class FakerUtilTest {

    private static long MIN_NUM = 4;
    private static long MAX_NUM = 20;

    private Logger logger = LoggerFactory.getLogger(FakerUtilTest.class);

    @Test
    public void testFaker() {
        logger.info("                                ");
        logger.info("================ start test full name =====================");
        long cycleFullNameNum = FakerUtil.randomNum(FakerUtilTest.MIN_NUM, FakerUtilTest.MAX_NUM);
        for (int i = 0; i < cycleFullNameNum; i++) {
            logger.info("full name : [{}]", FakerUtil.fullName());
        }
        logger.info("================ start test full name =====================");

        logger.info("                                ");
        logger.info("================ start test name =====================");
        long cycleNameNum = FakerUtil.randomNum(FakerUtilTest.MIN_NUM, FakerUtilTest.MAX_NUM);
        for (int i = 0; i < cycleNameNum; i++) {
            logger.info("full name : [{}]", FakerUtil.name());
        }
        logger.info("================ end test name =====================");

        logger.info("                                ");
        logger.info("================ start test app name =====================");
        long cycleAppNameNum = FakerUtil.randomNum(FakerUtilTest.MIN_NUM, FakerUtilTest.MAX_NUM);
        for (int i = 0; i < cycleAppNameNum; i++) {
            logger.info("full name : [{}]", FakerUtil.appName());
        }
        logger.info("================ end test app name =====================");

        logger.info("                                ");
        logger.info("================ start test food =====================");
        long cycleFoodNum = FakerUtil.randomNum(FakerUtilTest.MIN_NUM, FakerUtilTest.MAX_NUM);
        for (int i = 0; i < cycleFoodNum; i++) {
            logger.info("full name : [{}]", FakerUtil.food());
        }
        logger.info("================ end test food =====================");

        logger.info("                                ");
    }

}
