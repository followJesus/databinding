package com.example.cunli.databing.web;

import java.util.Date;

/**
 * Created by cunli on 16-8-16.
 */
public class TeachLog {
    private int id;
    private String zhuanye;
    private String oneTwo;
    private String threFour;
    private String fiveSix;
    private String sevenEight;
    private Date createDate;


    /**
     * 默认的构造方法
     */
    public TeachLog() {
        super();
    }

    /**
     * @param id
     * @param zhuanye
     * @param oneTwo
     * @param threFour
     * @param fiveSix
     * @param sevenEight
     * @param createDate
     */
    public TeachLog(String zhuanye, String oneTwo, String threFour, String fiveSix, String sevenEight) {
        super();
        this.zhuanye = zhuanye;
        this.oneTwo = oneTwo;
        this.threFour = threFour;
        this.fiveSix = fiveSix;
        this.sevenEight = sevenEight;
    }

    /**
     * @return 上课日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param 上课日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id
     *            the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return 专业
     */
    public String getZhuanye() {
        return zhuanye;
    }

    /**
     * @param zhuanye
     *            专业
     */
    public void setZhuanye(String zhuanye) {
        this.zhuanye = zhuanye;
    }

    /**
     * @return 第一二节课
     */
    public String getOneTwo() {
        return oneTwo;
    }

    /**
     * @param oneTwo
     *            第一二节课
     */
    public void setOneTwo(String oneTwo) {
        this.oneTwo = oneTwo;
    }

    /**
     * @return 第三四节课
     */
    public String getThreFour() {
        return threFour;
    }

    /**
     * @param threFour
     *            第三四节课
     */
    public void setThreFour(String threFour) {
        this.threFour = threFour;
    }

    /**
     * @return 第五六节课
     */
    public String getFiveSix() {
        return fiveSix;
    }

    /**
     * @param fiveSix
     *            第五六节课
     */
    public void setFiveSix(String fiveSix) {
        this.fiveSix = fiveSix;
    }

    /**
     * @return 第七八节课
     */
    public String getSevenEight() {
        return sevenEight;
    }

    /**
     * @param sevenEight
     *            第七八节课
     */
    public void setSevenEight(String sevenEight) {
        this.sevenEight = sevenEight;
    }

}
