package com.xh.util;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Locale;

/**
 * 官网 : http://paraseba.github.io/faker/
 *
 * @author xiaohe
 * @version V1.0.0
 */
public class FakerUtil {

    private static Logger logger = LoggerFactory.getLogger(FakerUtil.class);

    /**
     * language
     */
    private static final String LANGUAGE = "zh-CN";

    /**
     * 创建一个 Faker 对象
     * Faker 方法调用时会随机访问底层数据，因此不需要每次都创建一个实例
     * Java Faker 通过 /src/main/resources 中的 .yml 获取数据
     * <p>
     * language - default EN  英文
     * de 德语
     * </p>
     */
    private static Faker faker = new Faker(new Locale(FakerUtil.LANGUAGE));

    // ====================== random num ===================================

    public static long randomNum() {
        logger.info("min : [{}], max : [{}]", Long.MIN_VALUE, Long.MAX_VALUE);
        return randomNum(Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public static long randomNum(long min, long max) {
        return faker.number().numberBetween(min, max);
    }

    // ====================== random name ===================================

    public static String fullName() {
        return faker.name().fullName();
    }

    public static String name() {
        return faker.name().name();
    }

    public static String appName() {
        return faker.app().name();
    }

    public static String food() {
        return faker.food().ingredient();
    }

    public static String title() {
        return faker.name().title();
    }

    public static String streetAddress() {
        return faker.address().streetAddress();
    }

    public static String cityName() {
        return faker.address().cityName();
    }

    public static String country() {
        return faker.address().country();
    }

}
